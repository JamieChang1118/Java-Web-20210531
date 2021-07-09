<%-- 
    Document   : usetag3 : 自訂名為 bmi 的 tag，並計算出結果
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
            <my:bmi w="60" h="170" />
        </h1>
        
        <h1>
            <my:bmi w="60" h="170" result="true" />
        </h1>
        
        <h1>
            <my:bmi w="60" h="170" result="false" />
        </h1>
              
    </body>
</html>
