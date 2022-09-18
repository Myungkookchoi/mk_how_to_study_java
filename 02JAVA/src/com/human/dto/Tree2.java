package com.human.dto;

public class Tree2 {
	public String name; // 이름
	public int time; // 시간
	public int exp; // 경험치
	public int all; // 전체 나무 수
	public int now; // 현재 나무 수
	public int gold; // 골드

	public Owner2 o2 = new Owner2();


	public Tree2(String name, int time, int exp, int all, int now, int gold, Owner2 owner2) {
		super();
		this.name = name;
		this.time = time;
		this.exp = exp;
		this.all = all;
		this.now = now;
		this.gold = gold;
		
	}


	@Override
	public String toString() {
		return "Tree2 [name=" + name + ", time=" + time + ", exp=" + exp + ", all=" + all + ", now=" + now + ", gold="
				+ gold + ", o2=" + o2 + "]";
	}

}
