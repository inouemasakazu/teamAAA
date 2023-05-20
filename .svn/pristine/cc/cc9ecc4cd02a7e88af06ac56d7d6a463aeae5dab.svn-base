package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MediaBean;
import bean.ReviewBean;
import dao.MediaDAO;
import dao.ReviewDAO;
import tool.Action;


// メディアの個別表示用アクション。メディア情報とレビュー情報をひっぱってきて１ページに表示しています。
//search_result.jspで表示されたリストのリンクボタンからmedCodeをmediapage.jspへ渡す　kuma


public class MedPageAction extends Action {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String medCode = request.getParameter("medCode");

		//各DAOの方にmedCodeが同じものを検索して出してくるプログラムを置いてます。
		//改造の場合はSQL文も変更忘れないでね
		MediaDAO dao = new MediaDAO();
		ReviewDAO redao = new ReviewDAO();

		//メディアコードをもらった時にうごくよ（nullではうごかないよ）
		if(!(medCode.equals(""))) {

			//メディアDAOのmedCodeとレビューDAOのmedCode両方ひっぱってきているぜ
			//片方だけひっぱってくる場合は片方に減らしたらいいよ
			//メディア情報検索用アクション参照
			List<MediaBean>list = dao.medpage(medCode);
			List<ReviewBean>relist = redao.medpageReview(medCode);

			//jspとの統合性注意　mediapage.jspみてくれ
			request.setAttribute("list",list);
			request.setAttribute("relist",relist);
			return "../media/mediapage.jsp";
		}else
				return"../search/search-result.jsp";
	}
}
