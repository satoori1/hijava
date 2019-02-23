package hijava.practice;

public class Arr {

	public static void main(String[] args) {
		ex1();
	}

	private static void ex1() {

		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.println(nums[i]);
		}
		
	}

}
