package mk.alone.making;

public class MakingRandom {

	public static void main(String[] args) {
		int hit = 0;
		int hitRandom = (int) (Math.random() * 20) + 1;
		System.out.println(hitRandom);
		if (hitRandom < 2) {
			hit += 4;
		} else if (hitRandom < 4) {
			hit += 3;
		} else if (hitRandom < 9) {
			hit += 2;
		} else if (hitRandom < 19) {
			hit += 1;
		} else {
			System.out.println("플라잉 아웃!");
		}
		System.out.println(hit);
	}

}
//투수 < 타자 = 점수(+1~4)
//랜덤값을 정해준다.(1 = 홈런, 2,3 = 3루타, 4,5,6,7,8 = 2루타,  9,10,11,12,13,14,15,16,17 = 안타, 
//					18,19,20  = 아웃)