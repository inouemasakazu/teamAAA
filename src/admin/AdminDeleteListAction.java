package admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.AdminBean;
import dao.AdminDAO;
import tool.Action;

//リストから削除を実行するサーブレット　管理者
public class AdminDeleteListAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response
			)throws Exception{
		HttpSession session = request.getSession();

		Integer adminCode = Integer.parseInt(request.getParameter("adminCode"));

		request.setAttribute("adminCode", adminCode);

		try {
			int line = 0;

			AdminBean ab = new AdminBean();
			ab.setadminCode(adminCode);

			AdminDAO dao = new AdminDAO();
			line = dao.delete(ab);

			// 登録エラー
			if (line == 0) {
				String txt1 = "データベースエラーが発生しました。";
				String txt2 = "管理者の削除ができませんでした。";

				request.setAttribute("message1", txt1);
				request.setAttribute("message2", txt2);

				return "../admin/admin-del-error.jsp";
			}
		} catch (Exception e) {
			// 例外エラー
			String txt1 = "原因不明のエラーが発生しました。";
			String txt2 = "管理者の削除ができませんでした。";

			request.setAttribute("message1", txt1);
			request.setAttribute("message2", txt2);

			return "../admin/admin-del-error.jsp";
		}
		// 削除が完了
		return "../admin/admin-del-out.jsp";
	}
}
