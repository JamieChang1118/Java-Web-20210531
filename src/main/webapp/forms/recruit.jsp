<%-- 
    Document   : recruit
    Created on : 2021/6/28, 下午 08:49:14
    Author     : boddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>選秀</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
        <link rel="icon" href="../icons/favicon.ico" type="image/x-icon" />
    </head>
    <body style="padding: 20px">
        <form class="pure-form" method="post" action="/JavaWeb20210531/controller/recruit">
            <fieldset>
                <legend>招聘</legend>
                <img width="40" src="../images/person.png" valign="middle" />
                <input type="number" placeholder="請輸入人數" name="amount" />
                <button type="submit" class="pure-button pure-button-primary">Submit</button>
            </fieldset>
        </form>
    </body>
</html>
