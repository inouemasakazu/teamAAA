<%@page import="bean.UserBean"%>
<%@page contentType="text/html; charset=UTF-8" %>

<%@page import="bean.MediaBean" %>
<%-- <%@page import="bean.UserBean" %> --%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% MediaBean user =(MediaBean)session.getAttribute("medCode"); %>
<%-- <% UserBean ub =(UserBean)session.getAttribute("userNmae"); %> --%>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="media">
	<h1>レビュー投稿</h1>
	<div class="review-post-in">
		<form action="../review/ReviewRegisterCheck.action" method="post">
			<input type="hidden" name="medCode" value="${mbconf.medCode}">
			<input type="hidden" name="userCode" value="${user.userCode}">
			<input type="hidden" name="userName" value="${user.userName}">
			<h2>
			${user.userName}さん
			</h2>

			<p >レビュー投稿フォーム（全角100文字以内）</p>
		    <textarea cols="100" rows="8"name="reviewContent"></textarea>
		    <div class="btn-area">
				<input type="submit" value="投稿内容確認" class="in-btn">
			</div>
		</form>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>