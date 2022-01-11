package tw.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import tw.dao.ActivityDAO;
import tw.dao.RegionQtyDAO;
import tw.model.ActivityBean;
import tw.model.ActivityDAOInterface;
import tw.service.ActivityPageService;
import tw.service.RegionQtyService;
import tw.util.HibernateUtil;

@WebServlet("/GetActivity")
public class GetActivity extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.getCurrentSession();
	
	private ActivityPageService actService;
	private RegionQtyService regService;
	
	public void init() {
		ActivityDAOInterface activityDao = new ActivityDAO();
    	this.actService = new ActivityPageService(activityDao);
    	
    	RegionQtyDAO regionDao = new RegionQtyDAO();
    	this.regService = new RegionQtyService(regionDao);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset = utf-8");
		
		int page = 1;
		String regionStr;

		if (request.getParameter("regionStr") != null) {
			regionStr = request.getParameter("regionStr");
		} else {
			regionStr = "臺北市";
		}
		
		request.setAttribute("imgSrc", "images/bg_2.jpg");
		request.setAttribute("slogan", "精彩活動，讓假期每天都精彩");
		request.setAttribute("regionStr", regionStr);
		
		List<ActivityBean> activity = actService.GetActivityByPage(page, regionStr);
		request.setAttribute("activity", activity);
		
		request.setAttribute("page", page);
		Long regionCount = actService.GetOneRegionRecordQty(regionStr);
		request.setAttribute("regionCount", regionCount);
		
		@SuppressWarnings("rawtypes")
		List regionQty = regService.GetActivityRegionQty();
		request.setAttribute("regionQty", regionQty);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Activity.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset = utf-8");
		
		int page = Integer.parseInt(request.getParameter("page"));
		String regionStr = request.getParameter("regionStr");
		
		request.setAttribute("imgSrc", "images/bg_2.jpg");
		request.setAttribute("slogan", "精彩活動，讓假期每天都精彩");
		request.setAttribute("page", page);
		request.setAttribute("regionStr", regionStr);
		
		List<ActivityBean> activity = actService.GetActivityByPage(page, regionStr);
		request.setAttribute("activity", activity);
		
		request.setAttribute("page", page);
		Long regionCount = actService.GetOneRegionRecordQty(regionStr);
		request.setAttribute("regionCount", regionCount);
		
		@SuppressWarnings("rawtypes")
		List regionQty = regService.GetActivityRegionQty();
		request.setAttribute("regionQty", regionQty);

	}

}
