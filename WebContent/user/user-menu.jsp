<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>ユーザーメニュー</h1>
	<div class="main-wrap">
		<div class="account-flex">
			<div class="account-main">
				<h2>こんにちは、${user.userName}さん</h2>
				<dl>
					<dt>ユーザー番号</dt>
					<dd>${user.userCode}</dd>
					<dt>ユーザーID</dt>
					<dd>${user.userId}</dd>
					<dt>ユーザーパスワード</dt>
					<dd>${user.userPass}</dd>
				</dl>
			</div>
			<div class="account-edit">
				<h2>会員情報管理</h2>
				<dl>
					<dt>ユーザー情報</dt>
					<dd>
						<a href="user-edit-in.jsp" class="media-in-btn">変更</a>
					</dd>
					<dt>レビュー一覧</dt>
					<dd>
						<a href="../list/UserReviewList.action" class="media-in-btn">レビューリスト</a>
					</dd>
					<dt>ユーザー退会</dt>
					<dd>
						<a href="user-del-in.jsp" class="media-in-btn">退会</a>
					</dd>
				</dl>
			</div>
		</div>
		<!-- <div class="user-del">
			<a  href="user-del-in.jsp" class="out-btn">ユーザー退会</a>
		</div> -->
	</div>
</main>


<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>