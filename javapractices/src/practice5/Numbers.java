package practice5;

public class Numbers {

	public static void main(String[] args) {
		addtog(96);
		for (int a = 100; a<200; a++) {
			System.out.println("A");
		}
for (int x=100; x<=200; x++) {
	if (x%2==0) {
		System.out.println(x + "-");
	}else {
		System.out.println(x +"*");
	}
}
	}


	public static void addtog(int a) {
		int x;
		int y;
		x = a % 10;
		y = (a-x)/10;
int result = x + y;
System.out.println(result);
	

	}

}
