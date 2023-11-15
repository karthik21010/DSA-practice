import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println(rev);
        /*for(int i = 0; i < num; ){
        rev = rev * 10 + num % 10;
        num = num / 10;
        }
        System.out.println(rev); */
        sc.close();
    }
}
