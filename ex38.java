import java.util.Scanner;

public class ex38 {
    static int Repeating_number(int[] arr){
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
        for(int j = i+1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                ans = i;
            }
        }}
        return ans;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int[] arr = new int[s];
       for(int i = 0; i < arr.length; i++){
       arr[i] = sc.nextInt();
       }
       System.out.println(Repeating_number(arr));
       sc.close();
    }
}
