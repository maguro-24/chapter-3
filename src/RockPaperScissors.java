import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean again = true;
        int hs = 0;
        int cs = 0;
        
        String[] choices = {"Rock" , "Paper" , "Scissors"};
        
        while (again == true)
        {
            System.out.println("Rock, paper, scissors, or quit to stop. || you: " + hs + " bot: " + cs);
            String playerinput = scan.nextLine();
            
            if (playerinput.equalsIgnoreCase("quit"))
                    {
                        break;
                    }
            else if (!playerinput.equalsIgnoreCase("rock") && !playerinput.equalsIgnoreCase("paper") && !playerinput.equalsIgnoreCase("scissors"))
                    {
                        System.out.println("Invalid input");
                    }
            
            else 
            {
                int comp = rand.nextInt(3);
                String compchoice = choices[comp];
                
                if(playerinput.equalsIgnoreCase(compchoice))
                {
                    System.out.println("tie");  
                }
                else if((playerinput.equalsIgnoreCase("rock") && (compchoice.equals("Scissors")) ||
                        (playerinput.equalsIgnoreCase("paper")) && (compchoice.equals("Rock")) ||
                        (playerinput.equalsIgnoreCase("scissors")) && compchoice.equals("Paper")))
                {
                    System.out.println("you win. +1");
                    hs++;
                }
                else
                {
                    System.out.println("comp win");
                    cs++;
                }
                
                
            }
            
            
            
            
            
        }
        
        
        
    }
}



