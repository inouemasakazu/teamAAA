package admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.AdminBean;
import dao.AdminDAO;
import tool.Action;

//管理者退会処理のサーブレット　井上
public class AdminQuitAction extends Action{
	public String execute(
		HttpServletRequest request,HttpServletResponse response)throws Exception{
	HttpSession session = request.getSession();

	try {
		int line = 0;

		Integer adminCode = Integer.parseInt(request.getParameter("adminCode"));
		AdminBean ab = new AdminBean();

		ab.setadminCode(adminCode);
		AdminDAO dao = new AdminDAO();
		line = dao.delete(ab);

		session.invalidate();

		// 登録エラー
		if (line == 0) {
			String txt1 = "データベースエラーが発生しました。";
			String txt2 = "退会ができませんでした。";

			request.setAttribute("message", txt1);
			request.setAttribute("message", txt2);

			return "../admin/admin-del-error.jsp";
		}
	} catch (Exception e) {
		// 例外エラー
		String txt1 = "原因不明のエラーが発生しました。";
		String txt2 = "退会ができませんでした。";

		request.setAttribute("message", txt1);
		request.setAttribute("message", txt2);

		return "../admin/admin-del-error.jsp";
	}

	// ユーザー退会が完了
	return "../admin/admin-del-out.jsp";

	}
}