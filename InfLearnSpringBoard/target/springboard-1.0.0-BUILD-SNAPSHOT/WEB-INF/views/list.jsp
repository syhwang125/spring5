<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta http-eqyiv="Content-Type" content="text/html; charset="UFT-8">
	<title>MVC_Board title</title>
</head>
<body>

<br>Borad</br>
<p>
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td> number </td>
		<td> name   </td>
		<td> title  </td>
		<!-- td> date  </td-->
		<td> hit </td>
	</tr>
	
	<c:forEach items="${list}" var="dto">
	<tr>
		<td>${dto.bId}</td>
		<td>${dto.bName}</td>
		<td>
			<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
			<a href="content_view?bId=${dto.bId}">${dto.bTitle}</a>
		</td>
		<!-- td>${dto.bDate}</td-->
		<td>${dto.bHit}</td>
	</tr>
	</c:forEach>
	
	<tr>
		<td colspan="4"><a href="write_view">write</a></td>
	</tr>
</table>
</body>
</html>
