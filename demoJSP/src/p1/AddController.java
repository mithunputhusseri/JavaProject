package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Object String = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			 
		try {
			 int s_id = Integer.parseInt(request.getParameter("s_id"));
			 students s1 = new students(s_id);
			 String name = null;
			 name = s1.student_name(s_id);
			 request.setAttribute("d1", name);
			 RequestDispatcher rs = request.getRequestDispatcher("students.jsp");
			 rs.forward(request, response);
		} 
			 catch (Exception e) {
					
				 request.setAttribute("msg", e);
				 RequestDispatcher rs = request.getRequestDispatcher("Error.jsp");
				 rs.forward(request, response);
				
				 
			}
			 		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
