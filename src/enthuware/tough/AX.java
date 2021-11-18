package enthuware.tough;

public class AX implements Bozo{

	public AX() {
		//type = 1;
	}

	static int[] x = new int[10];
	static {
		x[0] = 10;
	}

	final static String hello = "hello";
	final static String hello1 = "hello";
	public static void main(String[] args) {
		AX ax = new AX();
		System.out.println(ax.x[0]);
		new AX().junp();

		String hello = "hello", hello1 = "hello", hel = "hel", lo = "lo";
		System.out.println("hello == hel + lo = " + (hello == (hel + lo)));
		System.out.println("hello == hello1 = " + (hello == hello1));
		System.out.println("hello == AX.hello = " + (hello == AX.hello));
		System.out.println("hello == (\"hel\" + \"lo\") = " + (hello == ("hel" + "lo")));
		System.out.println("hello == (\"hel\" + lo) = " + (hello == ("hel" + lo)));
		System.out.println("AX.hello == AX.hello1 = " + (AX.hello == AX.hello1));

		int x, y;
		for (x = 0, y = 0; x < y;) {}
		System.out.println(x + " " + y);
		
		char c = 'a';
		int i = 0;
		i = c;
		c = (char)i;
		
		int s = 5;
		for (i = 0; i < 3; i++) {
			s = s + i;
		}
		System.out.println(s);

		String sb = new StringBuilder("word").append("hello ", 5, 6).append("hello ", 0, 5).toString();
		System.out.println(sb);

		System.out.println("\"helo\".compareTo(\"helo\") : " + "helo".compareTo("helo"));
		System.out.println("\"Helo\".compareTo(\"helo\") : " + "Helo".compareTo("helo"));
		System.out.println("\"helo\".compareTo(\"Helo\") : " + "helo".compareTo("Helo"));
		System.out.println("\"Helo\".compareTo(\"hElo\") : " + "Helo".compareTo("hElo"));
		System.out.println("\"Helo\".compareTo(\"hELO\") : " + "Helo".compareTo("hELO"));

		int k = 9;
		switch (k) {
			default:
				k = 5;
			case 5:
				k = 4;
		}
		System.out.println("switch default " + k);
		
		int a = 'a';

	}

	public void junp() { System.out.println("Bozo type é final " + type);}

	public int junp(int i) { return 1;}
}
