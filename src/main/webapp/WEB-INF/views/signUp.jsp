<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>this is a login demo</title>
</head>
<body>
<div id="loginpanelwrap">
  	
      <div>${errorMessage}</div>
      <form action="regist" method="post"> 
        <div class="loginform_row">
        <label>Username:</label>
        <input type="text" class="loginform_input" name="userName" />
        </div>
        <div class="loginform_row">
        <label>Password:</label>
        <input type="text" class="loginform_input" name="password" />
        </div>
        
        <div class="loginform_row">
        <label>Realname:</label>
        <input type="text" class="loginform_input" name="realName" />
        </div>
        
        <div class="loginform_row">
        <input type="submit" class="loginform_submit" value="Sign Up" />
        </div> 
       </form> 
 

</div>

    	
</body>
</html>