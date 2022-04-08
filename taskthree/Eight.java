package taskthree;
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	int year = scan.nextInt();
    	
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else {
             leap = false;
        }

        if(leap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");

	}

}
