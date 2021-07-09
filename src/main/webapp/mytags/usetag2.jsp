<%-- 
    Document   : usetag2 : 自訂名為 hello 的 tag
    Created on : 2021/7/5, 下午 09:13:40
    Author     : boddy
--%>

<%@page import="java.util.Date"%>
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
            <my:hello />
        </h1>
        
        <h1>
            <my:welcome username="John" >
                現在時刻:<%=new Date() %>
            </my:welcome>
        </h1>
                                 
    </body>
</html>
