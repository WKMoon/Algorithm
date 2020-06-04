package com.wookuyung.moon;

class Animal {
	public Animal(String s) {
		System.out.println("Animal: " + s);
	}
}

class Mammal extends Animal {
	public Mammal() {
		super("Monkey");
		System.out.println("This is Monkey");
	}

	public Mammal(String s) {
		super(s);
		System.out.println("This is " + s);
	}
}

public class Hello {

	public static void main(String[] args) {
		Mammal first = new Mammal();
		Mammal second = new Mammal("dog");
	}

}
