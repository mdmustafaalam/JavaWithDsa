import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class WithoutLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        OneToN(n);
    }

    static void OneToN(int n) {
        if (n == 0) {
            return;
        } else {
            OneToN(n-1);
            System.out.print(n+ " ");
        }
    }
}
