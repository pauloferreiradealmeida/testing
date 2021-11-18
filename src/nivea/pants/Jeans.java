package nivea.pants;

import nivea.clothing.Shirt;

public class Jeans {

	public static void main(String[] args) {
		Jeans trouser = new Jeans();
		trouser.matchShirt();
/*		
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee director = new Director();
		
		employee.salary;*/
	}

	public void matchShirt() {
		String color = Shirt.getColor();
		if (color.equals("Green")) {
			System.out.println("Fit");
		}
	}
}
