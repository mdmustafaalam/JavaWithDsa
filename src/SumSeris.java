import java.util.Scanner;

public class SumSeris {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = SumOfSeries(n);
        System.out.println("Sum Of Series is: "+ans);
    }

    static int SumOfSeries(int n) {
        int cont = 0;
        for (int i = 0; i <= n ; i++) {
            cont += i;
        }
        return cont;
    }
}
