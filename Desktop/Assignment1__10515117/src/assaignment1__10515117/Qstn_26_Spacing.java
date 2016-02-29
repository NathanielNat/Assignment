

package assaignment1__10515117;

import java.util.Scanner;

public class Qstn_26_Spacing {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       double mass;
       int num;
      
       System.out.print("Please enter your current earth weight: ");
       mass = input.nextDouble();
       System.out.println(" ");
       
       System.out.println("I have information for the follow planets: ");
       System.out.println("\t 1.Venus \t 2.Mars \t 3.Jupiter");
       System.out.println("\t 4.Saturn \t 5.Uranus \t 6.Neptune");
       System.out.println(" ");
       System.out.print("Which planet are you visiting? ");
       num  = input.nextInt();
      if (num  == 1){
          System.out.println("Your weight would be" +mass*.78 +"on that planet");
      }
       if (num  == 2){
          System.out.println("Your weight would be" +mass*.39 +"on that planet");
      }
       if (num  == 3){
          System.out.println("Your weight would be" +mass*2.56 +"on that planet");
      }
       if (num  == 4){
          System.out.println("Your weight would be" + mass*1.17 +"on that planet");
      }
       if (num  == 5){
          System.out.println("Your weight would be" +mass*1.05 +"on that planet");
      }
       if (num  == 6){
          System.out.println("Your weight would be" +mass*1.23 +"on that planet");
      }
      
   }
   
   } 

