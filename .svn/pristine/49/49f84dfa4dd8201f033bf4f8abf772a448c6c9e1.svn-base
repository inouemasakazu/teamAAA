package list;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ReviewBean;
import dao.ReviewDAO;
import tool.Action;

public class UserReviewListAction extends Action {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HttpSession session = request.getSession();

		int userCode = (Integer)session.getAttribute("usercode");


		ReviewDAO dao = new ReviewDAO();


			List<ReviewBean>rlist = dao.reviewlist2(userCode);
			request.setAttribute("rlist",rlist);

			return "../commonlist/userreviewlist.jsp";


	}
}
