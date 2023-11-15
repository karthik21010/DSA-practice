import java.util.*;
public class ex45 {
    static String Difference(int[] arr,int x){
    String ans = "No";
    for(int i = 0; i < arr.length; i++){
        for(int j = i+1; j < arr.length; j++){
            if(arr[j] - arr[i] == x){
                ans = "Yes";
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
      System.out.println(Difference(arr, x));
      sc.close();
   }
}
