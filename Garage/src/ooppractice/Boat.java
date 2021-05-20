package ooppractice;

public class Boat extends Vehicle {

	public Boat(String name, int year) {
		super(name, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void braking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Boat Name=" + getName() + ", Year=" + getYear() ;
	}

}
