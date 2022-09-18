package mk.home.dto;

public class Student_Class {
	public double kor = 0;
	public double eng = 0;
	public double math = 0;

	public Student_Class(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public double totalsum() {
		return kor + eng + math;
	}

	public double avg() {
		return totalsum() / 3;
	}
}
