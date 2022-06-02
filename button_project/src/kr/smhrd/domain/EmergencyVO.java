package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyVO {
	private int e_num;
	private int s_num;
	private String e_date;
	private String e_comm;
	private String ea_date;
}
