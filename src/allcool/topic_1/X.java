package allcool.topic_1;

public class X {
	
	// Exercício 28
	static int i;
	int j;

	public static void main(String[] args) {

		// Exercício 28
		
		X x1 = new X();
		X x2 = new X();
		
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		
		System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);

		new X().exercicio_36();

		// Exercício 41
		String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
		System.out.println(planets.length);
		System.out.println(planets[1].length());

		//Execício 57
		new X().exercicio_57();
	}

	private void exercicio_36() {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		
		String str2 = str1;
		String str3 = new String(str1);
		String str4 = sb1.toString();
		String str5 = "Duke";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str1 == str5);

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
	}
	
	private void exercicio_57() {
		int num[][] = new int[1][3];

		System.out.println("num.length = " + num.length);

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = 10;
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}
}
