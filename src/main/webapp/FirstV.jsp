<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function firstRequest() {

		let a = document.firstForm.a;
		let b = document.firstForm.b;

		location.href = "SecondC?a=" + a.value + "&b=" + b.value;

	}
</script>

</head>
<body>

	<%--
		사용자가 어떤 액션을 취했을 때 이동 : 요청(request)
		<a> 태그로 요청 : 클릭하면 GET방식 요청
		JS로 요청 : 이벤트를 추가했을 때 GET 방식 요청
			(JS로 HTML 만들기 가능 > JS로 <form> 형식 만들어서 POST로 보내기도 가능함.)
		<form> + <button> : 버튼 클릭시 GET / POST 방식 요청
		
		정수 A와 B를 요청하는 방법 3가지(JS는 파일 새로 안 만들고)
		> SecondC로 요청. > FirstV에서 입력받은 값들 SecondV.jsp에서 보여지게?
		x
	 --%>
	<form name="firstForm" action="SecondC">
		<table>
			<tr>
				<td><input name="a" placeholder="a 입력"></td>
			</tr>
			<tr>
				<td><input name="b" placeholder="b 입력"></td>
			</tr>
			<tr>
				<td><a href="SecondC?a=100&b=150" onclick="">A태그
						사용(고정 값)</a></td>
			</tr>
			<tr>
				<td><div style="border: dotted black 1px; text-align: center"
						onclick="firstRequest();">JS 사용</div></td>
			</tr>
			<tr>
				<td><button style="text-align: center">Form+Button 사용</button></td>
			</tr>
		</table>
	</form>
</body>
</html>