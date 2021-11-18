package allcool.topic_1;

public class Person {

	String name;
	int age = 25;
	
	public Person() {
	}

	public Person(String name) {
		this();
	}
	
	static double area;
	int b = 2, h = 3;
	public static void main(String[] args) {

		//Exercício 69
		double p = 0, b = 0, h = 0;
		//double p, b, h;
		if (area == 0) {
			b = 3;
			h = 4;
			p = .5;
		}
		area = p * b * h;
		System.out.println("Area is " + p + " " + b + " " + h);
		System.out.println("Area is " + area);
	}

}
