import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String field = sc.next();
        System.out.println(name);
        System.out.println(age);    
        System.out.println(field);
        sc.close();
        }
}
