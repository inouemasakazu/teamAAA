package review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ReviewBean;
import tool.Action;

public class ReviewDeleteCheckAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response
			)throws Exception{
		HttpSession session = request.getSession();

		Integer reviewCode = Integer.parseInt(request.getParameter("reviewCode"));
		String userName = request.getParameter("userName");
		String reviewContent = request.getParameter("reviewContent");

		request.setAttribute("reviewCode", reviewCode);
		request.setAttribute("userName", userName);
		request.setAttribute("userName", reviewContent);

		//
		ReviewBean rb = new ReviewBean();
		rb.setreviewCode(reviewCode);
		rb.setuserName(userName);
		rb.setreviewContent(reviewContent);

		// これから登録する情報を保持
		session.setAttribute("rbconf", rb);

		// 確認画面に遷移
		return "../review/review-del-check.jsp";

	}

}
