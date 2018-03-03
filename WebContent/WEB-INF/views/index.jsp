<%@page import="kr.co.dhflour.guestbook.vo.GuestbookVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	List<GuestbookVo> list 
		= (List<GuestbookVo>)request.getAttribute( "list" );

%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="" method="post">
		<table border="1" width="500">
			<tr>
				<td>이름</td><td><input type="text" name="name"></td>
				<td>비밀번호</td><td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
			</tr>
			<tr>
				<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
			</tr>
		</table>
	</form>
	<br>
	<%
		for( GuestbookVo vo : list) {
	%>
	<table width="510" border="1">
		<tr>
			<td>[1]</td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getRegDate() %></td>
			<td><a href="">삭제</a></td>
		</tr>
		<tr>
			<td colspan="4">
			<%=vo.getContents().replace("\n", "<br>") %>
			</td>
		</tr>    
	</table>
	<br>
	<%
		}
	%>	
</body>
</html>