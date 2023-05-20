package review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.MediaBean;
import tool.Action;

// メディアページから medcode を持ってくるサーブレット
public class ReviewPostInAction extends Action {

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();

		Integer medCode = Integer.parseInt(request.getParameter("medCode"));

		request.setAttribute("medCode", medCode);

		MediaBean mb = new MediaBean();
		mb.setmedCode(medCode);

		// これから登録する情報を保持
		session.setAttribute("mbconf", mb);

		// 登録情報に問題がない場合、登録確認jspに遷移
		return "../review/review-post-in.jsp";
	}
}

