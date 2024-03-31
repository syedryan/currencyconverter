import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        // Conversion rate from USD to EUR
        double conversionRate = 0.89;

        double eurAmount = usdAmount * conversionRate;

        System.out.println("Amount in EUR: " + eurAmount);

        scanner.close();
    }
}
