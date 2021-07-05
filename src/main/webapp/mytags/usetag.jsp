<%-- 
    Document   : usetag : 自訂標籤的基礎應用
    Created on : 2021/7/5, 下午 08:27:33
    Author     : boddy
--%>

<%@page import="java.util.Date"%>
<%@taglib uri="http://my.scwcd" prefix="my" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><my:required ></my:required></h1>
        
        <h2><my:greet /></h2>
        <h2><my:greet user="Jamie" /></h2>
        <h2><my:greet user="Jamie ${ 1+2 }" /></h2>
        
        <h3><my:if condition="<%=new Date().getTime() % 2 == 0%>">
                現在時間:<%=new Date()%>
        </my:if></h3>
        
        <h4><my:loop count="3">
                Java
        </my:loop></h4>
        
        <hr>
        <my:mark search="s">
            she sells seashells by the seashore
        </my:mark>
        <hr />
        
        <!--印出 bmi_session 的驗證碼-->
        <h5>
            <my:implicit attributeName="authCode" scopeName="session" />
        </h5>
        
        <!-- 1印出男生 2印出女生 其它印出錯誤-->
        <h6>
            <my:switch conditionValue="1">
                <my:case caseValue="1">
                    男生
                </my:case>
                <my:case caseValue="2">
                    女生
                </my:case>
                <my:default>
                    錯誤
                </my:default>
            </my:switch>
        </h6>
        
    </body>
</html>
