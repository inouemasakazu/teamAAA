<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<body id="index">
<%@include file="../menu/header.jsp" %>

<main class="index">
	<div class="first-view">
		<div class="index-warp">
			<div class="first-view-text">
				<h1>記憶に残るあの時の感動を...</h1>
				<p>往年の名作から、話題になった最新作も！</p>
			</div>
			<div class="search-view">
				<div class="search-button-area">
					<a class="search-button-1" href="../search/search.jsp">詳細条件を入力して検索</a>
					<form action="../action/TopSearch.action" method="post" class="search-button-2">
					  	<input type="text" name="medTitle" placeholder="キーワードを入力して検索" class="search-button-2con">
					  	<input type="image" src="../img/search.jpg" name="button1" alt="送信する" class="search-button-2btn">
					</form>
				</div>
			</div>
		</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>