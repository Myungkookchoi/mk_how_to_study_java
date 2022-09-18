package mk.home.online;

public class Test_Check {
	public int count = 0;
	private static Test_Check instance = new Test_Check();

//	private Singleton() {}

	public static Test_Check getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		Test_Check s1 = Test_Check.getInstance();
		s1.count++;
		System.out.println(s1.count);

	}
}