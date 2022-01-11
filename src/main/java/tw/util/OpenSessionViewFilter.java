package tw.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet Filter implementation class OpenSessionViewFilter
 */
@WebFilter("/OpenSessionViewFilter")
public class OpenSessionViewFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			System.out.println("Session begin!");
			chain.doFilter(request, response);
			session.getTransaction().commit();
			System.out.println("Session commit ok!");
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Transaction rollback!!");
			e.printStackTrace();
		} finally {
			System.out.println("Session close!");
		}
		
	}


}
