package com.stevelee.textRpg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class textRpgStart
 */
public class textRpgStart extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	Game game = new Game(40, 30);
	Hero hero = new Hero("●", "용사", 100, 21, 16, 10, 3);
	Monster monster = new Monster("★", "몬스터", 100, 21, 1, 0, 0);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public textRpgStart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String map = game.updateMap(hero, monster);
		
		response.setContentType("text/html; charset=UTF-8");
		
		response.getWriter().println("<!doctype html>");
		response.getWriter().println("<html>");

		response.getWriter().println("<head>");
		response.getWriter().println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>");
		response.getWriter().println("<script src='/resources/game.js'></script>");
		response.getWriter().println("<link rel='stylesheet' href='/resources/game.css' />");
		response.getWriter().println("</head>");

		response.getWriter().println("<body>");

		response.getWriter().println("<div id='map'>");
		response.getWriter().println(map);
		response.getWriter().println("</div>");
		
		response.getWriter().println("<div id='display'>@display</div>");
		
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HashMap<String, Object> data = new HashMap<String, Object>();
		String map = "";
		
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		
		// 요청
		String params = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
		JsonObject keyData = gson.fromJson(params, JsonObject.class);
		
		// 키보드 이벤트 처리
		switch (keyData.get("keyCode").getAsInt()) {
		case 37: // 왼쪽
			hero.setX(hero.getX() - 1);
			break;
		case 38: // 위
			hero.setY(hero.getY() - 1);
			break;
		case 39: // 오른쪽
			hero.setX(hero.getX() + 1);
			break;
		case 40: // 아래
			hero.setY(hero.getY() + 1);
			break;
		default:
			System.out.println("error");
			break;
		}
		

		map = game.updateMap(hero, monster);
		
		data.put("map", map);
		
		
		// 응답
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print(gson.toJson(data));
		out.flush();
	    out.close();  
		
	}

}
