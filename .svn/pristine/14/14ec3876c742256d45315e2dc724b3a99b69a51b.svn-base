package admin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.AdminBean;
import dao.AdminDAO;
import tool.Action;

// ユーザー登録判定のサーブレット
public class AdminEditCheckAction extends Action {

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();


		String adminId = request.getParameter("adminId");
		String adminPass = request.getParameter("adminPass");
		String adminName = request.getParameter("adminName");


		request.setAttribute("adminId", adminId);
		request.setAttribute("adminPass", adminPass);
		request.setAttribute("adminName", adminName);

		// ログインID、パスワード、ニックネームのどれかが空白だった場合のエラー
		if(adminId == "" || adminPass == "" || adminName == "") {
			String txt = "入力されていない項目があります。";

			request.removeAttribute("message");
			request.setAttribute("message", txt);

			return "../admin/admin-edit-error.jsp";
		} else {

			// ログインIDのルール指定：英数字で6から15文字以内
			Pattern pid = Pattern.compile("^[a-zA-Z0-9]{6,15}");
			Matcher mid = pid.matcher(adminId);

			if(mid.find() == true) {
				// パスワードのルール指定：：英数字で4から10文字以内
				Pattern ppass = Pattern.compile("^[a-zA-Z0-9]{4,10}$");
				Matcher mpass = pid.matcher(adminPass);

				if(mpass.find() == true) {
					int line = 0;

					// ログインIDの重複チェック
					AdminDAO dao1 = new AdminDAO();
					line = dao1.idCheck(adminId);

					if(line == 0) {
						int line2 = 0;

						// ニックネームの重複チェック
						AdminDAO dao2 = new AdminDAO();
						line2 = dao2.nameCheck(adminName);

						if(line2 == 0) {
							AdminBean ab = new AdminBean();
							ab.setadminId(adminId);
							ab.setadminPass(adminPass);
							ab.setadminName(adminName);

							// これから登録する情報を保持
							session.setAttribute("edit", ab);

							// 登録情報に問題がない場合、登録確認jspに遷移
							return "../admin/admin-edit-check.jsp";

						} else {

							// ニックネームの重複が発生した場合
							String txt = "すでに使われているニックネームです。";

							request.removeAttribute("message");
							request.setAttribute("message", txt);

							return "../admin/admin-edit-error.jsp";
						}
					} else {

						// ログインIDの重複が発生した場合
						String txt = "すでに使われているログインIDです。";

						request.removeAttribute("message");
						request.setAttribute("message", txt);

						return "../admin/admin-edit-error.jsp";
					 }
				} else {

					// PASSの文字列が英数字以外、文字数に一致しない場合
					String txt = "パスワードは半角英数、4から10文字の範囲内で入力してください。";

					request.removeAttribute("message");
					request.setAttribute("message", txt);

					return "../admin/admin-edit-error.jsp";
				 }
			} else {

				// ログインIDの文字列が英数字以外、文字数に一致しない場合
				String txt = "ログインIDは半角英数、6から15文字の範囲内で入力してください。";

				request.removeAttribute("message");
				request.setAttribute("message", txt);

				return "../admin/admin-edit-error.jsp";
			}
		}
	}
}

