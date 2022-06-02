package kr.smhrd.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.controller.Command;
import kr.smhrd.controller.JoinService;
import kr.smhrd.controller.LoginService;
import kr.smhrd.controller.LogoutService;

@WebServlet("*.do")
public class ButtonFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("[FrontController]");

		// 어느 서블릿으로 요청이 들어왔는지 확인
		String uri = request.getRequestURI();
		System.out.println(uri);

		// 프로젝트 이름
		String project = request.getContextPath();
		System.out.println(project);

		// 요청 들어온 servlet 이름만 확인
		String reqURL = uri.substring(project.length() + 1);
		System.out.println(reqURL);
		request.setCharacterEncoding("UTF-8");
		
		String moveURL = "";
		Command sc = null;
		
		if(reqURL.equals("JoinService.do")) {
			// 1. 회원가입 기능
			sc = new JoinService();
		}else if (reqURL.equals("LoginService.do")) {
			// 2. 로그인 기능
			sc = new LoginService();
		}else if (reqURL.equals("LogoutService.do")) {
			// 3. 로그아웃 기능
			sc = new LogoutService();
		}
		
		moveURL = sc.execute(request, response);
		RequestDispatcher rd = request.getRequestDispatcher(moveURL);
		rd.forward(request, response);

	}

}
