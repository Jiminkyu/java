package ch06.home.ex04;

public class Main {
	public static void main(String[] args) {
		Point point = new Point(1, 2);
		Circle circle = new Circle(point,3);
		
		System.out.println(circle);
	}
}
/*
과제: Circle has a Point. 로디자인하라.
*/