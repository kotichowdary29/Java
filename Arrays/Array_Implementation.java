import java.util.ArrayList;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        //arr.add(10);
        //arr.add(20);
        //arr.add(30);
        for (int i = 0; i<n;i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        System.out.println(arr);
    }
}