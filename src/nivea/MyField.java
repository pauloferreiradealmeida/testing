package nivea;

public class MyField {
	int x, y;
	public void doStuff(int x, int y) {
		x = x;
		y = this.y;
	}
	
	public void diplay() {
		System.out.print(x + " " + y + " : ");
	}

	public static void main(String[] args) {
		MyField m1 = new MyField();
		m1.x = 100;
		m1.y = 200;
		MyField m2 = new MyField();
		m2.doStuff(m1.x, m1.y);
		
		m1.diplay();
		m2.diplay();
		
		System.out.println();
		
		int data[] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for (int e: data) {
			if (e != key) {
				//continue;
				count++;
			}
		}
		
		System.out.println(count + " Founs");
	}
}
