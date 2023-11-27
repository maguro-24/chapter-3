import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Give Ben a birthday message: ");
        String word = scan.nextLine();
        
        for (int i = 0; i < 14; i++) {
            System.out.println(word.charAt(i));
            
        }
    }
}
