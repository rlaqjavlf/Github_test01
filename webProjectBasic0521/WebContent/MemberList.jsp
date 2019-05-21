<%@page import="org.web.MemberDTO.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSP내장객체 -->
<%

ArrayList<MemberDTO> Members =
			(ArrayList<MemberDTO>)request.getAttribute("members");

%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트</title>
</head>
<body>
<h1>회원리스트</h1>
	<%
	for(MemberDTO DTO : Members){
		out.print("아이디 : "+DTO.getuserID()+",  ");
		out.print("비밀번호 : "+DTO.getuserPW()+",  ");
		out.print("이름 : "+DTO.getuserName()+",  ");
		out.print("나이 : "+DTO.getuserAge()+",  ");
	}
	%>
	
<h1>회원리스트</h1>
	<%
	for(MemberDTO DTO : Members){
		%>
	<div>
		아이디 : <%=DTO.getuserID() %>,
		비밀번호 : <%=DTO.getuserPW() %>,
		이름 : <%=DTO.getuserName() %>,
		나이 : <%=DTO.getuserAge() %>
	</div>		
		<%
	}
	%>
	<h1>테이블 이용회원 리스트</h1>
	<table style ="width:500px; border: 1px solid black; border-collapse : collapse;">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>나이</th>			
		</tr>
		<%
		for(MemberDTO DTO : Members){
		%>
		<tr>
			<td><%=DTO.getuserID() %></td>
			<td><%=DTO.getuserPW() %></td>
			<td><%=DTO.getuserName() %></td>
			<td><%=DTO.getuserAge() %></td>
		</tr>
		<%
		}
		%>
		
			<tr>
			<tb><a href="formEx.jsp">회원가입</a></tb>
			<tb><a href="LoginView.do">로그인</a></tb>
			<tb><a href="LoginOut.do">로그아웃</a></tb>
			<tb><a href="Index.jsp">홈</a></tb>
			
			</tr>
	
	
</body>
</html>