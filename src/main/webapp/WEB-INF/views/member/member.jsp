<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 사용자용 페이지</title>
</head>
<body>
	<h1>Member로 로그인 한 경우 첫 페이지(메인 페이지)</h1>
	<sec:authorize access="isAnonymous()">
  		<a href="/customLogin">로그인</a>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
	  <a href="/customLogout">로그아웃</a>
	</sec:authorize>
	
	<br><br>
	<hr>
	<a href="/member/mypage">Mypage</a><br><br>
	<a href="/member/buyList">구매 목록</a><br>
</body>
</html>