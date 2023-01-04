package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	//private 멤버변수도 super를통해 초기화 및 사용가능.
	public Cat(String catName, int age) {
		super(catName);//자식클래스의 첫번째 생성자는 이것이 자동으로 생성된다.
		//두번쨰해결책 ()에 부모클래스와같이 값을지정해준다.
		//this.animalName = catName;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
}
