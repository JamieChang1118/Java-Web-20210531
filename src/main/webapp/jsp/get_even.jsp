<%-- 
    Document   : get_even
    Created on : 2021/6/25, 下午 09:27:04
    Author     : boddy
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@page errorPage="error_page.jsp"%>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                int n = new Random().nextInt(100);
                if(n % 2 == 0){
                    out.print(n);
                } else {
                    throw new Exception(n + "不是偶數");
                }
            %>
        </h1>
    </body>
</html>
