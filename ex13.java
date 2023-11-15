import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CP= sc.nextInt(); // CP = Cost Price
        int SP = sc.nextInt(); // SP = Selling Price
        int profit = SP-CP;
        int loss = CP-SP;
        if(CP>SP) System.out.println("Loss : "+loss);
        if(SP>CP) System.out.println("Profit : "+profit);
        else System.out.println("No Profit or No Gain");
        sc.close();
    }
}
