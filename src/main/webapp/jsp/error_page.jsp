<%-- 
    Document   : error_page : 如果是基數則會導到這裡的錯誤訊息
    Created on : 2021/6/25, 下午 09:30:02
    Author     : boddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=exception.getMessage() %></h1>
    </body>
</html>
