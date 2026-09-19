import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> array = new ArrayList<>();
        for (int j = 0;j<= n-1;j++){
            if (arr[j] % 2 == 0){
                array.add(arr[j]);
            }
        }
        System.out.println(array);
    }
}
