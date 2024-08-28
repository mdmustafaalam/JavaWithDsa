public class Patern {
    public static void main(String[] args) {
        int n=5;
        Patern1(n);
//        Patern2(n);
    }
    static void Patern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i+1 ; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    static void Patern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i-1 ; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
