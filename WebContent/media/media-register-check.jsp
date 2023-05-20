<%@page contentType="text/html; charset=UTF-8" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="media">
	<h1>確認ページ</h1>
	<div class="login-form">
		<p>この内容で登録してもよろしいですか？</p>
	    <form action="../media/MediaRegister.action" method="post" enctype="multipart/form-data">

	    	<table>
				<tr>
					<th>タイトル</th>
					<td>${mbconf.medTitle}</td>
				</tr>
				<tr>
					<th>作品媒体</th>
					<td>${mbconf.medMedia}</td>
				</tr>
				<tr>
					<th>発売日</th>
					<td>${mbconf.medRelease}</td>
				</tr>
				<tr>
					<th>作品ジャンル</th>
					<td>${mbconf.medGenre1}</td>
					<td>${mbconf.medGenre2}</td>
				</tr>

                <tr><td>画像</td>
                    <td><input type="file" name="medImage" accept=".png,.jpeg,.jpg" required></td>
				<tr>
					<th>作品内容情報</th>
					<td>${mbconf.medInfo}</td>
				</tr>
			</table>
	    	<input type="submit" value="登録">
	    </form>
    </div>
	<a href="../admin/admin-menu.jsp">メニューページに戻る</a>
</main>


<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>