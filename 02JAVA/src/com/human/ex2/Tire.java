package com.human.ex2;

public class Tire {
	public String tname = "";
	public int tyear = 0;

	public Tire() {
	}

	public Tire(String tname, int tyear) {
		super();
		this.tname = tname;
		this.tyear = tyear;
	}

	@Override
	public String toString() {
		return "Tire [tname=" + tname + ", tyear=" + tyear + "]";
	}
	

}
