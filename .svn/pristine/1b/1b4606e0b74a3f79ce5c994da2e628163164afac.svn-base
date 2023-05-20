<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>管理者リスト</h1>
	<div class="main-wrap">
		<c:forEach var="p" items="${alist}">
			<div class="media-row">
				<table>
					<tr>
						<th>管理者コード</th>
						<td>${p.adminCode}</td>
					</tr>
					<tr>
						<th>管理者ーID</th>
						<td>${p.adminId}</td>
					</tr>
					<tr>
						<th>管理者パスワード</th>
						<td>${p.adminPass}</td>
					</tr>
					<tr>
						<th>ニックネーム</th>
						<td>${p.adminName}</td>
					</tr>
					<tr>
						<th>登録日</th>
						<td>${p.adminDate}</td>
					</tr>
				</table>
				<form action="../admin/AdminDeleteList.action" method="post">
						<button type="submit" name="adminCode" value="${p.adminCode}" class="review-del-btn">削除</button>
				</form>
			</div>
		</c:forEach>
	</div>
</main>


<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>

