package nivea;

public class App {

	int count;
	public static void display() {
		int count =+ 0;
		System.out.println(count);
	}
	public static void main(String[] args) {
		display();
		App obj = new App();
		try {
			
			obj.open();
			obj.process();
			//throw new LogFileException();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void process() throws LogFileException{
		System.out.println("Process");
		throw new LogFileException();
	}

	public void open() {
		System.out.println("Opened");
		throw new AccesViolationException();
	}
}
