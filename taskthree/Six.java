package taskthree;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		x = sc.nextInt();
		System.out.println("Enter the second number :");
		y = sc.nextInt();
		System.out.println("Enter the third number :");
		z = sc.nextInt();
		
		if(x<y && y<z) {
			System.out.println("Increasing");
			
		}else if(x>y && y>z) {
			System.out.println("Decreasing");
			
		}else {
			System.out.println("Neither increasing or decreasing order");
		}
	}

}
