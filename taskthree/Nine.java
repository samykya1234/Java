package taskthree;
import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		
		 
		   System.out.print("Enter number of rows : ");
		 Scanner sc = new Scanner(System.in);
				    int z = sc.nextInt();

		   for(int x=1;x<=z;x++)
		   {
			for(int y=1;y<=x;y++)
			  System.out.print(y);

		    System.out.println("");
		    }

	}

}
