
package assaignment1__10515117;

import java.util.Scanner;
public class Questn_16_Salary {
    public static void main(String[] args){
        Scanner info  = new Scanner(System.in);
        String name;
        int age;
        double salary;
    System.out.println("Hello. What is your name?");
    name  = info.next();
    
    System.out.printf("Hi,%s! How old are you?",name);
    age  = info.nextInt();
    
    System.out.printf("SO you're %d, eh? That's not old at all! %n",age);
    System.out.printf("How much do you make %s ?",name);
    salary  = info.nextDouble();
    
    System.out.printf("%g! i hope that's per hour and not per year! Lol! ",salary);
            
    }
}
