<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
//자바코드쓸수있음 
request.setCharacterEncoding("utf-8");
response.setContentType("text/html;charset=utf-8");

String userID = request.getParameter("userID");
String userPW = request.getParameter("userPW");
String userPWchecked = request.getParameter("userPW");
String userGender = request.getParameter("usergander");
String geust = request.getParameter("geust");

String[] hobbysArr = request.getParameterValues("hobbys");
String[] phoneArr = request.getParameterValues("phone");

%>

<!-- 표현식 -->
<td id ="title">아이디: </td> <%=userID %><br> 
<td id ="title">비밀번호: </td> <%=request.getParameter("userPW") %><br>
<td id ="title">성별: </td> <%=userGender %><br>
<td id ="title">방명록: </td><%=geust %>
<%
//취미
String hobbysStr = "";
for(String str:hobbysArr) {
	hobbysStr +=str+", ";
	//System.out.println(str+"   ");
}
hobbysStr=hobbysStr.substring(0, hobbysStr.length()-1);
out.print("취미 : "+hobbysStr); //Printwriter out // jsp 내장
%>
<%
//전화번호
String phoneStr = "";
for(String str:phoneArr) {
	phoneStr +=str+", ";
	//System.out.println(str+"   ");
}
phoneStr=phoneStr.substring(0, phoneStr.length()-1);
out.print("번호 : "+phoneStr); //Printwriter out // jsp 내장
%>
</body>
</html>