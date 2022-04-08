package taskthree;
import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1;
		float n2;
		
	    System.out.print("Enter 1st number: ");
	    n1 = sc.nextFloat();
	    
	    System.out.print("Enter 2nd number: ");
	    n2 = sc.nextFloat();
	    sc.close();
	
	    if (Math.abs(n1 - n2) <= 0.01) {
	        System.out.println("They are the same");
	    }
	    else {
	        System.out.println("They are different");
	    }
	}

}
