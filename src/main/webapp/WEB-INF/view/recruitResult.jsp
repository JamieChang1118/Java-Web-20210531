<%-- 
    Document   : recruitResult
    Created on : 2021/6/28, 下午 09:02:13
    Author     : boddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>招聘結果</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css">
        <link rel="icon" href="../icons/favicon.ico" type="image/x-icon" />
    </head>
    <body style="padding: 20px">
        <form class="pure-form">
            <fieldset>
                <legend>招聘結果</legend>
                人數:${fn:length(list)}
                <p />
                <table class="pure-table pure-table-bordered">
                    <thead>
                        <tr>
                            <th>No</th>
                            <th>Name</th>
                            <th>Sex</th>
                            <th>Score</th>
                            <th>Pass</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var="amount" value="0" />
                        <c:forEach var="person" items="${list}" varStatus="item" >                           
                        <tr>
                            <td>${item.index + 1}</td>
                            <td>${person.name}</td>
                            <td>${person.sex}</td>
                            <td>${person.score}</td>
                            <td>                              
                                <c:if test="${person.score >= 60}" >
                                    <c:out value="Pass" />
                                    <c:set var="amount" value="${amount + 1}"/>
                                </c:if>
                            </td>
                        </tr>                                            
                        </c:forEach>                       
                    </tbody>
                </table>
                <p />
                錄取人數:${amount}
                <p />
                <button type="button" onclick="window.history.back()" class="pure-button pure-button-primary">回上一頁</button>
            </fieldset>
        </form>
    </body>
</html>
