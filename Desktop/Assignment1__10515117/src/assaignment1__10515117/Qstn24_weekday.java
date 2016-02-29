

package assaignment1__10515117;

import java.util.Scanner;

public class Qstn24_weekday {
    public static void main(String[] args){
    Scanner day = new Scanner(System.in);
    int num;
    System.out.println("Enter day number");
    num  = day.nextInt();
    
    if(num == 1){
        System.out.printf("Weekday %d: Sunday %n",num);
    }
   else if(num == 2){
        System.out.printf("Weekday %d: Monday %n",num);
    }
   else if (num ==3){
        System.out.printf("Weekday %d: Tuesday%n",num);
    }
   else if (num == 4){
        System.out.printf("Weekday %d: Wednesday%n",num);
    }
   else if (num == 5){
        System.out.printf("Weekday %d: Thursday%n",num);
    }
   else if (num == 6){
        System.out.printf("Weekday %d: Friday%n",num);
    }
   else if (num == 7){
        System.out.printf("Weekday %d: Saturday%n",num);
    }
   else if (num == 0){
        System.out.printf("Weekday %d: Sunday%n",num);
    }
   else{
       System.out.printf("Weekday %d: error %n",num );
   }
}
}
