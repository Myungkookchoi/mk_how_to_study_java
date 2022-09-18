package mk.alone.making;

public class HomePoint {
	public int hpoint = 0;
	public int apoint = 0;
	HomePoint point[] = new HomePoint[3];

	public HomePoint() {

	}

	public HomePoint(int hpoint, int apoint) {
		super();
		this.hpoint = hpoint;
		this.apoint = apoint;
	}

	@Override
	public String toString() {
		return "점수 [Home=" + hpoint + ", Away=" + apoint + "]";
	}
}
