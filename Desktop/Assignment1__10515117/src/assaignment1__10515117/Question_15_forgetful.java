
package assaignment1__10515117;
import java.util.Scanner;

public class Question_15_forgetful {

public static void main(String[] args){
    Scanner reply  = new Scanner(System.in);
    System.out.println("Give me a word!");
   reply.next();
   System.out.println("Give me another word");
   reply.next();
   
   System.out.println("Great, now your favorite number");
   reply.nextInt();
   System.out.println("And your second-favrite number...");
   reply.nextInt();
   
   System.out.println("Whew! Wasn't that fun?");
   
}
}
