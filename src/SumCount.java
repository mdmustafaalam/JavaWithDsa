import java.util.Scanner;

public class SumCount {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n1 = Sc.nextInt();
        int n2 = Sc.nextInt();

        int ans = sumCalc(n1,n2);
        System.out.println(ans);
    }

     static int sumCalc(int n1, int n2) {
        return n1+n2;
    }
}
