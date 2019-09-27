package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Components.ClerkComponent;
import databaseconnection.RentalMain;


/**
 * Servlet implementation class ClerkLoginServlet
 */
@WebServlet("/ClerkLoginServlet")

public class ClerkLoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ClerkLoginServlet() {
	        super();
	       
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ClerkComponent clerk=new ClerkComponent();
			
			 //Map<String, String> messages = new HashMap<String, String>();
			RentalMain rm =new RentalMain();
			PrintWriter pw=response.getWriter();
			clerk.setClerkName(request.getParameter("name"));
			clerk.setClerkEmail(request.getParameter("email"));
			 System.out.println(clerk.getClerkName().toString());
			 System.out.println(clerk.getClerkEmail().toString());
			HttpSession session = request.getSession(true);
			
			
			String fname=rm.checkLogin(clerk);
			System.out.println(fname);
			
			if(fname!=null )
			{
					
				 session.setAttribute("clerk", fname);
				 System.out.println("Success");
				 request.getRequestDispatcher("ClerkHomePage.jsp").forward(request, response); 
				
			}
			else
			{
				request.setAttribute("message", "Please check the username or Email");
				
				request.getRequestDispatcher("Welcome.jsp").forward(request, response);
				
				
			}
				
			doGet(request, response);
		}

	}

