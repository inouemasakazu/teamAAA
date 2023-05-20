package media;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import bean.MediaBean;
import dao.MediaDAO;
import tool.Action;

@MultipartConfig
public class MediaRegisterAction extends Action{

	public String execute(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {

		HttpSession session = request.getSession();
//		//画像うｐ処理
//		Part part=request.getPart("medImage");
//		String filename=part.getSubmittedFileName();
//		//eventImage拡張子チェック
//		String extension = filename.substring(filename.lastIndexOf(".") + 1);
//		if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("png")) {
//		} else {
//		    return "../media/media-register-error.jsp";
//		}
//		ServletContext context = request.getServletContext();
//		String path = context.getRealPath("/teamAAA/upload");
//		System.out.println(filename);
//		System.out.println(path);
//		part.write(path+File.separator+filename);
//		//request.setAttribute("filename", filename);	//outページで表示するための文　不要

		try {

			//画像うｐ処理
			Part part=request.getPart("medImage");
			String filename=part.getSubmittedFileName();
			//eventImage拡張子チェック
			String extension = filename.substring(filename.lastIndexOf(".") + 1);
			if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("png")) {
			} else {
			    return "../media/media-register-error.jsp";
			}
			ServletContext context = request.getServletContext();
			String path = context.getRealPath("/upload");
			System.out.println(filename);
			System.out.println(path);
			part.write(path+File.separator+filename);
			//request.setAttribute("filename", filename);	//outページで表示するための文　不要

			int line = 0;

			MediaBean mb = (MediaBean)session.getAttribute("mbconf");
			mb.setmedImage(filename);
			MediaDAO dao = new MediaDAO();
			line = dao.register(mb);


//			//画像うｐ処理
//			Part part=request.getPart("medImage");
//			String filename=part.getSubmittedFileName();
//			//eventImage拡張子チェック
//			String extension = filename.substring(filename.lastIndexOf(".") + 1);
//			if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("png")) {
//			} else {
//			    return "../media/media-register-error.jsp";
//			}
//			ServletContext context = request.getServletContext();
//			String path = context.getRealPath("/upload");
//			System.out.println(filename);
//			System.out.println(path);
//			part.write(path+File.separator+filename);
//			//request.setAttribute("filename", filename);	//outページで表示するための文　不要





			// 登録エラー
			if (line == 0) {
				String txt1 = "データベースエラーが発生しました。";
				String txt2 = "登録手続きをもう一度お願いします。";

				request.setAttribute("message1", txt1);
				request.setAttribute("message2", txt2);


				return "../media/media-register-error.jsp";

			}
		} catch (Exception e) {
			e.printStackTrace();
			// 例外エラー
			String txt1 = "原因不明のエラーが発生しました。";
			String txt2 = "登録手続きをもう一度お願いします。";

			request.setAttribute("message1", txt1);
			request.setAttribute("message2", txt2);

			return "../media/media-register-error.jsp";
		}

		// 作品登録が完了
		return "../media/media-register-out.jsp";

	}
}