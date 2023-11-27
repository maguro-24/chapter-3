import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int y;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("input a year: ");
        y = scan.nextInt();
        
       
      
            if (y >= 1582)
                 {
                     if((y%4 ==0)|| (y%100 == 0 && y%400 !=0))
                     {
                         System.out.println("leap year");
                     }
                     else 
                     {
                         System.out.println("no");
                     }
                 }
       
        else 
        {
            System.out.println("Invaild input.");
        }
        }
    }


