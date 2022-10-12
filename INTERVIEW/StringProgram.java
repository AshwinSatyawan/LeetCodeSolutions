package inter;

import java.util.Scanner;

public class StringProgram {

	
	public static void main(String[] args) {
		
//		int [] arr = {1,2,2,5,6,3,3,2};
//		Map<Integer,Integer> map = new HashMap<>();
//		int count = 1;
//		for (int i = 0; i < arr.length; i++) {
//			
//			count = 1;
//			if(map.containsKey(arr[i]))
//			{
//				count++;
//			}
//			map.put( arr[i], count);
//			
//			
//			
//		}
//		
//		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int rows = sc.nextInt();            
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++) { System.out.print("*" + " "); } System.out.println(""); } for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        sc.close();
	}
	
}
