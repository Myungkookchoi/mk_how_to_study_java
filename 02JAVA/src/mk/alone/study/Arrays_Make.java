package mk.alone.study;

public class Arrays_Make {

	public static void main(String[] args) {
//		int a[] = { 5, 1, 3 };
//		int b[] = { 2, 4, 6, 3 };
		
		// or
		
		int c[] = new int[3];
		int d[] = new int[4];
		
		c[0]=5;c[1]=1;c[2]=3;
		d[0]=2;d[1]=4;d[2]=6;d[3]=3;
		
		c[1]=0;		// c[1]이 1이였지만 0으로 변경.
		d[0]=0; d[3]=0;	// d[0]과 d[3]이 각각 2와 3이였지만 0으로 변경.
		
		System.out.println(c[0]);
		System.out.println(c[2]);
		System.out.println(d[1]);
		System.out.println(d[2]);
	}

}
