public class ex29 {
    public static void main(String[] args) {
        int[] arr = {1,5,3};
        int x = 6;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
        if(arr[i] == x){
            ans = i;    
        }
    }
    System.out.println(ans);    
    }
}
