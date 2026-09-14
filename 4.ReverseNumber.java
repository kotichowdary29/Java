import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newnum = 0;
        while(num > 0){
            int rem = num % 10;
            newnum = newnum * 10 + rem;
            num = num / 10;
        } 
        System.out.println(newnum);
    }
}