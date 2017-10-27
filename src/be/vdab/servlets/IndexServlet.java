package be.vdab.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index.htm")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang='nl'>");
		out.println("<head><meta charset='UTF-8'>");
	out.println("<title>Frituur Frida</title>");
	out.println("<link rel='icon' href='images/favicon.ico'>");
	out.println("<meta name='viewport' content='width=device-width,initial-scale=1'>");
	out.println("<link rel='stylesheet' href='styles/frituurfrida.css'>");
	out.println("</head><body><h1>Frituur Frida</h1><h2>");
//	String vandaag = LocalDate.now().getDayOfWeek().toString();
//	out.println(vandaag.equalsIgnoreCase("monday")||vandaag.equalsIgnoreCase("thursday") ? "Vandaag zijn we gesloten" :
//			"Vandaag zijn we open");
	DayOfWeek vandaag = LocalDate.now().getDayOfWeek();
	out.println("Vandaag zijn we " + (vandaag == DayOfWeek.MONDAY||vandaag == DayOfWeek.THURSDAY ? "gesloten" : "open"));
	out.println("</h2></body></html>");
	//System.out.println(vandaag);
	
	
	}

}
