<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ThirdV</title>
</head>
<body>
	<h1>ThirdV 페이지입니다.</h1>
	<h1>아래에 ThirdVBaby 연결</h1>
	a : ${param.a}<br>
	b : ${param.b}<br>
	sum : ${sum }<br>
	d : ${dd }<br>
	e : ${sessionScope.ee }<br>
	<table border="1">
		<tr>
			<td><jsp:include page="${content }" /></td>
		</tr>
	</table>
	
	<%-- jsp:include 기능 사용 중인데 무한 루프가 생긴다?
		include가 잘못된 페이지를 가져왔다
		없는 페이지를 include 했다
		include 자체를 안했다.
		include : Controller의 request.setAttribute("content","ThirdVBady.jsp");
	 --%>
</body>
</html>