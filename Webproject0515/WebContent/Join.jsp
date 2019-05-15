<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="MemberJoin.do" method="post" id="join">
		아이디 : <input type = "text" name = "userID" id="userID"><br>
		비밀번호 : <input type = "password" name = "userPW" id="userPW"><br>
		이름 : <input type = "text" name = "userName" id="userName"><br>
		나이 : <input type = "text" name = "userAge" id="userAge"><br>
		<!--name이 같아야한다-->
		성별 : <input type = "radio" name = "userGender" value="남자" class="userGender">남자
			  <input type = "radio" name = "userGender" value="여자"class="userGender">여자<br>
			  <input type="reset" value="초기화">
			  <input type="submit" value ="서버에 전송">
	
	
	
	</form>
</body>
</html>