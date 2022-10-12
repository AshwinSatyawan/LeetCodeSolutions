package inter;

public class BigNSmallElement {
	public static void main(String[] args) {
		int[] arr = { 1, 52, 3, 4, 45, 24, 7, 8, 99, 10, 20, 40 };

		System.out.println(findBig(arr));
		System.out.println(findSmall(arr));
	}

	private static int findSmall(int[] arr) {
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		return min;
	}

	private static int findBig(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}
}
