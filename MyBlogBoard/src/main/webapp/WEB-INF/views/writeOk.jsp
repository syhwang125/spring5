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
<tr><td>id</td><td>"${board.id}"</td></tr>
<tr><td>name</td><td>"${board.name}"</td></tr>
<tr><td>title</td><td>"${board.title}"</td></tr>
<tr><td>content</td><td>"${board.content}"</td></tr>
</table>
</body>
</html>
