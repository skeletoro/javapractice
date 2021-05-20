package ooppractice;

public class Car extends Vehicle{

	public Car(String name, int i) {
		super(name, i);
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
		return " Car Name=" + getName() + ", Year=" + getYear() + "\n";
			
	}
}
