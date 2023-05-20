<%@page contentType="text/html; charset=UTF-8" %>

<%@page import="bean.UserBean" %>
<% UserBean user =(UserBean)session.getAttribute("userCode"); %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>ユーザー退会</h1>
	<div class="main-wrap">
		<div class="login-form">
		    <h2>退会確認</h2>
		    <p>退会したらすべての情報が削除されます。</p>
		    <!-- 退会者の userCode を次のactionに飛ばします。 -->
			<form action="../user/UserQuit.action" method="post">
				<input type ="hidden" name="userCode"value="${user.userCode}">
				<h3>${user.userName}さん</h3>
				<input type="submit" value="退会" class="out-btn">
			</form>
		    <a href="user-menu.jsp" class="in-btn">ユーザーメニュー</a>
		</div>
	</div>
</main>


<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>