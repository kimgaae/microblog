package sku.microblog.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sku.microblog.util.DataDuplicatedException;
import sku.microblog.util.DataNotFoundException;

/**
 * Servlet implementation class MemberController
 */
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 4412561148870850058L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		try {
			if (action.equals("register")) {
				this.registerMember(request, response);
			} else if (action.equals("deregister")) {
				this.deregisterMember(request, response);
			} else if (action.equals("select")) {
				this.selectMember(request, response);
			} else if (action.equals("login")) {
				this.login(request, response);
			} else if (action.equals("logout")) {
				this.logout(request, response);
			} else if (action.equals("update")) {
				this.updateMember(request, response);
			} else if (action.equals("likeList")) {
				this.likeList(request, response);
			} else if (action.equals("cancelLike")) {
				this.cancelLike(request, response);
			}
		} catch (DataNotFoundException dne) {
			throw new ServletException(dne);
		} catch (DataDuplicatedException dde) {
			throw new ServletException(dde);
		}
	}
	
	/**
	 * 입력된 회원정보로 회원을 등록시키는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws DataDuplicatedException
	 */
	private void registerMember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DataDuplicatedException  {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 현재 로그인 되어있는 회원을 회원 탈퇴시키는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws DataNotFoundException
	 */
	private void deregisterMember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DataNotFoundException  {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 한 명의 회원 상세 정보를 조회하는 요청을 처리하는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws DataNotFoundException
	 */
	private void selectMember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DataNotFoundException  {
		// TODO Auto-generated method stub
		
	}

	/**
	 * form data로 받은 회원 정보로 로그인 요청을 처리하는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 현재 로그인 되어있는 회원을 로그아웃 시키는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	/**
	 * form data로 받은 수정된 회원 정보로 회원을 갱신시키는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws DataNotFoundException
	 */
	private void updateMember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DataNotFoundException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 현재 로그인 되어있는 회원의 좋아요 목록을 조회하는 요청을 처리하는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void likeList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 현재 로그인 되어있는 회원이 추가했던 좋아요를 취소하는 메서드
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void cancelLike(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
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
