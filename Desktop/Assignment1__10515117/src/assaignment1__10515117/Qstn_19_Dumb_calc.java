
package assaignment1__10515117;

import java.util.Scanner;
public class Qstn_19_Dumb_calc {
    
    public static void main(String[] args){
    Scanner num  = new Scanner(System.in);
    double num1, num2, num3, ansa;
    System.out.print("What is your first number?");
    num1  = num.nextDouble();
    
    System.out.print("What is your second number?");
    num2  =num.nextDouble();
    System.out.print("What is your third number?");
    num3 = num.nextDouble();
    
    ansa  =( num1+ num2 +num3)/2;
    System.out.printf("(%g + %g + %g )/ 2 is .....%g %n",num1,num2,num3,ansa);
    
    }
}
