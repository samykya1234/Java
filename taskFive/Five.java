package taskFive;

import java.util.Arrays;
import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		int nums[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
	        int result[];
	        System.out.println("Original Array ");
	        System.out.println(Arrays.toString(nums));

	        result = separate_odd_even(nums);
	 
	        System.out.print("Array after separation ");
	        System.out.println(Arrays.toString(result));
	    }
		
	    static int [] separate_odd_even(int arr[])
	    {
	        int left = 0, right = arr.length - 1;
	        while (left < right)
	        {
	            while (arr[left]%2 == 0 && left < right)
	                left++;
	 
	            while (arr[right]%2 == 1 && left < right)
	                right--;
	 
	            if (left < right)
	            {
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	                left++;
	                right--;
	            }
	        }
	        return arr;

	}

}
