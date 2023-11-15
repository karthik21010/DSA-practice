import java.util.Scanner;

public class ex34 {
    static int last_Occurrence(int[] arr , int x){
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
            ans = i;
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
       System.out.print("The Last Occurrence of number is : " +last_Occurrence(arr, x));
       sc.close();
    }
}
