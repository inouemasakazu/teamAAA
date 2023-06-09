<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@page import="bean.UserBean" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% UserBean user =(UserBean)session.getAttribute("userCode"); %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>ユーザー情報変更</h1>
	<div class="main-wrap">
		<div class="login-form">
			<h2>${user.userName}</h2>
			<p>変更する内容を入力してください。</p>
			<div class="user-main-2">
				<form action="../user/UserEditCheck.action" method="post">
				<input type ="hidden" name="userCode"value="${user.userCode}">
					<dl>
						<dd>ユーザーID</dd>
						<dt>
							<input type="text"name="userId" value="${user.userId}" required="required">
			 			</dt>
						<dd>パスワード</dd>
						<dt>
							<input type="text"name="userPass" value="${user.userPass}" required="required">
						</dt>
						<dd>ニックネーム</dd>
						<dt>
							<input type="text"name="userName" value="${user.userName}" required="required">
						</dt>
					</dl>
					<div class="btn-area">
						<input type="submit" value="変更する" class="in-btn">
					</div>
		     	</form>
			</div>
		</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>