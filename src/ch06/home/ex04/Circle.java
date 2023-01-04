package ch06.home.ex04;

public class Circle {
	private int r;
	private Point point;

	
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}

	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}

