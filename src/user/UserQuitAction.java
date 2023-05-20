package user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDAO;
import tool.Action;

//ユーザー退会処理のサーブレット　井上
public class UserQuitAction extends Action{
	public String execute(
		HttpServletRequest request,HttpServletResponse response)throws Exception{
	HttpSession session = request.getSession();

	try {
		int line = 0;

		Integer userCode = Integer.parseInt(request.getParameter("userCode"));
		UserBean ub = new UserBean();

		ub.setuserCode(userCode);
		UserDAO dao = new UserDAO();
		line = dao.delete(ub);

		session.invalidate();

		// 登録エラー
		if (line == 0) {
			String txt1 = "データベースエラーが発生しました。";
			String txt2 = "退会ができませんでした。";

			request.setAttribute("message", txt1);
			request.setAttribute("message", txt2);

			return "../user/user-del-error.jsp";
		}
	} catch (Exception e) {
		// 例外エラー
		String txt1 = "原因不明のエラーが発生しました。";
		String txt2 = "退会ができませんでした。";

		request.setAttribute("message", txt1);
		request.setAttribute("message", txt2);

		return "../user/user-del-error.jsp";
	}

	// ユーザー退会が完了
	return "../user/user-del-out.jsp";

	}
}