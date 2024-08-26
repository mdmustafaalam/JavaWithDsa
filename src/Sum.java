import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = SumOfTwoNum(num1,num2);
        System.out.println("Sum Is: "+ ans);
    }
    static int SumOfTwoNum(int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }
}
