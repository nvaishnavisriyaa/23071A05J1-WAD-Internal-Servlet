import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Create 3 cookies
        Cookie cookie1 = new Cookie("username", "VaishnaviSriyaa");
        Cookie cookie2 = new Cookie("userRole", "Student");
        Cookie cookie3 = new Cookie("language", "English");

        // Set expiry time (optional): 1 day = 86400 seconds
        cookie1.setMaxAge(86400);
        cookie2.setMaxAge(86400);
        cookie3.setMaxAge(86400);

        // Add cookies to response
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);

        out.println("<html><body>");
        out.println("<h2>3 Cookies Added to Your Browser!</h2>");
        out.println("<ul>");
        out.println("<li>username: VaishnaviSriyaa</li>");
        out.println("<li>userRole: Student</li>");
        out.println("<li>language: English</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}
