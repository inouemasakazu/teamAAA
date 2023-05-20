<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>管理者ログイン</h1>
	<div class="main-wrap">
		<div class="login-form">
			<div class="login-input">
				<h2>管理者ログイン</h2>
				<p>登録済みの管理者IDとパスワードを入力してください。</p>
				<form action="../admin/AdminLogin.action" method="post">
					<dl>
						<dt>管理者ID</dt>
						<dd>
							<input type="text" name="login" class="account-text">
						</dd>
						<dt>パスワード</dt>
						<dd>
							<input type="password" name="password" class="account-text">
						</dd>
					</dl>
					<div class="btn-area">
						<input type="submit" value="ログイン" class="in-btn">
					</div>
				</form>
			</div>
		</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>