package tw.controler;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.dao.ActivityDAO;
import tw.model.ActivityDAOInterface;
import tw.service.ActivityPageService;

@WebServlet(urlPatterns = {"/AjaxGetPagePV"})
public class AjaxGetPagePV extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private ActivityPageService actService;
	
	public void init() {
		ActivityDAOInterface activityDao = new ActivityDAO();
    	this.actService = new ActivityPageService(activityDao);

    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset = utf-8");

		String regionStr = request.getParameter("region");
		
		Long regionCount = actService.GetOneRegionRecordQty(regionStr);
		request.setAttribute("regionCount", regionCount);
		request.setAttribute("region", regionStr);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/PartialView/Pagebar.jsp");
		dispatcher.forward(request, response);
	}
	
}
