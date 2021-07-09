<%-- 
    Document   : usetag4 : 自訂名為 exchange 的 tag
    Created on : 2021/7/5, 下午 09:13:40
    Author     : boddy
--%>

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
            <my:exchange symbol="USDTWD=x" />
        </h1>
        
        <h1>
            <my:exchange symbol="123456" />
        </h1>
        
        <h1>
            <my:exchange symbol="USDTWD=y" />
        </h1>
               
    </body>
</html>
