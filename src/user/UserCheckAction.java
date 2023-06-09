package user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDAO;
import tool.Action;

// ユーザー登録判定のサーブレット
public class UserCheckAction extends Action {

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();

		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		String userName = request.getParameter("userName");

		request.setAttribute("userId", userId);
		request.setAttribute("userPass", userPass);
		request.setAttribute("userName", userName);

		// ログインID、パスワード、ニックネームのどれかが空白だった場合のエラー
		if(userId == "" || userPass == "" || userName == "") {
			String txt = "入力されていない項目があります。";

			request.removeAttribute("message");
			request.setAttribute("message", txt);

			return "../user/user-register-error.jsp";
		} else {

			// ログインIDのルール指定：英数字で6から15文字以内
			Pattern pid = Pattern.compile("^[a-zA-Z0-9]{6,15}");
			Matcher mid = pid.matcher(userId);

			if(mid.find() == true) {
				// パスワードのルール指定：：英数字で4から10文字以内
				Pattern ppass = Pattern.compile("^[a-zA-Z0-9]{4,10}$");
				Matcher mpass = pid.matcher(userPass);

				if(mpass.find() == true) {
					int line = 0;

					// ログインIDの重複チェック
					UserDAO dao1 = new UserDAO();
					line = dao1.idCheck(userId);

					if(line == 0) {
						int line2 = 0;

						// ニックネームの重複チェック
						UserDAO dao2 = new UserDAO();
						line2 = dao2.nameCheck(userName);

						if(line2 == 0) {
							UserBean ub = new UserBean();
							ub.setuserId(userId);
							ub.setuserPass(userPass);
							ub.setuserName(userName);

							// これから登録する情報を保持
							session.setAttribute("conf", ub);

							// 登録情報に問題がない場合、登録確認jspに遷移
							return "../user/user-register-check.jsp";

						} else {

							// ニックネームの重複が発生した場合
							String txt = "すでに使われているニックネームです。";

							request.removeAttribute("message");
							request.setAttribute("message", txt);

							return "../user/user-register-error.jsp";
						}
					} else {

						// ログインIDの重複が発生した場合
						String txt = "すでに使われているログインIDです。";

						request.removeAttribute("message");
						request.setAttribute("message", txt);

						return "../user/user-register-error.jsp";
					 }
				} else {

					// PASSの文字列が英数字以外、文字数に一致しない場合
					String txt = "パスワードは半角英数、4から10文字の範囲内で入力してください。";

					request.removeAttribute("message");
					request.setAttribute("message", txt);

					return "../user/user-register-error.jsp";
				 }
			} else {

				// ログインIDの文字列が英数字以外、文字数に一致しない場合
				String txt = "ログインIDは半角英数、6から15文字の範囲内で入力してください。";

				request.removeAttribute("message");
				request.setAttribute("message", txt);

				return "../user/user-register-error.jsp";
			}
		}
	}
}

