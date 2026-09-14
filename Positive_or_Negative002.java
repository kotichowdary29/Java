import java.util.*;
public class Positive_or_Negative002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0){
            System.out.println(num + " is a Positive value");
        }
        else if (num < 0){
            System.out.println(num + " is a Negative value");
        }
        else{
            System.out.println("It is a ZERO,it is either positive or negative");
        }
        sc.close();
    }
}

