package com.human.dto;

public class Tree {
	public String name; // 이름
	public int time; // 시간
	public int exp; // 경험치
	public int all; // 전체 나무 수
	public int now; // 현재 나무 수
	public int gold; // 골드

	public Owner o = new Owner();

	public Tree() {
	}

	public Tree(String name, int time, int exp, int all, int now, int gold) {
		super();
		this.name = name;
		this.time = time;
		this.exp = exp;
		this.all = all;
		this.now = now;
		this.gold = gold;
	}

}
