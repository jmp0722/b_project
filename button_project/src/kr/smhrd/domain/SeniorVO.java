package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeniorVO {
	private int s_num;
	private String s_name;
	private String s_address;
	private String disease;
	private String gender;
	private int weight;
	private int age;
}
