<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>管理者登録</h1>
	<div class="main-wrap">
		<div class="login-form">
			<h2>登録する内容を入力してください。</h2>
			<form action="../admin/AdminCheck.action" method="post">
			<dl>
				<dd>ログインID</dd>
				<dt>
					<input type="text" name="adminId">
					<p>半角英数字で6から15文字以内</p>
				</dt>
				<dd>パスワード</dd>
				<dt>
					<input type="password" name="adminPass">
					<P>半角英数字で4から10文字以内</P>
				</dt>
				<dd>名前</dd>
				<dt>
					<input type="text" name="adminName">
				</dt>
				<input type = "submit" value = "登録" class="in-btn">
			</dl>
	    </form>
		</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>