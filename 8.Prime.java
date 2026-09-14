import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not a prime");
        } 
        else {

            boolean prime = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println("Prime");
            } 
            else {
                System.out.println("Not a prime");
            }
        }
    }
}