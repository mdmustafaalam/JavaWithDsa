import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        isPrime(num);
    }
    static void isPrime(int N){
        // code here
        if (N <= 1){
            System.out.println(N+ " It's not a Prime Number.");
        }
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                System.out.println(N + " It's not a Prime Number");
            }
        }
    }
}
