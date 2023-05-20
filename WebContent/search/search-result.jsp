<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>

<main class="main">
	<h1>検索結果</h1>
	<div class="main-wrap">
		<div class="serch-result-flex">
			<div class="serch-result-wrap">
				<c:forEach var="p" items="${list}">
					<div class="serch-result-row">
						<h2>${p.medTitle}</h2>
							<div class="media-flex">
								<div class="media-img">
									<img src="/teamAAA/upload/${p.medImage }">
									<!-- <img src="../img/aronman.jpg" alt="作品画像"> -->
								</div>
								<div class="media-text">
									<div class="media-text">
										<dl>
											<dt>CATEGORY</dt>
											<dd>${p.medGenre1}<br>${p.medGenre2}</dd>
											<dt class="dt-margin-top">ABOUT</dt>
											<dd>${p.medInfo}</dd>
										</dl>
									</div>
								</div>
							</div>
						<c:if test="${admin.adminName != null}">
							<form action="../media/MedDelete.action" method="post">
								<button type='submit' name='medCode' value='${p.medCode}' class="media-in-btn">削除</button>
							</form>
						</c:if>
						<form action="../action/MedPage.action" method="post">
							<button type='submit' name='medCode' value='${p.medCode}' class="media-in-btn">詳しくみる</button>
						</form>
					</div>
				</c:forEach>
			</div>


			<!-- 再検索（検索ページとはスタイル変更しています） -->
			<div class="media-form">
				<div class="media-form-wrap">
				<h2>条件を入力して再検索</h2>
					<div class="media-form-input-result">
						<form action="../action/MedSearch.action" method="post">
							<dl>
								<dt>タイトル検索</dt>
								<dd>
									<input type="text" name="medTitle" class="serch-text-result" placeholder="キーワードを入力して検索">
								</dd>
								<dt>
									表現形式
								</dt>
								<dd>
									<label for="medGenre1" class="serch-select-result">
										<select id="medGenre1" name="medGenre1">
											<option value="">選択なし</option>
											<option value="洋画">洋画</option>
											<option value="邦画">邦画</option>
											<option value="アニメ">アニメ</option>
											<option value="人形劇">人形劇</option>
											<option value="その他">その他</option>
										</select>
									</label>
								</dd>
								<dt>
									ジャンル
								</dt>
								<dd>
									<label for="medGenre2" class="serch-select-result">
										<select id="medGenre2"  name="medGenre2">
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
									</label>
								</dd>
							</dl>
							<div class="search-text-btn-result">
								<p>検索</p>
								<input type="image" src="../img/search.jpg" name="button1" alt="送信する">
							</div>
					    </form>
				    </div>
			    </div>
		    </div>
	    </div>
   	</div>
</main>

<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>