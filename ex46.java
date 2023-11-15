import java.util.Scanner;

public class ex46 {
    static int occurrences(int[] arr,int x){
    int ans = 0;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == x){
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
       System.out.println("The No of Occurrences is : "+occurrences(arr, x));
       sc.close();
    }
}
