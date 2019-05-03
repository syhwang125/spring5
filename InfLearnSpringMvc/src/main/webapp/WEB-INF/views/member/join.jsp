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

<p> name : ${member.name} </p>
<p> id : ${member.id } </p>
<p> pw : ${member.pw } </p>
<p> email : ${member.email} </p>

</body>
</html>
