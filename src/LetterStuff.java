import java.util.Scanner;

public class LetterStuff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String word, result = "";
        System.out.println("Enter a word: ");
        
        word = scan.next();
        
        word = word.toLowerCase();
        
        for (int i = 0; i <  word.length(); i++)
        {
            if(word.charAt(i) == 'f')
            {
                result += "X";
            }
            else
            {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }

}
