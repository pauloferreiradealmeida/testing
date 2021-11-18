package nivea.exception;

public class Planets {
	public static void main(String[] args) {
		Planet[] planets = {
				new Planet("Mercury", 0),
				new Planet("Venus", 0),
				new Planet("Earth", 1),
				new Planet("Masr", 2)
		};
		
		System.out.println(planets);
		System.out.println(planets[2].name);
		System.out.println(planets[2].moons);
	}
}
