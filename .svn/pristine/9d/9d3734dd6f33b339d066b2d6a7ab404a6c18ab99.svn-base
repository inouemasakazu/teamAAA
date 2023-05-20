<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>確認</h1>
	<div class="main-wrap">
		<div class="login-form">
			<p>この内容で登録してもよろしいですか？</p>
		    <form action="../user/UserRegister.action" method="post">
				<dl>
					<dt>ログインID</dt>
					<dd>${conf.userId}</dd>
					<dt>パスワード</dt>
					<dd>${conf.userPass}</dd>
					<dt>ユーザーネーム</dt>
					<dd>${conf.userName}</dd>
				</dl>
		    	<input type="submit" value="登録" class="in-btn">
		    </form>
	    </div>
    </div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>