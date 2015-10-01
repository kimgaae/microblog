package sku.microblog.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExplorController
 */
public class ExplorController extends HttpServlet {
	private static final long serialVersionUID = 7824252667894994347L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action.equals("trending")) {
			this.viewTrendPosting(request, response);
		} else if (action.equals("image")) {
			this.viewImagePosting(request, response);
		} else if (action.equals("text")) {
			this.viewTextPosting(request, response);
		} else if (action.equals("video")) {
			this.viewVideoPosting(request, response);
		} else if (action.equals("audio")) {
			this.viewAudioPosting(request, response);
		} else if (action.equals("QnA")) {
			this.qna(request, response);
		}
	}
	

	private void viewTrendPosting(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	private void viewImagePosting(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	private void viewTextPosting(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}
	
	private void viewVideoPosting(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	private void viewAudioPosting(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	private void qna(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processRequest(request, response);
	}

}
