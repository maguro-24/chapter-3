import java.util.Scanner;

public class EvenInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        
        while(true)
        {
        System.out.println("Input a number higher than 2: ");
        int x = scan.nextInt();
        if (x < 2)
        {
            System.out.println("Invalid input");
        }
        else
        {
            for (int i = 2; i <= x; i++) {
                {
                 if (i%2 ==0)
                 {
                   sum += i;
                     System.out.println(i);
                     
                 }
                
                 }
                }
            }
        System.out.println("Sum: " + sum);
        sum = 0;
        }
        
        }
        
        
    }


