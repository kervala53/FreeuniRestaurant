package ge.edu.freeuni.restaurant.model;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccountCreatingServlet
 */
@WebServlet("/AccountCreatingServlet")
public class AccountCreatingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountCreatingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String	user = request.getParameter("username");
		String	pass = request.getParameter("myPass");
		String	info = request.getParameter("info");
		String 	name = request.getParameter("name");
		String	surname =request.getParameter("surname");
		if(user.equals("") || pass.equals("")){
			RequestDispatcher dispatch = request.getRequestDispatcher("FillFields.html");
			dispatch.forward(request, response);
		}
		else{
			RequestDispatcher dispatch = request.getRequestDispatcher("AccountCreated.jsp");
			dispatch.forward(request, response);
		}
		
	}

}
