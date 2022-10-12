package inter;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 4, 7, 8, 11, 20 };
		arrSort(arr1);
	}

	private static void arrSort(int[] arr1) {

		int index = 0; //to point at current value in result array 
		int[] arr2 = new int[arr1.length];//result array 

		for (int i = 0; i < arr1.length; i++) { //for even numbers
			if (arr1[i] % 2 == 0) {
				arr2[index] = arr1[i];
				index++;
			}
		}
		for (int i = 0; i < arr1.length; i++) { //for even numbers
			if (arr1[i] % 2 != 0) {
				arr2[index] = arr1[i];
				index++;
			}
		}

		for (int i = 0; i < arr2.length; i++) { //Print result
			System.out.print(arr2[i] + " ");
		}

	}

}
