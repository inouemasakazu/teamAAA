package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.AdminBean;
import dao.AdminDAO;
import tool.Action;

//管理者削除処理


public class AdminDeleteAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response)throws Exception{


		//Integer adminId = Integer.parseInt(request.getParameter("adminId"));
		String adminId = request.getParameter("adminId");
		String adminName = request.getParameter("adminName");
		AdminBean aab = new AdminBean();

		aab.setadminId(adminId);
		aab.setadminName(adminName);
		AdminDAO dao = new AdminDAO();
		dao.delete(aab);

		return "AdAccountDelete-Complete.jsp";
	}

}
