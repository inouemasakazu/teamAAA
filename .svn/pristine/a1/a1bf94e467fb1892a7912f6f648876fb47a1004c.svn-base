package review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ReviewBean;
import dao.ReviewDAO;
import tool.Action;

//レヴュー登録のサーブレット　井上5/11
public class ReviewRegisterAction extends Action {

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();

		try {
			int line = 0;

			ReviewBean rb = (ReviewBean)session.getAttribute("rbconf");
			ReviewDAO dao = new ReviewDAO();
			line = dao.register(rb);

			// 登録エラー
			if (line == 0) {
				String txt1 = "データベースエラーが発生しました。";
				String txt2 = "登録手続きをもう一度お願いします。";

				request.setAttribute("message", txt1);
				request.setAttribute("message", txt2);

				return "../review/review-post-error.jsp";
			}
		} catch (Exception e) {
			// 例外エラー
			String txt1 = "原因不明のエラーが発生しました。";
			String txt2 = "登録手続きをもう一度お願いします。";

			request.setAttribute("message", txt1);
			request.setAttribute("message", txt2);

			return "../review/review-post-eroor.jsp";
		}

		// ユーザー登録が完了
		return "../review/review-post-out.jsp";

	}
}

		/*int line = 0;
		HttpSession session = request.getSession();

		int medCode = Integer.parseInt(request.getParameter("medCode"));
		String reviewContent =request.getParameter("reviewContent");
		Integer userCode = (Integer)session.getAttribute("userCode");

		ReviewBean rb = new ReviewBean();
	    rb.setuserCode(userCode);
	    rb.setmedCode(medCode);
	    rb.setreviewContent(reviewContent);

	    if(reviewContent==null) {
	    	 return "review-post-error.jsp";
	    }


	 ReviewDAO dao = new ReviewDAO();

	 try {
		 line = dao.reviewRegister(rb);
	 }catch(SQLException e) {
		 e.printStackTrace();
		 String txt ="SQLException:不正な文字列です。";
		 String message = "不正な文字列です。";
		 request.setAttribute("message", message);
		 System.out.println(txt);

		 return "../media/mediapage.jsp";
	}
	 if(line != 1) {
		 return "review-post-error.jsp";
	 }
	 request.removeAttribute("medCode");
	 request.setAttribute("medcode", medCode);

	 return "review-post-out.jsp";



	}
}*/