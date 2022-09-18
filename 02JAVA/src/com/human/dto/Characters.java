package com.human.dto;

public class Characters {
	public String job;
	public String skill;
	public double skillCooldown;

	public Characters() {
	}

	public Characters(String job, String skill, double skillCooldown) {
		super();
		this.job = job;
		this.skill = skill;
		this.skillCooldown = skillCooldown;
	}

	@Override
	public String toString() {
		return "Characters [job=" + job + ", skill=" + skill + ", skillCooldown=" + skillCooldown + "]";
	}

}
