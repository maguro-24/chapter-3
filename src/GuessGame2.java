import java.util.*;

public class GuessGame2 {
   
    public static void main(String[] args) {

    int random, guess;
    int lives = 5;
    int score = 0;
    int hs = 0;
    boolean again;
    
    Scanner scan = new Scanner(System.in);
    
     
     while(lives >= 1)
        {
             random = (int)(Math.random()*5+1);
        
            System.out.println("Score: " + score + " | lives: " + lives);
          
          System.out.println("Guess a number 1-5");
          guess = scan.nextInt();
        
          if (guess == random)
          {
             System.out.println("corret!");
              score++;
          }
        
           else
          { 
            System.out.println("It was: " + random);
            System.out.println("Try again");
            lives--;
        }
    while (lives == 0)
        {
          System.out.println("Out of lives.");
          System.out.println("Final score: " + score);
            System.out.println("Do you want to play again? true/false");
            again = scan.nextBoolean();
            if(again = (true))
            {
                if (score > hs){
                    
                    hs = score;
                    lives = 5;
                    score = 0;
            }        
                else
                 {
                    lives = 5;
                    score = 0;
                 }
                }
               
            else
            {
                System.out.println("High score: ");
            }
        }
        
        }
    
       }
    
    
    }
    
    
    
    
    
    
    

