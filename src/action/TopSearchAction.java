package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MediaBean;
import dao.MediaDAO;
import tool.Action;


//メディア情報の検索システムのアクションです。

//search.jsp（およびTOPページ）の検索フォームから、入力条件の振り分けをしてメディアDAOに処理を託します。
//MediaDAOの処理はsearch1～5です。
//タイトル・ジャンル１・ジャンル２の三つの検索条件についてしつこいレベルで場合分けしています。
//動作条件を変更したい場合、思った動きではない場合はこの条件分けを確認できるようにです
//（プログラムを簡素にすることは出来ますが、他人がプログラムを変更するときに理解が難しくなる）

//AND検索、OR検索を切り替えたい場合はMediaDAOのSQL文を変更してください。kuma

public class TopSearchAction extends Action {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String medTitle = request.getParameter("medTitle");

		MediaDAO dao = new MediaDAO();

		//【OK0509】ジャンルもタイトルも無い場合 ×××■
		if((medTitle.equals(""))) {
			List<MediaBean>list = dao.searchtop(medTitle);
			request.setAttribute("list",list);
			return "../search/search-result.jsp";
		}
		//【OK0509】ジャンルの未選択タイトルのみ〇××
		else if(!(medTitle.equals(""))) {
			List<MediaBean>list = dao.searchtop(medTitle);
			request.setAttribute("list",list);
			return "../search/search-result.jsp";
		}


				return"../search/search-error.jsp";
	}
}
