import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Values Before Swap : " +a+ " "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Values After Swap : " +a+ " "+b);
        sc.close();
    }
}
