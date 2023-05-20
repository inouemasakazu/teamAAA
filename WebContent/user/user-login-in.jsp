<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>ユーザーログイン / 新規会員登録</h1>
	<div class="main-wrap">
		<div class="login-form">
			<div class="login-form-flex">
				<div class="login-input">
					<h2>ユーザーログイン</h2>
					<p>登録済みのユーザーIDとパスワードを入力してください。</p>
					<form action="../user/UserLogin.action" method="post">
						<dl>
							<dt>ユーザーID</dt>
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
				<div class="new-input">
					<h2>新規登録はこちら</h2>
					<p>get monny()株式会社が提供する会員登録制サービスを管理するIDです。<br>登録は無料です。</p>
					<div class="btn-area">
						<a href="user-register-in.jsp" class="in-btn">登録ページ</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>