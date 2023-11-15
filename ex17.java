import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int fib1 = 1;
         int fib2 = 1;
         for(int i = 0; i <= n; i++){
            System.out.print(fib1+" ");
            int sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
         }
        sc.close();
    }
}
