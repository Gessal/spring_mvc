<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>
    <table border="1" >
        <caption>${caption}</caption>
        <c:forEach var="car" items="${cars}">
            <tr>
                <td>${car.getModel()}</td>
                <td>${car.getMark()}</td>
                <td>${car.getHorsePower()}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
