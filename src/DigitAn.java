import java.util.Scanner;

public class DigitAn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int o = 0;
        int e = 0;
        int z = 0;
                
        System.out.println("Input Number: ");
        int x = scan.nextInt();
        

       while(x > 0)
       {
          if ((x%10) == 0)
          {
              z++;
          }
          else if (x%2 ==0)
          {
              e++;
          }
          else
          {
              o++;
          }
          x /= 10;
     
       } 
       System.out.println("odd: " + o + " even: " + e + " zeros: " + z);
    }
}
