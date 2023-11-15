import java.util.Scanner;

public class ex35 {
    static int No_Greater(int[] arr , int x){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
        if(arr[i] > x){
            ans++;
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
       System.out.print("The no of Occurrences are : " +No_Greater(arr, x));
       sc.close();
    }
}
    
