package ch06.ex04.case01;

public class Animal {
	private String animalName;
	
	//public Animal() {}//첫번재해결책
	public Animal(String animalName) {
		this.animalName = animalName;
	}
	
	public String getAnimalName() {
		return this.animalName;
	}
}
