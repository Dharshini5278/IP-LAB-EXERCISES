import java.io.*; import javax.servlet.*; import javax.servlet.http.*; import javax.servlet.annotation.*;
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
HttpSession session = req.getSession(); PrintWriter out = res.getWriter(); out.println("<h2>Session ID: " + session.getId() + "</h2>");
}
}