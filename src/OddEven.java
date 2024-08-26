import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        OddOrEven(num);
    }

    static void OddOrEven(int num) {
        if (num <= 0){
            System.out.println("Please answer valid Number");
        } else if (num%2 == 0) {
            System.out.println(num + " is a Even Number");
        } else {
            System.out.println(num + " is a Odd Number");
        }
    }
}
