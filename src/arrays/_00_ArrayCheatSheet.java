package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"Your","Mum","Is","A","Nice","Lady"};
		//2. print the third element in the array
		//System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "Isn't";
		//4. print the third element again
		//System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		//for (int i = 0; i < array.length; i++) {
		//System.out.println(array[i]);
		//}
		
		//6. make an array of 50 integers
		int[] int_array = new int[50];
		for (int i = 0; i < int_array.length; i++) {
			int_array[i] = i;
		}
		Random rand = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < int_array.length; i++) {
			int_array[i] = rand.nextInt(101);
		}
		int lowesttInt = int_array[0];
		
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println();
		for (int i = 0; i < int_array.length; i++) {
		if(int_array[i] < lowesttInt) {
		lowesttInt = int_array[i];
		
		}
		}
		int highestInt = int_array[0];
		System.out.println(lowesttInt);
		//10. print the largest number in the array.
		for (int i = 0; i < int_array.length; i++) {
			if(int_array[i] > highestInt) {
			highestInt = int_array[i];
			
			}
			}
			System.out.println(highestInt);
	}
}
