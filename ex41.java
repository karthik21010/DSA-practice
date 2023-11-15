import java.util.Scanner;

public class ex41 {
    static int triplet(int[] arr, int x){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == x){
                        ans++;      
                    }
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
       System.out.println("The triplets are : "+triplet(arr, x));
       sc.close();
    }
}
