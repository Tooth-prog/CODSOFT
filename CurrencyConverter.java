import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Predefined exchange rates
        double usdToInr = 83.50;
        double eurToInr = 91.20;
        double usdToEur = 0.92;

        System.out.println("Currency Converter");
        System.out.println("Available currencies: USD, EUR, INR");

        //Input source currency
        System.out.println("Enter source currency(USD/EUR/INR):");
        String fromCurrency = sc.next().toUpperCase();

        //Input target currency
        System.out.println("Enter target currency: (USD/EUR/INR)");
        String toCurrency= sc.next().toUpperCase();

        //Input amount
        System.out.println("Enter amount:");
        double amount = sc.nextDouble();

        double convertedAmount = 0;

        //Conversion logic
        if(fromCurrency.equals("USD")&& toCurrency.equals("INR")){
            convertedAmount = amount*usdToInr;
        } else if (fromCurrency.equals("USD")&& toCurrency.equals("INR")) {
            convertedAmount = amount/usdToInr;
        }else if(fromCurrency.equals("EUR")&& toCurrency.equals("INR")){
            convertedAmount = amount*eurToInr;
        } else if (fromCurrency.equals("EUR")&& toCurrency.equals("INR")){
            convertedAmount = amount/eurToInr;
        } else if (fromCurrency.equals("USD")&& toCurrency.equals("EUR")){
            convertedAmount = amount*usdToEur;
        } else if (fromCurrency.equals("USD")&& toCurrency.equals("EUR")){
            convertedAmount = amount/usdToEur;
        } else if (fromCurrency.equals(toCurrency)){
            convertedAmount = amount; //No conversion needed
        }else {
            System.out.println("Conversion for given currencies is not available.");
            System.exit(0);
        }

        //Output result
        System.out.printf("%.2f%s = %.2f%s\n", amount, fromCurrency, convertedAmount, toCurrency);

        sc.close();

    }
}