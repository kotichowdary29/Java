import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        for (int j = 0;j<= n-1;j++){
            if (arr[j] % 2 == 0){
                System.out.print(Arrays.toString(new int[]{arr[j]}));
            }
        }
        //System.out.println(array);
    }
}
