package review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ReviewBean;
import dao.ReviewDAO;
import tool.Action;

public class ReviewDeleteListAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response
			)throws Exception{
		HttpSession session = request.getSession();

		Integer reviewCode = Integer.parseInt(request.getParameter("reviewCode"));

		request.setAttribute("reviewCode", reviewCode);

		try {
			int line = 0;

			ReviewBean rb = new ReviewBean();
			rb.setreviewCode(reviewCode);

			ReviewDAO dao = new ReviewDAO();
			line = dao.delete(rb);

			// 登録エラー
			if (line == 0) {
				String txt1 = "データベースエラーが発生しました。";
				String txt2 = "レビューの削除ができませんでした。";

				request.setAttribute("message1", txt1);
				request.setAttribute("message2", txt2);

				return "../review/review-del-error.jsp";
			}
		} catch (Exception e) {
			// 例外エラー
			String txt1 = "原因不明のエラーが発生しました。";
			String txt2 = "レビューの削除ができませんでした。";

			request.setAttribute("message1", txt1);
			request.setAttribute("message2", txt2);

			return "../review/review-del-error.jsp";
		}

		// レビュー削除が完了
		return "../review/review-del-out.jsp";

	}
}
