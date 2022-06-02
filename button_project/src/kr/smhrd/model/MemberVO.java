package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {

	// member 테이블 
	private String id;
	private String pw;
	private String mail;
	private String phone;
	private String m_name;
	private String m_address;
	private String m_check;
	private String i_num;
	
}
