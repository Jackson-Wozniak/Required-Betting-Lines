package org.app;

import java.text.DecimalFormat;

public class OddsConversion {

    private static final DecimalFormat decimalFormat = new DecimalFormat(".00");

    public static String decimalToAmericanOdds(double decimalOdds){
        if(decimalOdds < 2){
            return String.valueOf((int) Math.ceil(-100 / (decimalOdds - 1)));
        }
        return "+" + (int) Math.ceil((decimalOdds - 1) * 100);
    }

    public static double probabilityToDecimalOdds(double probability){
        return Double.parseDouble(decimalFormat.format(1 / (probability / 100)));
    }
}
