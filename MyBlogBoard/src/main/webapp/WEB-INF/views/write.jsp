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

<P>  My blog list </P>
<table>
<form action="writeOk" >
<tr><td>id</td><td><input type="text" name="id" value="${board.id}"></td></tr>
<tr><td>name</td><td><input type="text" name="name" value="${board.name}"></td></tr>
<tr><td>title</td><td><input type="text" name="title" value="${board.title}"></td></tr>
<tr><td>content</td><td><input type="text" name="content" value="${board.content}"></td></tr>
<tr><td><input type="submit" name="register"></td></tr>
</form>
</table>
</body>
</html>
