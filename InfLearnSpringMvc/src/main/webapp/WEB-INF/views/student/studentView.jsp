<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
name : ${stdInfo.name}</br>
age : ${stdInfo.age}</br>
grade : ${stdInfo.gradeNum}</br>
class : ${stdInfo.classNum}</br>

</body>
</html>

