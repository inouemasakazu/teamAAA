package list;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.UserDAO;
import tool.Action;

public class UserListAction extends Action {

	//全ユーザーのリスト表示用actionです。
	//作品検索のアクションを流用しています。（MediaDAOのsearch1、searchaction系）
	//※検索のとき、何も情報を入れずに送信すると、全データが表示されるOR検索の仕様を活用し、
	//遷移前のページ（testlist.jspなど)からnullを送っています。（単純）kuma

	//コピペで増殖させるときは、変数名と対応するDAO内のSQL文の変更に気を付けてください。

	//リストに削除ボタンとか編集ボタンとか付けたいときは、jspの方をいじって別のactionへ飛ばすのです

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String userCode = request.getParameter("userCode");

		UserDAO dao = new UserDAO();

		//ユーザーコードがnullの時、すべての情報を表示させます。
		if((userCode.equals(""))) {
			List<UserBean>list = dao.userlist(userCode);
			request.setAttribute("ulist",list);

			//表示先のjspです。相対アドレスの表記に気を付けてください。
			return "../commonlist/userlist.jsp";
		}

		//エラー起きたらTOPに送れは全て適当です
				return"../common/index.jsp";
	}
}
