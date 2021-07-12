<%-- 
    Document   : piechart
    Created on : 2021/7/12, 下午 07:56:10
    Author     : boddy
--%>

<%-- any content can be specified here e.g.: --%>
<%@tag pageEncoding="UTF-8"%>
<%@attribute name="work" required="true" rtexprvalue="true" %>
<%@attribute name="eat" required="true" rtexprvalue="true" %>
<%@attribute name="commute" required="true" rtexprvalue="true" %>
<%@attribute name="watch" required="true" rtexprvalue="true" %>
<%@attribute name="sleep" required="true" rtexprvalue="true" %>
<%@attribute name="is3d" required="true" rtexprvalue="true" %>

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
    google.charts.load('current', {'packages': ['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {

        var data = google.visualization.arrayToDataTable([
            ['Task', 'Hours per Day'],
            ['Work', ${ work }],
            ['Eat', ${ eat }],
            ['Commute', ${ commute }],
            ['Watch TV', ${ watch }],
            ['Sleep', ${ sleep }]
        ]);

        var options = {
            title: 'My Daily Activities',
            is3D: ${ is3d }
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
    }
</script>

<div id="piechart" style="width: 900px; height: 500px;"></div>