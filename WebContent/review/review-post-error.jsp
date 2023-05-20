<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="media">
	<h1>エラー</h1>
	<div class="review-post-in">
		<p>${message}</p>
		<input type="button" onclick="history.back()" value="前のページに戻る" class="review-post-btn">
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>