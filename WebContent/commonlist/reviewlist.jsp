<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>レビューリスト</h1>
	<div class="main-wrap">
		<c:forEach var="p" items="${rlist}">
			<div class="media-row">
				<table>
					<tr>
						<th>レビューコード</th>
						<td>${p.reviewCode}</td>
					</tr>
					<tr>
						<th>投稿者</th>
						<td>${p.userName} さん</td>
					</tr>
					<tr>
						<th>投稿日</th>
						<td>${p.reviewDate}</td>
					</tr>
					<tr>
						<th>レビュー内容</th>
						<td>${p.reviewContent}</td>
					</tr>
				</table>
				<form action="../review/ReviewDeleteList.action" method="post">
					<button type="submit" name="reviewCode" value="${p.reviewCode}" class="review-del-btn">削除</button>
				</form>
			</div>
		</c:forEach>
	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>

