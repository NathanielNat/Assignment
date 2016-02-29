
package assaignment1__10515117;
import java.util.Scanner;

public class Assaignment1__10515117 {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        String height;
        double weight;
        
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print("How tall are you");
        height  = keyboard.next();
        
        System.out.print("How much do you weigh");
        weight  = keyboard.nextDouble();
        
        System.out.printf("So you are %d years, %s tall and %g heavy%n",age ,height,weight);
    }
    
}
