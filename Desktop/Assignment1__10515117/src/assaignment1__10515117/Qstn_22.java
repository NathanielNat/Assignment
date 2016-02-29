
package assaignment1__10515117;
import java.util.Scanner;

public class Qstn_22 {
    
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int age;
        String name;
        System.out.print("Hey, wha'ts your name? ");
        name  = input.next();
        System.out.println(" ");
        System.out.printf("Ok,%s ,how old are you?",name);
        age  = input.nextInt();
        System.out.println(" ");
        
        if (age <16){
            System.out.printf("You can't drive, %s %n",name);
            System.out.printf("You can't vote, %s %n", name);
            System.out.printf("You can't rent a car, %s %n", name);
        }
        else if(age < 18){
            System.out.printf("You can't vote, %s %n", name);
            System.out.printf("You can't rent a car, %s %n", name);
        } 
        else if(age < 25){
            System.out.printf("You can't rent a car, %s %n", name);
        }
        else{
            
            
              System.out.printf("You can do anithing, %s %n",name);
        }
    }
}
