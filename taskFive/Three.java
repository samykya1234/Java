package taskFive;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		
		System.out.println("The entered string input is : " +input);
		
		input = input.replaceAll("\\s", "");
		System.out.println("The final string is : " +input);
		
	}

}
