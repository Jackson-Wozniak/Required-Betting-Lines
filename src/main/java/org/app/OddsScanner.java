package org.app;

import java.util.Scanner;

public class OddsScanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static double findProbability() {
        while (true) {
            String input = scanner.next();
            input = input.replace("%", "");
            if (OddsScanner.isValidPercentage(input)) {
                return Double.parseDouble(input);
            }
            System.out.println("Percentage must be a valid number between 1 and 99%");
        }
    }

    public static boolean isValidPercentage(String input){
        input = input.replace("%", "");
        if(input.isBlank() || input.isEmpty()) return false;
        try{
            double percentage = Double.parseDouble(input);
            if(percentage >= 100 || percentage <= 0){
                return false;
            }
        }catch (Exception ex){
            return false;
        }
        return true;
    }
}
