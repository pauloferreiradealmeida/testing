package nivea;

public class Car extends Vehicle{
	
	String trans;
	Car(String trans) {
		//super();
		this.trans = trans;
	}

	Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this.trans = trans;
	}

	public static void main(String[] args) {
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W", 150, "Manual");
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
		
		int iVar = 0;
		float fVar = 0;
		double dVar = 0;
		Long lg = (long) fVar + iVar;
		fVar = iVar; //7
		//iVar = fVar; //8*
		//fVar = dVar; //9*
		dVar = fVar; //10
		//iVar = dVar; //11*
		dVar = iVar; //
	}
}