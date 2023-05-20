<%@page language="java" contentType="text/html; charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>情報変更</h1>
	<div class="main-wrap">
		<p>この内容で変更してもよろしいですか？</p>
	    <form action="../admin/AdminEdit.action" method="post">
	    	<table>
				<tr>
					<th>ID</th>
					<td>${edit.adminId}</td>
				</tr>

				<tr>
					<th>パスワード</th>
					<td>${edit.adminPass}</td>
				</tr>

				<tr>
					<th>ユーザーネーム</th>
					<td>${edit.adminName}</td>
				</tr>
			</table>
	    	<input type="submit" value="変更" class="in-btn">
	    </form>
    </div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>