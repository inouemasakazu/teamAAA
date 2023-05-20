<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="../html/header.html" %>
<%@include file="../menu/header.jsp" %>


<main class="main">
	<h1>管理者メニュー</h1>
	<div class="main-wrap">
			<div class="account-flex">
				<div class="account-main">
					<h2>こんにちは、${admin.adminName}さん</h2>
					<dl>
						<dt>アカウント番号</dt>
						<dd>${admin.adminCode}</dd>
						<dt>アカウントID</dt>
						<dd>${admin.adminId}</dd>
						<dt>アカウントパスワード</dt>
						<dd>${admin.adminPass}</dd>
					</dl>
				</div>

				<div class="account-edit">
					<h2>会員情報管理</h2>
					<dl>
						<dt>管理者情報</dt>
						<dd><a href="admin-edit-in.jsp" class="media-in-btn">変更</a></dd>
						<dt>管理者追加</dt>
						<dd><a href="admin-register-in.jsp" class="media-in-btn">登録</a></dd>
						<dt>管理者一覧・削除</dt>
						<dd>
						<form action="../list/AdminList.action" method="post">
			        		<button type="submit" name="adminCode" value="" class="media-in-btn">管理者リスト</button>
			    		</form>
						</dd>
						<!-- <dt>管理者退会</dt>
						<dd><a href="admin-del-in.jsp">退会</a></dd> -->
						<dt>作品登録</dt>
						<dd><a href="../media/media-register-in.jsp"  class="media-in-btn">登録ページ</a></dd>
						<dt>レビュー一覧・削除</dt>
						<dd>
							<form action="../list/ReviewList.action" method="post">
			        			<button type="submit" name="reviewCode" value="" class="media-in-btn">レビューリスト</button>
			    			</form>
		    			</dd>
			   			<dt>ユーザー一覧・削除</dt>
			   			<dd>
						   	<form action="../list/UserList.action" method="post">
				        		<button type="submit" name="userCode" value="" class="media-in-btn">ユーザーリスト</button>
				    		</form>
			    		</dd>
					</dl>
				</div>
			</div>
		</div>
</main>


<%@include file="../menu/footer.jsp" %>
<%@include file="../html/footer.html" %>