
package assaignment1__10515117;
import java.util.Scanner;

public class Questn_17_MoreUser {
    public static void main(String[] args){
    String Fname, Lname, stuID,Login;
    double GPA;
    int grade;
    Scanner info  =new Scanner(System.in);
    System.out.println("Please enter the following information so I can sell it for a profit");
    System.out.print("First name: ");
    Fname  = info.next();
    
    System.out.print("Last name: ");
    Lname  = info.next();
    
    System.out.print("Grade (9-12) : ");
    grade = info.nextInt();
    
    System.out.print("Student ID:");
    stuID = info.next();
    
    System.out.print("Login: ");
    Login  =info.next();
    
    System.out.print("GPA (0.0-4.0): ");
    GPA = info.nextDouble();
    
    System.out.printf("Your information:%n\t\t\tLogin:%s\t\t\t%n\t\t\tID:%s%n\t\t\tName:%s,%s%n\t\t\tGPA:%g%n\t\t\tGrade:%d%n",Login, stuID,Lname,Fname,GPA,grade);
    }
    
}
