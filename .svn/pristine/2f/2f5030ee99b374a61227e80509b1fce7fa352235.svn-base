<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/header.html" %>
<body id="">
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>管理者メニュー</h1>
	<div class="main-wrap">
		<div class="admin-area">
			<div class="login-form">
				<p>この内容で登録してもよろしいですか？</p>
				<form action="../admin/AdminRegister.action" method="post">
		    		<table>
						<tr>
							<th>ID</th>
							<td>${conf1.adminId}</td>
						</tr>

						<tr>
							<th>パスワード</th>
							<td>${conf1.adminPass}</td>
						</tr>

						<tr>
							<th>ユーザーネーム</th>
							<td>${conf1.adminName}</td>
						</tr>
					</table>
		    	<input type="submit" value="登録" class="in-btn">
		    	</form>
			</div>
		</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>