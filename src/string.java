import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in;
        int a=0,e=0,i=0,o=0,u=0,c=0,s=0,p=0;
        
        System.out.println("Input a string: ");
        in = scan.nextLine();
        
        in = in.toLowerCase();

        for (int j = 0; j < in.length(); j++) 
        {
           char x = in.charAt(j);
           if (x == 'a')
           {
                 a++;
           }
           else if (x == 'e')
           {
                e++;
           }   
           else if (x == 'i')
           {
               i++;
           }
           else if (x == 'o')
           {
               o++;
           }
           else if (x == 'u')
           {
               u++;
           }
           else if (x == ' ')
           {
               s++;
           }
           else if (x >= 'a' && x <= 'z')
           {
               c++;
           }
           else
           {
               p++;
           }

        }

        System.out.println("A: "+a);
        System.out.println("E: "+e);
        System.out.println("I: "+i);
        System.out.println("O: "+o);
        System.out.println("U: "+u);
        System.out.println("Consonants: "+c);
        System.out.println("Spaces: "+s);
        System.out.println("Punctuation: "+p);
    }

}


