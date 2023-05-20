<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<body id="">
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>登録完了</h1>
	<div class="main-wrap">
		<div class="login-form">
			<p>${message}</p>
			<p>${message}</p>

			<a href="admin-register-in.jsp" class="in-btn">登録画面に戻る</a><br>
			<a href="../common/index.jsp" class="in-btn">ページトップに戻る</a>
		</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>