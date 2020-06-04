package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class Add2numbers
 */
@WebServlet("/Add2numbers")
public class Add2numbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add2numbers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
		
		// Step 2: get the printwriter
		PrintWriter out = response.getWriter();
		
		// Step 3: generate HTML content
		out.println("<html><body>");
		out.println("<form action='Add2numbers' method='post'>" );
		out.println("<centre><h1>Add</h1>");
		out.println("a:<input type='text' name='a' value='0'>");
		out.println("b:<input type='text' name='b' value='0'>");
		out.println("sum:<input type='text' name='c' value='0'>");
		out.println("<input type='submit' value = 'Add_fucker'>");
		out.println("</form>");
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		int a =Integer.parseInt(request.getParameter("a"));
		int b =Integer.parseInt(request.getParameter("b"));
		int c =a+b;
		out.println("<html><body>");
		out.println("<form action='Add2numbers' method='post'>" );
		out.println("<centre><h1>Add</h1>");
		out.println("a:<input type='text' name='a' value='"+a+"'>");
		out.println("b:<input type='text' name='b' value='"+b+"'>");
		out.println("sum:<input type='text' name='c' value='"+c+"'>");
		out.println("<input type='submit' value = 'Add_fucker'>");
		out.println("</form>");
		
		out.println("</body></html>");
	}

}
