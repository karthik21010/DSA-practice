import java.util.Scanner;

public class ex36 {
    static boolean Array_sort(int[] arr){
        boolean ans = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                ans = false;
                break;
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
       System.out.println("Is Given Array Is Sorted : "+Array_sort(arr));
       sc.close();
    }
}

