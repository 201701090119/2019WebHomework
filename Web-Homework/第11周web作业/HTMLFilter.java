package jsp2;

public class HTMLFilter
{
public static String filter(String message)
{
if(message==null)
return(null);
char content[]=new char[message.length()];
message.getChars(0,message.length(),content,0); //����message��content
StringBuffer result=new StringBuffer(content.length+50);
for(int i=0;i<content.length;i++)
{
switch(content[i])
{
case '<':
result.append("<");
break;
case '>':
result.append(">");
break;
case '&':
result.append("&");
break;
case '"':
result.append(" ");
break;
default:
result.append(content[i]);
}
}
return(result.toString());
}
}