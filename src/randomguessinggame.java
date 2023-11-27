import java.util.*;

public class randomguessinggame {
    
    public static void main(String[] args) {
        
       
        Scanner scan = new Scanner(System.in);
        int num,guess;
        num = (int)(Math.random()*10+1);
        System.out.println("pick a number 1-10");
        guess = scan.nextInt();
     
       

        if (num == guess)
        {
            System.out.println("you are a smart person");

        }
        else{
            
            System.out.println("try again.");
        }
        
        
        
        
        
        
        
    }
    
    

}
