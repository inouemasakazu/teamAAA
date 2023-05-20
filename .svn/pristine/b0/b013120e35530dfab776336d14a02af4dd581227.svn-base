package user;



//ユーザー編集
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDAO;
import tool.Action;

public class UserEditAction extends Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HttpSession session = request.getSession();


//		String userId = request.getParameter("userId");
//		String userPass = request.getParameter("userPass");
//		String userName = request.getParameter("userName");

		UserBean edit =(UserBean)session.getAttribute("edit");
		UserBean user =(UserBean)session.getAttribute("user");

		String userId =  edit.getuserId();
		String userPass = edit.getuserPass();
		String userName = edit.getuserName();
		int userCode = user.getuserCode();

		user.setuserId(userId);
		user.setuserPass(userPass);
		user.setuserName(userName);
		user.setuserCode(userCode);

		UserDAO dao = new UserDAO();
		int i = dao.edit(user);



		if(i>0) {
			return "../user/user-edit-out.jsp";
		}
			return "../user/user-edit-error.jsp";
		}
	}




