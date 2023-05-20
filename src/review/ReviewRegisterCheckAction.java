package review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ReviewBean;
import tool.Action;

//レヴュー登録判定のサーブレット　井上5/11
public class ReviewRegisterCheckAction extends Action{

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();

		Integer medCode = Integer.parseInt(request.getParameter("medCode"));
		Integer userCode = Integer.parseInt(request.getParameter("userCode"));
		String userName = request.getParameter("userName");
		String reviewContent = request.getParameter("reviewContent");

		request.setAttribute("medCode", medCode);
		request.setAttribute("userCode", userCode);
		request.setAttribute("userName", userName);
		request.setAttribute("reviewContent", reviewContent);

		// レビュー内容が空白だった場合のエラー
		if(reviewContent == "") {
			String txt = "レビューを記載してください。";

			request.removeAttribute("message1");
			request.setAttribute("message1", txt);

			return "../review/review-post-error.jsp";
		} else {
			ReviewBean rb = new ReviewBean();
			rb.setmedCode(medCode);
			rb.setuserCode(userCode);
			rb.setuserName(userName);
			rb.setreviewContent(reviewContent);

			// これから登録する情報を mbconf に保持
			session.setAttribute("rbconf", rb);

			// 登録情報に問題がない場合、登録確認jspに遷移
			return "../review/review-post-check.jsp";
		}
	}
}
