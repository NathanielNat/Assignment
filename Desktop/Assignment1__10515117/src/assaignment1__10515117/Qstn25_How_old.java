

package assaignment1__10515117;

import java.util.Scanner;
public class Qstn25_How_old {
    public static void main(String[] args){
    Scanner in  = new Scanner(System.in);
    String name;
    int age;
    System.out.print("Hey, what's your name? (Sorry I keep forgerting.) ");
    name  = in.next();
    System.out.printf("Ok, %s, how old are you? %n",name);
    age  = in.nextInt();
    if (age<16){
        System.out.println("You can't drive " + name);
    }
    else if (age  >= 16 && age<=17){
        System.out.println("You can drive but you not vote. " + name);
    }
    else if (age >= 18 && age <= 24){
        System.out.println("You can vote but not rent a car. " + name );
    }
    else if (age >= 25){
        System.out.println("You can do pretty anything " +name);
    }
    }
    
}
