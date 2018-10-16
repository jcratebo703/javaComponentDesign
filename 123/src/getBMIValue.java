

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getBMIValue
 */
@WebServlet("/getBMIValue")
public class getBMIValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getBMIValue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		generatResponse(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		generatResponse(request, response);
	}
	
	public void generatResponse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//String test = new String(request.getParameter("t1").getBytes("iso-8859-1"), "utf-8");
		String strh = request.getParameter("t1");
		String strw = request.getParameter("t2");
		double dh = Double.parseDouble(strh);
		double dw = Double.parseDouble(strw);
		calauBMI bmi = new calauBMI();
		bmi.setH(dh);
		bmi.setW(dw);
		
		double result = bmi.getBMI();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>BMI servlet</title>");
		out.println("</head>");
		out.println("<body>");
		//out.println("<h2>123456ªø©°</h2>");
		out.println("<B>Your BMI: " +result+"</B>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}

