package kr.co.dhflour.guestbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.dhflour.guestbook.dao.GuestbookDao;
import kr.co.dhflour.guestbook.vo.GuestbookVo;

@WebServlet("/gb")
public class GuestbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding( "utf-8" );
		
		String actionName = request.getParameter( "a" );		
		if("add".equals(actionName) == true) {
			
		} else if("deleteform".equals(actionName) == true) {
			
		} else if("delete".equals(actionName) == true) {
			
		} else {
			/* default request */
			GuestbookDao dao = new GuestbookDao();
			List<GuestbookVo> list = dao.fetchList();
			
			request.setAttribute("list", list);
			
			RequestDispatcher rd = 
		request.getRequestDispatcher( "/WEB-INF/views/index.jsp" );
			rd.forward( request, response );
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
