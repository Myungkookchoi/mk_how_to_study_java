package com.human.dto;

public class Owner2 {
	public String O_name;
	public int O_age;
	public String O_pn;

	public Owner2() {
	}

	public Owner2(String o_name, int o_age, String o_pn) {
		super();
		O_name = o_name;
		O_age = o_age;
		O_pn = o_pn;
	}

	@Override
	public String toString() {
		return "Owner2 [O_name=" + O_name + ", O_age=" + O_age + ", O_pn=" + O_pn + "]";
	}

}
