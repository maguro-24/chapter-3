import java.util.Scanner;

public class StringReader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        String x = scan.nextLine();
       
        for (int i = 0; i < x.length() ; i++) {
            
            System.out.println(x.charAt(i));
        }
    }
}
