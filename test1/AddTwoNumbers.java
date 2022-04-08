package test1;
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		x= sc.nextInt();
		
		System.out.println("Enter the second number ");
		y= sc.nextInt();
		
		z=x+y;
		
		System.out.println("The sum of Two entered numbers is "+z);
		
		z=z+30;
		
		System.out.println("The variable result is "+z);
		
		
	}

}
