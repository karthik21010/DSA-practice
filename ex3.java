import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int result = sub1+sub2+sub3;
        System.out.println("Total Marks : "+result);
        System.out.println("Percentage : "+result/3+"%");
        sc.close();
    }
}
