<%@page contentType="text/html; charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header class="header">
 	<div class="header-inner">
		<div class="header-logo">
			<a href="../common/index.jsp"><img alt="タイトル画像" src="../img/logo.jpg"></a>
		</div>

		<div class="menu">
			<c:if test="${!empty user || !empty admin}">
				<c:if test="${user.userName != null}">
					<p>
						<a class="menu-text" href="../${message1}">こんにちは、${user.userName}さん</a>
					</p>
				</c:if>
				<c:if test="${admin.adminName != null}">
					<p>
						<a class="menu-text" href="../${message1}">こんにちは、${admin.adminName}さん</a>
					</p>
				</c:if>
				<a href="../${message1}" class="login-menu">
					<img alt="ログインロゴ" src="../img/person.jpg">
				</a>
			</c:if>

			<c:if test="${!(!empty user || !empty admin)}">
				<a href="../user/user-login-in.jsp" class="login-area">
					<img alt="ログインロゴ" src="../img/login.jpg">Login
				</a>
			</c:if>
			<c:if test="${!empty user || !empty admin}">
				<a href="../${message3}" class="login-area">
					<img alt="ログインロゴ" src="../img/logout.jpg">Logout
				</a>
			</c:if>
		</div>

	</div>
</header>