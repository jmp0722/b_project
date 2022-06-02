package kr.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.command.Command;
import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;

public class JoinService implements Command {
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String mail = request.getParameter("mail");
		String phone = request.getParameter("phone");
		String m_name = request.getParameter("m_name");
		String m_address = request.getParameter("m_address");
		String m_check = request.getParameter("m_check");
		String i_num = request.getParameter("i_num");

		MemberVO vo = new MemberVO(id, pw, mail, phone, m_name, m_address, m_check, i_num);

		MemberDAO dao = new MemberDAO();
		int row = dao.join(vo);

		String moveURL = "";

		if (row > 0) {
			request.setAttribute("id", id);
			System.out.println("회원가입 성공!");
		} else {
			System.out.println("회원가입 실패");
		}
		
		moveURL = "membermain.jsp";
		return moveURL;
	}

}
