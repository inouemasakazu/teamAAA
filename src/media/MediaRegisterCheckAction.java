package media;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.MediaBean;
import tool.Action;

// 作品登録判定のサーブレット　井上
public class MediaRegisterCheckAction extends Action{

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();

		String medTitle = request.getParameter("medTitle");
		String medMedia = request.getParameter("medMedia");
		String medRelease = request.getParameter("medRelease");
		String medGenre1 = request.getParameter("medGenre1");
		String medGenre2 = request.getParameter("medGenre2");
		//String medlmage = request.getParameter("medlmage"); //実装方法模索中です。
		String medInfo = request.getParameter("medInfo");

		request.setAttribute("medTitle", medTitle);
		request.setAttribute("medMedia", medMedia);
		request.setAttribute("medRelease", medRelease);
		request.setAttribute("medGenre1", medGenre1);
		request.setAttribute("medGenre2", medGenre2);
		//request.setAttribute("medlmage", medlmage); //実装方法模索中です。
		request.setAttribute("medInfo", medInfo);

		// 作品タイトル、ジャンル1、作品情報のどれかが空白だった場合のエラー
		if(medTitle == "" || medGenre1 == "" || medInfo == "") {
			String txt = "入力が必須の項目です。確認して下さい。";

			request.removeAttribute("message1");
			request.setAttribute("message1", txt);

			return "../media/media-register-error.jsp";
		} else {
			MediaBean mb = new MediaBean();
			mb.setmedTitle(medTitle);
			mb.setmedMedia(medMedia);
			mb.setmedRelease(medRelease);
			mb.setmedGenre1(medGenre1);
			mb.setmedGenre2(medGenre2);
			//mb.setmedlmage(medlmage); //実装方法模索中です。
			mb.setmedInfo(medInfo);

			// これから登録する情報を mbconf に保持
			session.setAttribute("mbconf", mb);

			// 登録情報に問題がない場合、登録確認jspに遷移
			return "../media/media-register-check.jsp";
		}
	}
}