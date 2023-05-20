package admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Action;


//管理者ログアウト


public class AdminLogoutAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();




		if(session.getAttribute("admin")!=null) {
			session.removeAttribute("admin");
			return "../admin/admin-logout-out.jsp";
		}
		return "../admin/admin-logout-error.jsp";
		}

}
