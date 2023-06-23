package org.app;

public class BettingOddsProfitability {

    public static void main(String[] args) {
        System.out.print("What is the probability of your bet hitting? (0-100%): ");
        double odds = OddsScanner.findProbability();
        double decimalOdds = OddsConversion.probabilityToDecimalOdds(odds);
        printResults(OddsConversion.decimalToAmericanOdds(decimalOdds), decimalOdds);
    }

    public static void printResults(String americanOdds, double decimalOdds){
        System.out.println("Based on the known probability, your bet requires the following odds" +
                " to break even:\n" +
                "   American: " + americanOdds + "\n" +
                "   Decimal: " + decimalOdds);
    }
}
