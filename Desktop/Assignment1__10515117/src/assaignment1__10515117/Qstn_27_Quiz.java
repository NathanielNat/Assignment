

package assaignment1__10515117;

import java.util.Scanner;
public class Qstn_27_Quiz {
    
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int ansa, total = 3;
        
        System.out.print("Are you readey for the quiz? ");
        System.out.println("Okay here, it comes!");
        System.out.println("Q1) What is the capial of Alaka?");
        System.out.println("\t 1)Melbourge \n\t 2)Anchorge \n\t 3)Juneau");
        ansa = in.nextInt();
        if (ansa == 3){
            System.out.println("That's right!");
        }
        else {
            total  -= 1;
        }
       System.out.println(" Can you store the value \"cat\" in a variable of type int?");
       System.out.println("\t 1) yes \n\t 2)no ") ;
       ansa  = in.nextInt();
       if (ansa == 1){
       System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
       total -= 1;
       }
       else{
           System.out.println("That's right!");
       }
       System.out.println("What is the result of 9+6/3? \n\t 1)5 \n\t 2)11 \n\t 3)15/3");
       ansa = in.nextInt();
       if (ansa == 2){
        System.out.println("That's correct");
       }
       else{
       System.out.print("Wrong");
       total -=1;
               }
       
       
       System.out.print("Overall you got " +total +" out oof 3 correct;");
       System.out.println("Thanks for playing!");
       
}
    
}