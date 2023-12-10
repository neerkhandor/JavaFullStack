import java.util.Scanner;
class one{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NO");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NO");
        float b = sc.nextFloat();
        float result = a+b;
        System.out.println(result);
    }
}