package examtopics.topic_1;

public class Employee {

	String name;
	boolean contract;
	double salary;

	Employee() {
		this.name = "Joe";
		this.contract = true;
		this.salary = 100;
	}
	
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
/*
		e.name = "Joe";
		e.contract = true;
		e.salary = 100;
*/
		System.out.print(e);

	}

}
