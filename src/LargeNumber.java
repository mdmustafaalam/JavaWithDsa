import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        LargeNumbers(num1,num2,num3);
    }

    static void LargeNumbers(int num1, int num2, int num3) {
        int ans = Math.max(Math.max(num2,num3),num1);
        System.out.println("Max Number is "+ ans);
    }
}
