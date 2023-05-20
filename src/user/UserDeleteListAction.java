package user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDAO;
import tool.Action;

//リストから削除を実行するサーブレット　ユーザー
public class UserDeleteListAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response
			)throws Exception{
		HttpSession session = request.getSession();

		Integer userCode = Integer.parseInt(request.getParameter("userCode"));

		request.setAttribute("userCode", userCode);

		try {
			int line = 0;

			UserBean ub = new UserBean();
			ub.setuserCode(userCode);

			UserDAO dao = new UserDAO();
			line = dao.delete(ub);

			// 登録エラー
			if (line == 0) {
				String txt1 = "データベースエラーが発生しました。";
				String txt2 = "管理者の削除ができませんでした。";

				request.setAttribute("message1", txt1);
				request.setAttribute("message2", txt2);

				return "../user/user-del-error.jsp";
			}
		} catch (Exception e) {
			// 例外エラー
			String txt1 = "原因不明のエラーが発生しました。";
			String txt2 = "管理者の削除ができませんでした。";

			request.setAttribute("message1", txt1);
			request.setAttribute("message2", txt2);

			return "../user/user-del-error.jsp";
		}
		// 削除が完了
		return "../user/user-del-out.jsp";
	}
}
