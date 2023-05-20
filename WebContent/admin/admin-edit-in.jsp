<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@page import="bean.AdminBean" %>
<% AdminBean admin =(AdminBean)session.getAttribute("adminCode"); %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>情報変更</h1>
	<div class="main-wrap">
		<div class="login-form">
			<p>変更する内容を入力してください。</p>
			<form action="../admin/AdminEditCheck.action" method="post">
				<input type ="hidden" name="adminCode"value="${admin.adminCode}">
				<table>
					<tr>
						<th>管理者ID</th>
						<td>
							<input type="text" name="adminId" value="${admin.adminId}" required="required">
					 	</td>
					</tr>
					<tr>
						<th>パスワード</th>
						<td>
							<input type="text" name="adminPass" value="${admin.adminPass}" required="required">
						</td>
					</tr>
					<tr>
						<th>ニックネーム</th>
						<td>
							<input type="text" name="adminName" value="${admin.adminName}" required="required">
						</td>
					</tr>
				</table>
				<input type="submit" value="変更する" class="in-btn">
		     </form>
	</div>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>