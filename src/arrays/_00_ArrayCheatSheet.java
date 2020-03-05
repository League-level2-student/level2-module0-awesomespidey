package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names = new String[6];
		names[0]="Johnny";
		names[1]="Jose";
		names[2]="Jimmy";
		names[3]="Jacob";
		names[4]="Jermiah";
		names[5]="Johnathan";
		
		
		
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Winter";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] ints = new int [50];
	
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < ints.length; i++) {
			ints [i] = r.nextInt(1000000)+1;
		}
		int low = Integer.MAX_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints [i] < low) {
				low = ints [i];
			}
		}
		System.out.println(low);
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);	
		}
		
		//10. print the largest number in the array.
		int high = Integer.MIN_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints [i] > high) {
				high = ints [i];
			}
		}
		System.out.println(high);
	}
}
