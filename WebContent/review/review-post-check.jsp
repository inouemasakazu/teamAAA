<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="media">
	<h1>投稿内容確認</h1>
	<div class="review-post-in">
		<form action="../review/ReviewRegister.action" method="post">
			<input type="hidden" name="medCode" value="${rbconf.medCode}">
			<h2>レビュー内容</h2>
			<p>メディアコード${rbconf.medCode}</p>
			<p>ユーザーコード${rbconf.userCode}</p>
			<p>ユーザーネーム${rbconf.userName}</p>
			<p>${rbconf.reviewContent}</p>
			以上の内容で投稿しますか？
			<input type="button" onclick="history.back()" value="修正" class="review-post-btn">
			<input type="submit" value="投稿" class="review-post-btn">
		</form>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>