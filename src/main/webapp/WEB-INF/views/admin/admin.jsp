<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메인 페이지</title>
</head>
<body>
	<h1>관리자용 메인 페이지</h1>
	
	<sec:authorize access="isAnonymous()">
  		<a href="/customLogin">로그인</a>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
	  <a href="/customLogout">로그아웃</a>
	</sec:authorize>
	<br><br>
	<hr>
	<a href="/admin/cateManage">카테고리 관리</a><br><br>
	<a href="/admin/ProductManage">제품 관리</a><br><br>
	회원관리<br><br>
</body>
</html>