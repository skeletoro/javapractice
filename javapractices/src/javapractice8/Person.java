package javapractice8;

public class Person {
	String name;
	String gender;
	Integer age;
	
	
	
	
	public Person(String name, String gender, Integer age ) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		
		
		
	}
 public void reading(Book a) {
	 System.out.println(this.name + " is reading the book " + Book.title);
 }

}