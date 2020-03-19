package Practice;

public class P7 {
	public static void main(String[] args) {
		int[] nums = { 200, 30, -1, 900, 300, 3000 };

		int largest = nums[0];

		for (int x = 1; x < nums.length; x++) {

			if (nums[x] > largest) {

				largest = nums[x];
			}

		}

		System.out.println("Largest num is " + largest);

	} 

}