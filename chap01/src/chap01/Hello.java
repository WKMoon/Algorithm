package chap01;

class Person {
	String name;
	int age;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public void sayHello() {
		System.out.println("Hello. My name is " + name + " and age is " + age + ".");
	}
}

public class Hello {

	public static void main(String[] args) {
		Person person = new Person();

		person.setName("Moon").setAge(25).sayHello();
	}

}
