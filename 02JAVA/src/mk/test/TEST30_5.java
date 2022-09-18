package mk.test;

import com.human.dto.Cat;

public class TEST30_5 {
	public static Cat catFunc(Cat cat) {
		Cat rValue = cat;
		System.out.println(cat);
		rValue.age = 16;
		rValue.name = "고등어";
		return rValue;
	}

	public static void main(String[] args) {
		Cat cat = new Cat(15, "나비");
		System.out.println(cat);
		System.out.println(catFunc(cat));
	}
}