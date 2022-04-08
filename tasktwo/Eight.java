package tasktwo;
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);
		
		if(ch=='r' || ch=='a' || ch=='n' ||ch=='d'||ch=='o'||ch=='m') {
				
			System.out.println( "FOUND");
		}else
			System.out.println("NOT FOUND");
		
	}

}
