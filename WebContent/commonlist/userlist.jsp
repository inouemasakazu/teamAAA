<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>ユーザーリスト</h1>
	<div class="main-wrap">
		<c:forEach var="p" items="${ulist}">
			<div class="media-row">
			<table>
				<tr>
					<th>ユーザーID</th>
					<td>${p.userId}</td>
				</tr>
				<tr>
					<th>ユーザーパスワード</th>
					<td>${p.userPass}</td>
				</tr>
				<tr>
					<th>ニックネーム</th>
					<td>${p.userName}</td>
				</tr>
				<tr>
					<th>登録日</th>
					<td>${p.userDate}</td>
				</tr>
			</table>
				<form action="../user/UserDeleteList.action" method="post">
						<button type="submit" name="userCode" value="${p.userCode}" class="review-del-btn">削除</button>
				</form>
			</div>
		</c:forEach>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>

