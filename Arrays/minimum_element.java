import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        int mini = arr[0];
        for(int i = 1;i <= n-1;i++){
            if (arr[i] < mini){
                mini = arr[i];
            }
       }
       System.out.println("minimum element is " + mini);
    }
}
