package javapractices4;

public class FlowCharts2 {

	public static void main(String[] args) {
		input(101);
	}

	public static void input(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");

				}

			}

		} else {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
				
				if (a > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (a > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");

			}
		}
	}
}
