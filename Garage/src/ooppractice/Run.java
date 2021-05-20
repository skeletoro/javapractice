package ooppractice;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
List<Garage> garage = new ArrayList<>(); 
Car a = new Car("volkswagen", 2013);
Motorcycle b = new Motorcycle("Ducati",2014);
Boat c = new Boat("Chris Craft", 2010);
garage.add(a);
garage.add(b);
garage.add(c);
System.out.println(garage);
	}

}
