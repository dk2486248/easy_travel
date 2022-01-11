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

@WebServlet("/GetActivityDetail")
public class GetActivityDetail extends HttpServlet {
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
		
		String actId = request.getParameter("Id");
		
		request.setAttribute("slogan", "精彩每一天");
		
		List<ActivityBean> activityInfo = actService.GetActivityById(actId);
		request.setAttribute("activityInfo", activityInfo);

		@SuppressWarnings("rawtypes")
		List regionQty = regService.GetActivityRegionQty();
		request.setAttribute("regionQty", regionQty);

		RequestDispatcher dispatcher = request.getRequestDispatcher("ActivityDetail.jsp");
		dispatcher.forward(request, response);
	}

}
