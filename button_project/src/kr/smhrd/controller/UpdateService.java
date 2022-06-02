package kr.smhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.domain.MemberVO;
import kr.smhrd.model.MemberDAO;


public class UpdateService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String phone = request.getParameter("phone");
		String m_address = request.getParameter("m_address");

		MemberVO vo = new MemberVO(id, pw, null, phone, null, m_address, null, null);

		MemberDAO dao = new MemberDAO();
		int row = dao.update(vo);

		if (row > 0) {
			System.out.println("회원 정보 수정 성공");
			HttpSession session = request.getSession();
			session.setAttribute("member", vo);
		}
		// return값 변경하기
		return "templete.html";
	}

}
