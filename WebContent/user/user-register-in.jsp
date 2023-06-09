<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>新規登録</h1>
	<div class="main-wrap">
		<div class="login-form">
			<div class="login-input">
				<h2>登録内容を入力してください。</h2>
				<form action="../user/UserCheck.action" method="post">
					<dl>
						<dt>ログインID</dt>
						<dd>
							<input type="text" name="userId" class="account-text">
						</dd>
						<dt>パスワード</dt>
						<dd>
							<input type="password" name="userPass" class="account-text">
						</dd>
						<dt>ユーザーネーム</dt>
						<dd>
							<input type="text" name="userName" class="account-text">
						</dd>
					</dl>
					<div class="btn-area">
			        	<input type="submit" value="登録" class="in-btn">
		        	</div>
			    </form>
		    </div>
	    </div>
    </div>
</main>


<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>