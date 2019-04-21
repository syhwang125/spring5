<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="500" cellpadding="0" cellspacing="0" border="1">
<form action="write" method="post">
	<tr>
		<td> name </td>
		<td> <input type="text" name="bName" size="20">   </td>
	</tr>
	<tr>	
		<td> title  </td>
		<td> <input type="text" name="bTitle" size="20">   </td>
	</tr>
	<tr>
		<td> content  </td>
		<td> <input type="text" name="bContent" size="100">   </td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="write">&nbsp;&nbsp;<a href="http://localhost:8080/springboard/list"/>
		</td>
	</tr>
</form>
</table>
</body>
</html>