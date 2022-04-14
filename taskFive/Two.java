package taskFive;

import java.util.Arrays;

public class Two {

	public static void main(String[] args) {
	    int[] arr = {5, 7, 2, 4, 1};
		System.out.println("Original Array: " +Arrays.toString(arr)); 
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			sum  += arr[i];
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		int x = sum-max-min;	
		System.out.println("The sum of the array after removing max and min values is : " +x);
	}

}
