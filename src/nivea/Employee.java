package nivea;

public class Employee {
	private String name;
	private char ch;
	private int age;
	private int salary;

	public Employee() {
		
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.salary = 2000;
	}

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void printDetails() {
		System.out.println(name + " : " + ch + " : " + age + " : " + salary);
	}
}
