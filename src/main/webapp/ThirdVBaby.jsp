<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ThirdVBaby</title>
</head>
<body>
	<h1>응애!</h1>
	<h1>ThirdVBaby 페이지입니다.</h1>
	<h1>jsp:include 를 사용하여 연결했습니다.</h1>
	'<' jsp:include page="${content }" '/>'<br>
	
	a : ${param.a}<br>
	b : ${param.b}<br>
	sum : ${sum }<br>
	d : ${dd }<br>
	e : ${sessionScope.ee }<br>
	f : ${cookie.ff.value }<br>
</body>
</html>