package taskthree;
import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {

	    int row,a=1,b,i,j;
	    System.out.print("Input number of rows: ");
	    Scanner in = new Scanner(System.in);
			    row = in.nextInt();
	    for(i=0;i<row;i++)
	    {
	        for(b=1;b<=row-i;b++)
	        System.out.print(" ");
	        for(j=0;j<=i;j++)
	        {
	            if (j==0||i==0)
	                a=1;
	            else
	               a=a*(i-j+1)/j;
	            System.out.print(" "+a);
	        }
	        System.out.print("\n");
	    }
		
	}

}
