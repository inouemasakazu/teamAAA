package list;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MediaBean;
import bean.ReviewBean;
import dao.MediaDAO;
import dao.ReviewDAO;
import tool.Action;

//全レビューのリスト表示用actionです。
//作品検索のアクションを流用しています。（MediaDAOのsearch1、searchaction系）
//※検索のとき、何も情報を入れずに送信すると、全データが表示されるOR検索の仕様を活用し、
//遷移前のページ（testlist.jspなど)からnullを送っています。（単純）

//コピペで増殖させるときは、変数名と対応するDAO内のSQL文の変更に気を付けてください。

//リストに削除ボタンとか編集ボタンとか付けたいときは、jspの方をいじって別のactionへ飛ばすのです

public class ReviewListAction extends Action {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String reviewCode = request.getParameter("reviewCode");
		String mediaCode = request.getParameter("mediaCode");

		ReviewDAO dao = new ReviewDAO();
		MediaDAO mdao = new MediaDAO();

		//レビューコードがnullの時、すべての情報を表示させます。
		if((reviewCode.equals(""))) {
			List<ReviewBean>rlist = dao.reviewlist(reviewCode);
			List<MediaBean>list = mdao.search1(mediaCode);
			request.setAttribute("rlist",rlist);
			request.setAttribute("list",list);

			//表示先のjspです。相対アドレスの表記に気を付けてください。
			return "../commonlist/reviewlist.jsp";
		}

		//エラー起きたらTOPに送れは全て適当です
				return"../common/index.jsp";
	}
}
