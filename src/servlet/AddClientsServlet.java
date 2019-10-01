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
import Components.ClientComponent;
import databaseconnection.RentalMain;


/**
 * Servlet implementation class AddClientsServlet
 */
@WebServlet("/AddClientsServlet")

public class AddClientsServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public AddClientsServlet() {
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
			ClientComponent client=new ClientComponent();
			
			 //Map<String, String> messages = new HashMap<String, String>();
			RentalMain rm =new RentalMain();
			PrintWriter pw=response.getWriter();
			client.setFirstName(request.getParameter("firstname"));
			client.setLastName(request.getParameter("lastname"));
			client.setDriverLicense(request.getParameter("DriverLicense"));
			client.setExpirationDate(request.getParameter("expirationdate"));
			client.setPhonenum(request.getParameter("PhoneNumber"));
			 System.out.println(client.getFirstName().toString());
			 System.out.println(client.getLastName().toString());
			HttpSession session = request.getSession(true);
			
			
			String fname=rm.addNewClient(client);
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

