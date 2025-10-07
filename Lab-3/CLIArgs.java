public class CLIArgs {
    public static void main(String[] args) {
        // check if exactly three arguments are provided, if yes, then accept
        if (args.length != 3) {
            System.out.println("Incorrect Number of Arguments:\n  Correct Usage: CS212 <amount> <sourceCurrency> <targetCurrency>");
            return;
        }
        try {
            // collect variables from command-line argument
            double amount = Double.parseDouble(args[0]);
            String sourceCurrency = args[1].toUpperCase();
            String targetCurrency = args[2].toUpperCase();
            // define exchange rates
            double usdToEur = 0.91;
            double usdToInr = 83.0;
            double eurToUsd = 1.10;
            double inrToUsd = 0.012;

            double convertedAmount;
            // convert currency as per the exchange rates
            if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
                convertedAmount = amount * usdToEur;
            } else if (sourceCurrency.equals("USD") && targetCurrency.equals("INR")) {
                convertedAmount = amount * usdToInr;
            } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
                convertedAmount = amount * eurToUsd;
            } else if (sourceCurrency.equals("INR") && targetCurrency.equals("USD")) {
                convertedAmount = amount * inrToUsd;
            } else {
                // handle case in which invalid currencies are provided
                System.out.println("Unsupported currency conversion.");
                return;
            }
            // display the amount result
            System.out.printf("Conversion Result(%s -> %s): %.2f%n", sourceCurrency, targetCurrency, convertedAmount);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid Arguments. Please enter valid numbers.");
        }
    }
}
