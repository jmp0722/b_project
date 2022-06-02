package kr.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.smhrd.database.SqlSessionManager;

public class MemberDAO {

	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	private SqlSession sqlSession = null;

	// 1. 회원가입
	public int join(MemberVO vo) {
		int row = 0;
		try {
			sqlSession = sqlSessionFactory.openSession(true);
			row = sqlSession.insert("kr.smhrd.model.MemberDAO.memberinsert", vo);
			System.out.println("1. 여기가 오류?");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}

	public MemberVO login(MemberVO vo) {
		MemberVO result = null;
		try {
			sqlSession = sqlSessionFactory.openSession(true);
			result = sqlSession.selectOne("kr.smhrd.model.MemberDAO.memberlogin", vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return result;
	}
}
