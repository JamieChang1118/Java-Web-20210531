<%-- 
    Document   : usetag7
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
            <my:circleArea r="10" mode="1" />
        </h1>
        <h1>
            <my:circleArea r="10" mode="2" />
        </h1>
        <h1>
            <my:circleArea r="10" mode="3" />
        </h1>
           
    </body>
</html>
