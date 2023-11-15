import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            if(n == 0 && n == 1){
            System.out.println(fact);
            break;
            }
            else{
                fact = fact*i; 
            }
        }
        System.out.println(fact);
        sc.close();
    }
    
}
