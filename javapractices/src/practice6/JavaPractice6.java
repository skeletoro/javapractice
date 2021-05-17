package practice6;

public class JavaPractice6 {
	public static void main(String[] args) {
		evenOrUneven(9);
		String[] shoppingList = { "apples", "bananas", "cheese" };
		for (String x : shoppingList) {
			System.out.println(x);
		}
		int[] oneToTwenty = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	//	for (int x : oneToTwenty) {
	//		int result = x * x;
		//	System.out.println(result);
			
			for (int y:oneToTwenty) {
				if (evenOrUneven(y) == true ) {
				int answer= y*y*y;
				System.out.println(answer);
					}else {
						int answer = y*y;
						System.out.println(answer);
					}
			}
		}

//	}

	public static boolean evenOrUneven(int x) {
		int result = x % 2;
		if (result == 0) {
			return true;
		} else {
		return false;
		}
	}


}
