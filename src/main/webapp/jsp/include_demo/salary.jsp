<%-- 
    Document   : salary
    Created on : 2021/6/28, 下午 07:20:03
    Author     : boddy
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%=new Random().nextInt(100000) %>
        </h1>
        <%=request.getParameter("message") %><p />
        ${ param.message }<p />
        ${ paramValues.salary[0] }<p />
        ${ paramValues.salary[1] }<p />
        ${ paramValues.salary[0] + paramValues.salary[1] }<p />
    </body>
</html>
