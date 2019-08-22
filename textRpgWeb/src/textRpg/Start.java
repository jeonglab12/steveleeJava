package textRpg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/start")
public class Start extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("<!DOCTYPE html><html><head></head><body>");
		
		resp.getWriter().print("<h1>Hello World!</h1>");
		
		resp.getWriter().print("</body></html>");
	}
	
}
