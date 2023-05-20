package user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Action;


//ユーザーログアウト


public class UserLogoutAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();




		if(session.getAttribute("user")!=null) {
			session.removeAttribute("user");
			return "../user/user-logout-out.jsp";
		}
		return "../user/user-logout-error.jsp";
		}

}
