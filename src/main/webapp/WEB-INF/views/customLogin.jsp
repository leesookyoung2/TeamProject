<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Custom Login Page</h1>
	<h2><c:out value="${error }"/> </h2>
	<h2><c:out value="${logout }"/></h2>
    <form method="post" action="/login">
        <table>
            <tr>
                <td>아이디 : </td>
                <td><input type="text" name="username" id="id" placeholder="아이디 입력" required></td>
            </tr>
            <tr>
                <td>암 &nbsp; 호 : </td>
                <td><input type="password" name="password" id="pwd"  placeholder="비밀번호 입력" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="checkbox" name="remember-me" id="remember-me"> 
                Remember Me</td>
            </tr>
            <tr>
                <td colspan='2' align="center"><input type="submit" value="로그인" ></td>
            </tr>				
        </table>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token }">
    </form>
</body>
</html>