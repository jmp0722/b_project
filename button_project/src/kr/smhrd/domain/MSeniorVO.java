package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MSeniorVO {
	private int ms_num;
	private String id;
	private int s_num;
	private String memo;
}
