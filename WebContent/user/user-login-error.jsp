<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>エラー</h1>
	<div class="main-wrap">
		<h2>エラー</h2>
		<p>ユーザーログイン名またはパスワードが違います。</p>
		<a href="../common/index.jsp" class="in-btn">トップページ</a>
		<a href="user-login-in.jsp" class="in-btn">ログインページ</a>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>