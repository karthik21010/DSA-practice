import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        int marks = sc.nextInt();
        if(marks > 90 && marks <= 100) System.out.println("Your Grade is A+");
        if(marks > 80 && marks <= 90) System.out.println("Your Grade is A");
        if(marks > 70 && marks <= 80) System.out.println("Your Grade is B+");
        if(marks > 60 && marks <= 70) System.out.println("Your Grade is B");
        if(marks > 50 && marks <= 60) System.out.println("Your Grade is C");
        if(marks > 50 && marks <= 40) System.out.println("Your Grade is D");
        if(marks > 40 && marks < 30) System.out.println("Your Grade is E");
        if(marks > 0 && marks < 30) System.out.println("Your Grade is F");
        sc.close();
    }
}
