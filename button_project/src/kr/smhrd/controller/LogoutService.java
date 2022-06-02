package kr.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.command.Command;


	public class LogoutService implements Command {

		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession();
			session.invalidate();
			return "membermain.jsp";
		}

}
