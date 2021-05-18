package javapractice8;

public class Person {
	String name;
	String gender;
	Integer age;
	String title;
	
	
	
	public Person(String name, String gender, Integer age, String title) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.title =title;
		
		
	}
 public void reading(String title) {
	 System.out.println(this.name + " is reading the book " + this.title);
 }
}
