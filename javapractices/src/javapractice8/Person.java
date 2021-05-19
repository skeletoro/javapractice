package javapractice8;

public class Person {
	private String name = "billy";
	private String gender = "male";
private	Integer age = 20;
	
	
	
	
	public Person(String name, String gender, Integer age ) {
		this.name = name;
		this.setGender(gender);
		this.setAge(age);
		
		
		
	}
 public void reading(Book a) {
	 System.out.println(this.name + " is reading the book " + Book.getTitle());
 }
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

}