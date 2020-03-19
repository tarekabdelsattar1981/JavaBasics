package Practice;

public class PatternsPractice {
	public static void main(String[] args) {

		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int s = 3; s >= 1; s--) {

			for (int d = 1; d <= s; d++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
