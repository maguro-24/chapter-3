import java.util.*;


public class HiLoGame {
    public static void main (String[] args)
    {
        final int MAX = 100;
        int answer, guess;
        Scanner scan = new Scanner (System.in);
        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;
        System.out.print ("I'm thinking of a number between 1 and " + MAX + ". Guess what it is: ");
        guess = scan.nextInt();
        
               
         for (int i = 0; i < answer; i++) {

             if (guess == answer) 
             {
                 System.out.println("You got it!");
                 break;
             }
             else if (guess > answer)
             {
                 System.out.println("Lower");
                 guess = scan.nextInt();
             }

             else
             {
                 System.out.println("Higher");
                 guess = scan.nextInt();
             }
            
        }
    }   
}

