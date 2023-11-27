
import java.util.*;
import java.lang.Math;

public class Slot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 100, x, y, z;
        String spin;
        while (true) {
            System.out.println("Spin or quit || money: " + m);
            spin = scan.nextLine();
            if (spin.equalsIgnoreCase("spin"))
            {
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);
                z = (int) (Math.random() * 10);
  
                System.out.println(" _____________ ");
                System.out.println("|    LUCKY!   |");
                System.out.println("| === === === |");
                System.out.println("| |" + x + "| |" + y + "| |" + z + "| |");
                System.out.println("| === === === | o");
                System.out.println("|             |//");
                System.out.println("|     ___     |/");
                System.out.println("|    |   |    |");
                System.out.println("|    =====    |");
                System.out.println("|_____________|");
                
                if (x == 7 && y == 7 && z == 7)
                {
                    System.out.println("777 JACKPOT!!!!! +500");
                    m+=500;
                }
                
                else if(x == y && x==z)
                {
                    System.out.println("JACKPOT! +200");
                    m+=200;
                }
                else if(x == y || x == z || y == z)
                {
                    System.out.println("+10");
                    m+=10;
                }
                else
                {
                    System.out.println("-5");
                    m-=5;
                    if(m==0)
                    {
                        System.out.println("YOU'RE BROKE LOL");
                        break;
                    }
                }
                    
                

            } 
            else if (spin.equalsIgnoreCase("quit"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid input.");
            }

        }
    }
}
