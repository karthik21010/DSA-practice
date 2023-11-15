import java.util.Scanner;

public class ex40 {
    static int target_sum(int[] arr , int x){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
        for(int j = i+1; j < arr.length; j++){
            if(arr[i] + arr[j] == x){
                ans++;
            }
        }
        }
        return ans;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int[] arr = new int[s];
       for(int i = 0; i < arr.length; i++){
       arr[i] = sc.nextInt();
       }
       int x = sc.nextInt();
       System.out.println("The target Pairs are : "+target_sum(arr, x));
       sc.close();
    }
}
