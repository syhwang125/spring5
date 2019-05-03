<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  createPage 
</h1>

<form action="/springmvc/student/create">
Name : <input type="text" name="name" value="${stdInfo.name}"><br/>
age : <input type="text" name="age" value="${stdInfo.age}"><br/>
<input type="submit" value="send"><br/>
</form>
</body>
</html>
