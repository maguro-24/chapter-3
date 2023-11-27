
public class Stars {
  public static void main(String[] args) {
        final int x = 10;
        for (int i = 0; i <= x; i++)
        {
            for (int j=(1); j <= x-i; j++) 
                {
                System.out.print(" ");
                }
               
             for (int s = 0; s <= i; s++) 
                {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
