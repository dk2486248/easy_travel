package tw.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.dao.ActivityDAO;
import tw.model.ActivityBean;
import tw.model.ActivityDAOInterface;
import tw.service.ActivityPageService;

@WebServlet(urlPatterns = {"/AjaxGetActivityPV"})
public class AjaxGetActivityPV extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private ActivityPageService actService;
	
	public void init() {
		ActivityDAOInterface activityDao = new ActivityDAO();
    	this.actService = new ActivityPageService(activityDao);

    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset = utf-8");
		
		String pageStr = request.getParameter("page");
		String regionStr = request.getParameter("region");
		int page = Integer.parseInt(pageStr);
		
		
		List<ActivityBean> activity = actService.GetActivityByPage(page, regionStr);
		request.setAttribute("activity", activity);
		
		request.setAttribute("page", page);
		Long regionCount = actService.GetOneRegionRecordQty(regionStr);
		request.setAttribute("regionCount", regionCount);
		
		request.setAttribute("acSize", activity.size());
		request.setAttribute("regionStr", regionStr);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/PartialView/ActivityList.jsp");
		dispatcher.forward(request, response);
	}
	
}
