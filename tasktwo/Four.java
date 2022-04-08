package tasktwo;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int i = sc.nextInt();
		
		for(;i<=10;i++) {
			
			if(i<0) {
				System.out.println("It's over");
				break;
				
			}else {
				System.out.println("Good going");
				continue;
			
			}
			
		}
		
		
			

	}

}
