public class ex28 {
    public static void main(String[] args) {
        int[] arr = { 6,5,3,2,8,4 };
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is : "+max);
    }
}
