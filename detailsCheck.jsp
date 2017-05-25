<%@ page contentType = "text/xml" %>
<%
String username = request.getParameter("username").toString();
String password = request.getParameter("password").toString();
String status;
if(username.equals("admin") && password.equals("admin"))
	status = "true";
else
	status = "false";
%>
<userdetails>
   <author>
     Suvojit kar
   </author>
   <user>
      <name><% out.println(username); %></name>
      <status><% out.println(status); %></status>
   </user>
</userdetails>
