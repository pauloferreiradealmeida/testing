package nivea.animal;

import java.util.ArrayList;

public class Tiger extends Cat{

	public static void main(String[] args) {
		ArrayList<Animal> myListA = new ArrayList<>();//A
		myListA.add(new Tiger());
		
		ArrayList<Hunter> myListB = new ArrayList<>();//B
		myListB.add(new Cat());
		
		ArrayList<Hunter> myListC = new ArrayList<>();//C
		myListC.add(new Tiger());
		
		ArrayList<Tiger> myListD = new ArrayList<>();//D
		//myListD.add(new Cat());
		
		ArrayList<Animal> myListE = new ArrayList<>();//E
		myListE.add(new Cat());
	}

}
