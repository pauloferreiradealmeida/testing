package enthuware.tough.p2;

import enthuware.tough.p1.Movable;
public class Donkey implements Movable{
	public int location = 200;
	public Integer locationII = 200;

	public void move(int by) {
		location = location + by;
	}
	
	public void moveBack(int by) {
		location = location - by;
	}
}
