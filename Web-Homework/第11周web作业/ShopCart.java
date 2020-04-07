package jsp2;

import java.util.Vector;
public class ShopCart
{
Vector v=new Vector();
String submit=null;
String item=null;

public void addItem(String name)
{
v.addElement(name);
}
public void removeItem(String name)
{
v.removeElement(name);
}
public void setItem(String name)
{
item=name;
}
public String getItem()
{
return this.item;
}
public void setSubmit(String s)
{
submit=s;
}
public String getSubmit()
{
return this.submit;
}
public String[] getItems()
{
String[] s=new String[v.size()];
v.copyInto(s);
return s;
}
public void reset()
{
submit=null;
item=null;
}
}
