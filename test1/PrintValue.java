
package test1;

import java.util.Scanner;

public class PrintValue {
 
	public static void main(String[] args) {
		int x;
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("enter any value to print");

		x=a.nextInt();
		
		System.out.println("the value entered to print is " +x);
	}

}
