import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your full name : ");
        // String FullName=sc.next(); this will not consider input after space,tab
        // String FullName=sc.nextLine();
        // System.out.println(FullName);
        System.out.println("Enter your first name : ");
        String Fname=sc.next();
        System.out.println("Enter your last name : ");
        String Lname=sc.next();
        String FullName=Fname + " " + Lname;
        System.out.println(FullName); 
    }
}
