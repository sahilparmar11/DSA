import java.util.Scanner;

public class L6B36 {

    public static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("temparture in fahrenheit:" + fahrenheit);
    }

    public static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("temparture in celsius:" + celsius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit of temperature: ");
        int temp = sc.nextInt();

        switch (temp) {
            case 1:
            System.out.println("Enter temparture in celsius: ");
                double Celsius = sc.nextDouble();
                celsiusToFahrenheit(Celsius);
                break;

            case 2:
            System.out.println("Enter temparture in fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                fahrenheitToCelsius(fahrenheit);
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();

        // if (temp == "Celsius") {
        // double Celsius = sc.nextDouble();
        // celsiusToFahrenheit(Celsius);

        // } else if (temp == "fahrenhit") {
        // double fahrenheit = sc.nextDouble();
        // fahrenheitToCelsius(fahrenheit);

        // }else{
        // System.out.println("Invalid Unit");
        // }
    }
}
