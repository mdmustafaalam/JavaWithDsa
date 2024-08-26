import java.util.Scanner;

public class TempFC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Fahrenheit Value: ");
        float tempF = in.nextFloat();
        System.out.print("Please Enter Celsius Value: ");
        float tempC = in.nextFloat();

        tempCelsius(tempF);
        TempFahrenheit(tempC);
    }

    static void TempFahrenheit(float tempC) {
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Fahrenheit is: " + tempF);
    }

    static void tempCelsius(float tempF) {
        float tempC = (tempF - 32) * 5/9;
        System.out.println("Celsius is: "+ tempC);
    }
}
