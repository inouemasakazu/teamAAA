package user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDAO;
import tool.Action;


//ユーザーログイン



public class UserLoginAction extends Action{

	private int userCode;

	public String execute(
		HttpServletRequest request,HttpServletResponse response)throws Exception{
	HttpSession session = request.getSession();

	String login = request.getParameter("login");
	String password = request.getParameter("password");
	UserDAO dao = new UserDAO();
	UserBean user = dao.userLogin(login,password);
	try {
		userCode = user.getuserCode();
	}catch (NullPointerException e) {

	}



		if(user != null ) {

			// ログイン完了後に出力させる文字列

			String txt1 = "user/user-menu.jsp";
			String txt2 = "ユーザーメニュー";
			String txt3 = "user/user-logout-in.jsp";

			session.setAttribute("user",user);
			session.setAttribute("usercode",userCode);
			session.setAttribute("message1", txt1);
			session.setAttribute("message2", txt2);
			session.setAttribute("message3", txt3);

			return "../user/user-login-out.jsp";
					}
		return "../user/user-login-error.jsp";


	}


}


