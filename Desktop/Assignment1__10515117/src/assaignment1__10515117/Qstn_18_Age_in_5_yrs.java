

package assaignment1__10515117;

import java.util.Scanner;
public class Qstn_18_Age_in_5_yrs {
   
    public static void main(String[] args){
        int age, age_5, Mage;
        
        String name; 
        Scanner info  = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        name  = info.next();
        System.out.print("Hi, " + name + "! How old are you?");
        age  = info.nextInt();
        age_5  = age-5;
        Mage = age +5;
        
        System.out.printf("Did you know that in five years you will be %d years old? %n",Mage);
        System.out.printf("And five years ago you were %d! Imagine that! %n",age_5);
    }
}
