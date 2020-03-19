package Practice;

public class HighestValue {
	public static void main(String[] args) {

		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };

		int largest = 0;

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				if (a[r][c] > largest) {
					largest = a[r][c];
				}

			}
			
		}
		System.out.println(largest);
	}

}
