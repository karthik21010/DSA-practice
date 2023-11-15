import java.util.Arrays;
import java.util.Scanner;

public class ex39 {
    static int[] sort(int[] arr){
        Arrays.sort(arr);
        int[] ans = {};
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int[] arr = new int[s];
       for(int i = 0; i < arr.length; i++){
       arr[i] = sc.nextInt();
       }
       int[] ans = sort(arr);
       for(int j = 0; j < ans.length; j++){
       System.out.print(ans[j]+ " ");
       }
       sc.close();
    }
}
