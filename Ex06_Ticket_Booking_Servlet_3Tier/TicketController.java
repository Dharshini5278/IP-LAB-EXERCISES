import java.io.*; import javax.servlet.*; import javax.servlet.http.*; import javax.servlet.annotation.*;
@WebServlet("/TicketController")
public class TicketController extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
PrintWriter out = res.getWriter(); out.println("<h2>Ticket Booked via 3-Tier Servlet DAO</h2>");
}
}