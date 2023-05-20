<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>作品登録</h1>
	<div class="main-wrap">
		<p>登録情報を入力してください。</p>
		<form action = "MediaRegisterCheck.action"  method = "post">
			<table>
			<tr>
				<th>タイトル※</th>
				<td><input type ="text" name ="medTitle" class="title"></td>
			</tr>
			<tr>
				<th>作品媒体</th>
				<td>
				<select name ="medMedia">
					<option value="BD">BD</option>
					<option value="DVD">DVD</option>
				</select>
				</td>
			</tr>
			<tr>
				<th>発売日</th>
				<td>
					<input type="date" name ="medRelease">
				</td>
			</tr>
			<tr>
				<th>作品ジャンル1※</th>
				<td>
				<select name ="medGenre1">
					<option value="">選択なし</option>
					<option value="洋画">洋画</option>
					<option value="邦画">邦画</option>
					<option value="アニメ">アニメ</option>
					<option value="人形劇">人形劇</option>
					<option value="その他">その他</option>
				</select>
				</td>
			</tr>
			<tr>
				<th>作品ジャンル2</th>
				<td>
				<select name ="medGenre2">
				<option value="">選択なし</option>
				<option value="アクション">アクション</option>
					<option value="コメディ">コメディ</option>
					<option value="時代劇">時代劇</option>
					<option value="成人">成人</option>
					<option value="スポーツ">スポーツ</option>
					<option value="ドキュメンタリー">ドキュメンタリー</option>
					<option value="ノンフィクション">ノンフィクション</option>
					<option value="ファンタジー">ファンタジー</option>
					<option value="ファミリー">ファミリー</option>
					<option value="ホラー">ホラー</option>
					<option value="ミステリー">ミステリー</option>
					<option value="ミュージカル">ミュージカル</option>
					<option value="恋愛">恋愛</option>
					<option value="歴史">歴史</option>
					<option value="SF">SF</option>
				</select>
				</td>
			</tr>
			<!-- <tr>
				<th>作品画像</th>
				<td><input type="file" name="medlmage"></td>
			</tr> -->
			<tr>
				<th>作品情報※</th>
				<td>
					<textarea rows="12" cols="12" name="medInfo"></textarea>
				</td>
			</tr>
			</table>

			<p>※がついている項目は入力が必須です。</p>

			<input type = "reset" value="入力取り消し">
			<input type = "submit" value = "登録">
		</form>
		</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>