package inheritencepractice;

public class Employee extends Person {
 private double annualSalary;
 private double weeklySalary;
 
 
 public Employee(String name,double annualSalary){
	 super(name);
	 this.annualSalary = annualSalary;
 }
public double getAnnualSalary() {
	return annualSalary;
}
public void setAnnualSalary(double annualSalary) {
	this.annualSalary = annualSalary;
}
public double getWeeklySalary() {
	return weeklySalary;
}
public void setWeeklySalary(double weeklySalary) {
	this.weeklySalary = weeklySalary;
}
private double calculateWeeklySalary(double ) {
 weeklySalary = annualSalary / 52;
 System.out.println(weeklySalary);
return weeklySalary;


 }
public double getCaculateWeeklySalary() {
	return weeklySalary;
}
public void setCalculateWeeklySalary(double weeklySalary) {
	this.weeklySalary = weeklySalary;
	
}}
