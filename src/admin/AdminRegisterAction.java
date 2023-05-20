package admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.AdminBean;
import dao.AdminDAO;
import tool.Action;

// 管理者登録判定のサーブレット

public class AdminRegisterAction extends Action {

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();

		try {
			int line = 0;

			AdminBean ab = (AdminBean)session.getAttribute("conf1");
			AdminDAO dao = new AdminDAO();
			line = dao.register(ab);

			// 登録エラー
			if (line == 0) {
				String txt1 = "データベースエラーが発生しました。";
				String txt2 = "登録手続きをもう一度お願いします。";

				request.setAttribute("message", txt1);
				request.setAttribute("message", txt2);

				return "../admin/admin-register-error.jsp";
			}
		} catch (Exception e) {
			// 例外エラー
			String txt1 = "原因不明のエラーが発生しました。";
			String txt2 = "登録手続きをもう一度お願いします。";

			request.setAttribute("message", txt1);
			request.setAttribute("message", txt2);

			return "../admin/admin-register-error.jsp";
		}

		// 管理者登録が完了
		return "../admin/admin-register-out.jsp";
	}
}
