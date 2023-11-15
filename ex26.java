import java.util.Scanner;

public class ex26 {

static void sum_arr(int arr[]){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
        }
    System.out.println(sum);
  }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }
        sum_arr(arr);
        sc.close();
}}

