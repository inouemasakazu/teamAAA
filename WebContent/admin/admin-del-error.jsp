<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="admin">
	<div class="login-form">
		<h2>管理者</h2>
		<p>${message1}</p>
		<p>${message2}</p>
		<p>
			※削除できない管理者です。。
	   	</p>
		<a href="admin-menu.jsp">管理者メニューに戻る</a>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>