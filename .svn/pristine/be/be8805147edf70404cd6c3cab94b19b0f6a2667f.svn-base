<%@page contentType="text/html; charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<footer>
	<div class="footer-logo">
		<a href="../common/index.jsp"><img alt="タイトル画像" src="../img/logo.jpg"></a>
	</div>
	<nav class="site-menu">
		<ul>
			<li><a href="#.html">メニュー</a></li>
			<li><a href="#.html">プライバシーポリシー</a></li>
			<li><a href="#.html">特定商取引法に関する表示</a></li>
			<li><a href="#.html">利用規約</a></li>
		</ul>
	</nav>
	<div class="copyright">
		<p>Copyright 2023 ポリテクセンター</p>
	</div>
	
	<!-- ユーザー・管理者が二重でログインしてしまう問題があるため -->
	<!-- ログインセッションが確認できた場合以下は、非表示になります。 -->
	<c:if test="${!(!empty user || !empty admin)}">
		<div class="admin-in">
			<a href="../admin/admin-login-in.jsp">管理者ログイン</a>
		</div>
	</c:if>

</footer>