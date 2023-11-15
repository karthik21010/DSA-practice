import java.util.Scanner;

public class ex43 {
    static int find_max(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int find_second_max(int[] arr){
        int mx = find_max(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_max = find_max(arr);
        return second_max;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int[] arr = new int[s];
       for(int i = 0; i < arr.length; i++){
       arr[i] = sc.nextInt();
       }
       System.out.println("The Second Max Element is : "+find_second_max(arr));
       sc.close();
    }
}
