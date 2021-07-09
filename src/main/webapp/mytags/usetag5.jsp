<%-- 
    Document   : usetag5 : 自訂名為 loop 的 tag
    Created on : 2021/7/5, 下午 09:13:40
    Author     : boddy
--%>

<%@page import="java.util.Random"%>
<%@taglib prefix="my" uri="/tlds/mytld"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               
        <h1>
            <my:loop count="3" >
                Java
            </my:loop>
        </h1>
        
        <h1>
            <my:lotto count="5" >
                <%=new Random().nextInt(100)+1 %>
            </my:lotto>
        </h1>
           
    </body>
</html>
