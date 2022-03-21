package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class JDBCSetupp
 */
@WebServlet("/JDBCSetupp")
public class JDBCSetupp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCSetupp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
             PrintWriter out = response.getWriter();
             out.println("<html><body>");
             
          
            
            DBConnection conn = new DBConnection("jdbc:mysql://localhost:3306/ecommerce","root","KAALIa@8939480964");
            out.println("DB Connection initialized.<br>");
            
            conn.closeConnection();
            out.println("DB Connection closed.<br>");
            
            
            out.println("</body></html>");
            conn.closeConnection();
            
    } catch (ClassNotFoundException e) {
            e.printStackTrace();
    } catch (SQLException e) {
            e.printStackTrace();
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
