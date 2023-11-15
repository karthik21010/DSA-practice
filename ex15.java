import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator +,-,*,/ : ");
        String n = sc.next();
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        switch (n) {
            case "+":
                System.out.print("The Addition of "+x+" "+n+" "+y+" is : "+x+y);
                break;
            case "-":
                System.out.print("The Subtraction of "+x+" "+n+" "+y+" is : "+(x-y));
                break;
            case "*":
                System.out.print("The Multiplication of "+x+" "+n+" "+y+" is : "+x*y);
                break;
            case "/":
                System.out.print("The Division of "+x+" "+n+" "+y+" is : "+x/y);
                break;
        }
        sc.close();
    }
}
