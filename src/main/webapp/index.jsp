<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 생년월일 할 때 option 쪽 반복하기 위해 필요.(jstl.jar) --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css">
<script type="text/javascript" src="JS/main.js"></script>
<script type="text/javascript" src="JS/memberCheck.js"></script>
</head>
<body class="indexBody">
	<table class = "indexTable" align="center">
		<tr class="indexTr">
			<td><a href="HomeController">board</a></td>
		</tr>
		<tr class="contentTr">
			<td>
			<jsp:include page="${content}"></jsp:include>
			</td>
		</tr>
		
		<tr class="loginTr">
			<td>
			<jsp:include page="${log}"></jsp:include>
			</td>
		</tr>
		
	</table>
</body>
</html>