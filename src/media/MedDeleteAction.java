package media;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MediaBean;
import dao.MediaDAO;
import tool.Action;

//作品削除処理

//整合性チェックまだ JSPの名前～

public class MedDeleteAction extends Action{
	public String execute(
			HttpServletRequest request,HttpServletResponse response)throws Exception{

		MediaBean mb = new MediaBean();

		int medCode = Integer.parseInt(request.getParameter("medCode"));

		mb.setmedCode(medCode);

		MediaDAO dao = new MediaDAO();
		dao.delete(mb);

		return "med-del-out.jsp";
	}

}
