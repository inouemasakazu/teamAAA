package admin;



//　ユーザー編集
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.AdminBean;
import dao.AdminDAO;
import tool.Action;

public class AdminEditAction extends Action {
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HttpSession session = request.getSession();


//		String userId = request.getParameter("userId");
//		String userPass = request.getParameter("userPass");
//		String userName = request.getParameter("userName");

		AdminBean edit =(AdminBean)session.getAttribute("edit");
		AdminBean admin =(AdminBean)session.getAttribute("admin");

		String adminId =  edit.getadminId();
		String adminPass = edit.getadminPass();
		String adminName = edit.getadminName();
		int adminCode = admin.getadminCode();

		admin.setadminId(adminId);
		admin.setadminPass(adminPass);
		admin.setadminName(adminName);
		admin.setadminCode(adminCode);

		AdminDAO dao = new AdminDAO();
		int i = dao.edit(admin);




		if(i>0) {
			return "../admin/admin-edit-out.jsp";
		}
			return "../admin/admin-edit-error.jsp";
		}
	}




