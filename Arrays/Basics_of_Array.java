import java.util.*;
class Main{
    public static void main(String[] args){
        //Array Initialization or creating an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; //Array initialization of sizw n
        for (int i = 0;i <= n-1;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]);
        }
    }
}