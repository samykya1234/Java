package taskthree;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int DaysInMonth = 0,month, year; 
        String NameOfMonth = "Unknown";

        System.out.print("Enter the number of the month : ");
        month = sc.nextInt();

        System.out.print("Enter the year: ");
        year = sc.nextInt();

        switch (month) {
            case 1:
                NameOfMonth = "January";
                DaysInMonth = 31;
                break;
            case 2:
                NameOfMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DaysInMonth = 29;
                } else {
                    DaysInMonth = 28;
                }
                break;
            case 3:
                NameOfMonth = "March";
                DaysInMonth = 31;
                break;
            case 4:
                NameOfMonth = "April";
                DaysInMonth = 30;
                break;
            case 5:
                NameOfMonth = "May";
                DaysInMonth = 31;
                break;
            case 6:
                NameOfMonth = "June";
                DaysInMonth = 30;
                break;
            case 7:
                NameOfMonth = "July";
                DaysInMonth = 31;
                break;
            case 8:
                NameOfMonth = "August";
                DaysInMonth = 31;
                break;
            case 9:
                NameOfMonth = "September";
                DaysInMonth = 30;
                break;
            case 10:
                NameOfMonth = "October";
                DaysInMonth = 31;
                break;
            case 11:
                NameOfMonth = "November";
                DaysInMonth = 30;
              
                break;
            case 12:
                NameOfMonth = "December";
                DaysInMonth = 31;
        }
        System.out.print(NameOfMonth + " " + year + " has " + DaysInMonth + " days\n");
    }
	
}
