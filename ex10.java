import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        System.out.println("The Area of Square : " +len*bre);
        if(len==bre) System.out.println("It's a Square");
        else System.out.println("It's a rectangle");
        sc.close();
    }
}
