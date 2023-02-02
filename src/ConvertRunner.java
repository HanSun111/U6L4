import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        int base = 0;
        String num = "";
        String thing = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+/";

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.println("Enter base; 1-64: ");

        for (int i = 0; i < 1; i++) {
            String choice = s.nextLine();
            if (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 65) {
                base = Integer.parseInt(choice);
            } else {
                System.out.println("Learn how to read dipstick");
                System.out.print("Enter base; 0-64: ");
                i--;
            }
        }

        System.out.print("Enter your *numbers/letters that is bigger than 0 and less than the limit of a java integer type: ");
        System.out.print("Enter your number (must be positive!): ");
        String number;
        boolean temp = true;
        for (int i = 0; i < 1; i++) {
            number = s.nextLine();
            for (int j = 0; j < number.length(); j++) {
                if (thing.indexOf(number.charAt(j)) > base || thing.indexOf(number.charAt(j)) < 0) {
                    temp = false;
                }
            }
            if (temp) {
                num = number;
            } else {
                System.out.println("That's not valid!");

                NumberConverter nc = new NumberConverter(num, base);
                int[] digits = nc.getDigits();
                System.out.println("\n\nDigit array: " + Arrays.toString(digits));
                System.out.println("Number: " + nc.display(nc.getDigits()));
                if (base != 2) {
                    System.out.println("Binary: " + nc.display(nc.convertEverything(2)));
                }
                if (base != 8) {
                    System.out.println("Octo: " + nc.display(nc.convertEverything(8)));
                }
                if (base != 10) {
                    System.out.println("Decimal: " + nc.display(nc.convertToDecimal()));
                }
                System.out.println("Choose another base to convert to: ");
                int newBase = s.nextInt();
                if (newBase > 64 || newBase < 0) {
                    System.out.println("All right that it, you want to be a smart ass, we restart if you want to get through this.");
                } else
                    System.out.println("Base " + base + ": " + nc.display(nc.convertEverything(base)));
            }
        }
    }
}
