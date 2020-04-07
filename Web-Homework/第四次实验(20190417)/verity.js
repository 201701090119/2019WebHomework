  function verify(){
                        var username=document.getElementById("username");
                        var age=document.getElementById("age");
                        var pass=document.getElementById("pass");
                        var conpass=document.getElementById("conpass");
                        var email=document.getElementById("email");
                        if(username.value==""){
                                nameerror.style.display="";
                        }else{ 
                                nameerror.style.display="none";
                               }
                        if(parseInt(age.value)<=17)
                         {
                               ageerror.style.display=""
                         }else{ ageerror.style.display="none"}
                       if(pass.value.length<8)
                       {
                           passerror.style.display="";
                       }else{ passerror.style.display="none";}
                       if(pass.value!=conpass.value)
                       {
                             conpasserror.style.display="";
                        }else{ conpasserror.style.display="none";}
                       if(email.value.indexOf("@",1)==-1)
                         {
                           eerror.style.display="";
                         }else{eerror.style.display="none";}
                       
          } 
function sub(){
                      var username=document.getElementById("username");
                        var age=document.getElementById("age");
                        var pass=document.getElementById("pass");
                        var conpass=document.getElementById("conpass");
                        var email=document.getElementById("email");
                      var check=false;
            if(username.value=="")
                  {
                    alert("提交失败");
                   }if(parseInt(age.value)<=17)
                   {alert("提交失败");}
                       if(pass.value.length<8)
                           {alert("提交失败");}
                             if(pass.value!=conpass.value&&email.value.indexOf("@",1)==-1)
                             {alert("提交失败");}
                    else {alert("提交成功");
                        check=true;
                      
                        }
          return check;
               }