import java.util.Scanner;

public class ex33 {
    static int No_of_Occurrences(int[] arr ,int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
        if(arr[i] == x){
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int[] arr = new int[s];
       for(int i = 0; i < arr.length; i++){
       arr[i] = sc.nextInt();
       }
       int x = sc.nextInt();
       System.out.print("The no of Occurrences are : " +No_of_Occurrences(arr, x));
       sc.close();
    }
}
