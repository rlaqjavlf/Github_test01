<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fom정리</title>
</head>
<body>
	<div id=container>
		<div id=contant>
		<form action="Join.do" method="post" id="frm" enctype="">
			<td id ="title">아이디</td>
				<input type="text" name="userID" id="userID" placeholder="아이디" size="15" maxlength="20">
				<input type="button" value="중복확인" id="idChecked"><br>
			<td id ="title">비밀번호</td>
				<input type="password" name="userPW" id="userPW" placeholder="비밀번호"size="15" maxlength="20"><br>
			<td id ="title">비밀번호학인</td>
				<input type="password" name="userPW" placeholder="비밀번호확인"maxlength="20"><br>
			<td id ="title">성별</td>
				<input type = "radio" name = "gander" value="남" checked>남
				<input type = "radio" name = "gander" value="여" checked>여<br>
			
			<td id ="title">방명록</td>
			<br>
				<textarea rows="10" cols="30" name="geust"></textarea><br>
			<td id ="title">취미</td><br>
				<input type ="checkbox"name="hobbys" value ="등산" class="hobbys" checked>등산
				<input type ="checkbox"name="hobbys" value ="게임" class="hobbys" >게임
				<input type ="checkbox"name="hobbys" value ="여행" class="hobbys" >여행
				<input type ="checkbox"name="hobbys" value ="영화감상" class="hobbys" >영화감상<br>
			
			<td id ="title">전화번호</td><br>
				<select name="phone">
					<option value="010">010</option>
					<option value="011">010</option>
					<option value="012">010</option>
					<option value="02">010</option>
					<option value="013">010</option>
				</select> - 
				<input type="text" name="phone"maxlength="4"size="4"> -
				<input type="text" name="phone"maxlength="4"size="4"><br>
			<td id ="title">초기화</td><br>
				<input type ="reset" value="초기화">
				<input type ="submit" value="회원가입">
	
	
	
			</form>
		</div>
	</div>
</body>
</html>