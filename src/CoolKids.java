import java.util.*;

public class CoolKids {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int age;
        
        boolean isFast;
        
        System.out.println("Is you fast? true/false");
        isFast = scan.nextBoolean();
        
        if (isFast = (true))
        {
            System.out.println("you're so cool.");       
            System.out.println("how old are you?");
            age = scan.nextInt();
            
            if (age == (69))
            {
                System.out.println("you're super cool");
            }
            
            else if (age >= 13)
            {
                System.out.println("nice");
            }
            else
            {
                System.out.println("you're cool, but you could be better");    
            }
        }

        else
        {
            System.out.println("you're not cool.");
            
            
        }
        
    }
}
