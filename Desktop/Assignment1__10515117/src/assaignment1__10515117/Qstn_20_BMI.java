

package assaignment1__10515117;

import java.util.*;
public class Qstn_20_BMI {
    public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    double h,w;
    System.out.print("Your height in m: ");
     h = input.nextDouble();
     System.out.print("Your weight in kg: ");
     w  = input.nextDouble();
     double bm  = (w / h*h);
     System.out.printf("Your BMI is %g %n",bm);
     
    
}
    
}
