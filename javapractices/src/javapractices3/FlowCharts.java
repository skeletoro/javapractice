package javapractices3;

public class FlowCharts {

	public static void main(String[] args) {
 input(4,5,false);
	}
	public static void input(int a, int b, boolean c){
		if (c == true) {
			int result = a + b;
			System.out.println(result);
			
		}else { int result = a*b;
			System.out.println(result);
		}
		
	}

}
