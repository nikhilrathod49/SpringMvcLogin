<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
    <h3>Student List Without Iteration :</h3>
    ${studentList}
   
    <h3>Student List With Iteration :</h3>
    <ul>
 
        <c:forEach var="student" items="${studentList}">
            <li>${student}</li>
        </c:forEach>
 
    </ul>
</body>
</html>