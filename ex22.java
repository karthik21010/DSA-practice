import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int pow = sc.nextInt();
        int ans = 1;
        for(int i = 1; i <= pow; i++){
            ans = ans*base;
        }
        System.out.println(ans);
        sc.close();
    }
   
}
