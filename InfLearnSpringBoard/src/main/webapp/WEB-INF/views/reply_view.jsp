<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>reply view title here</title>
</head>
<body>

<table width="500" cellpadding="0" cellspacing="0" border="1">
<form action="reply" method="post">
<input type="hidden" name="bId" value="${reply_view.bId}">
<input type="hidden" name="bGroup" value="${reply_view.bGroup}">
<input type="hidden" name="bStep" value="${reply_view.bStep}">
<input type="hidden" name="bIndent" value="${reply_view.bIndent}">
	<tr>
		<td> num </td>
		<td> ${reply_view.bId}  </td>
	</tr>
	<tr>	
		<td> hit  </td>
		<td> ${reply_view.bHit} </td>
	</tr>
	<tr>
		<td> Name  </td>
		<td> <input type="text" name="bName" value=${reply_view.bName}> </td>
	</tr>
		<tr>
		<td> Title  </td>
		<td> <input type="text" name="bTitle" value=${reply_view.bTitle}> </td>
	</tr>
			<tr>
		<td> content  </td>
		<td> <input type="text" name="bContent" value=${reply_view.bContent}> </td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="submit" value="reply">&nbsp;&nbsp;
		<a href="http://localhost:8080/springboard/list">list</a>
		</td>
	</tr>
</form>
</table>

</body>
</html>