package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmanagelistVO {
	private int manum;
	private String id;
	private int q_num;
	private String q_date;
	private String btnstate;
	private String a_date;
	private int ms_num;
}
