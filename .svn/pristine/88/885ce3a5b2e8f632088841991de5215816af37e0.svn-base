package list;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AdminBean;
import dao.AdminDAO;
import tool.Action;


//全管理者のリスト表示用actionです。
//作品検索のアクションを流用しています。（MediaDAOのsearch1、searchaction系）
//※検索のとき、何も情報を入れずに送信すると、全データが表示されるOR検索の仕様を活用し、
//遷移前のページ（testlist.jspなど)からnullを送っています。（単純）kuma

//コピペで増殖させるときは、変数名と対応するDAO内のSQL文の変更に気を付けてください。
//リストに削除ボタンとか編集ボタンとか付けたいときは、jspの方をいじって別のactionへ飛ばすのです

public class AdminListAction extends Action {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String adminCode = request.getParameter("adminCode");

		AdminDAO dao = new AdminDAO();

		//管理者コードがnullの時、すべての情報を表示させます。
		//余談ですが、管理者削除用にコレを使う場合、削除ができない絶対管理者の設定を
		//ここで条件付けて削除用リストに表示させないとか
		//対応するDAOの方でSQL文に検索対象から外させるとかできると思います

		if((adminCode.equals(""))) {
			List<AdminBean>list = dao.adminlist(adminCode);
			request.setAttribute("alist",list);

			//表示先のjspです。相対アドレスの表記に気を付けてください。
			return "../commonlist/adminlist.jsp";
		}

				//エラー起きたらTOPに送れは全て適当です
				return"../common/index.jsp";
	}
}
