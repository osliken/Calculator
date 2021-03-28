package prog.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input:");

        String out = scanner.nextLine();
        String[] array = out.split(" ");

        RomanNumbers calc = new RomanNumbers();
        try {
            if (array.length == 3) {
                if (!calc.check(calc.romanNumbers, array[0])) {
                    calc.calculate(array[0], array[2], array[1]);
                } else {
                    String x = calc.romanToInteger(array[0]);
                    String y = calc.romanToInteger(array[2]);
                    calc.calculate(x, y, array[1]);
                }
            } else System.out.println("Введите два числа");
        } catch (CalculatorException e) {
            e.printStackTrace();
        }

        System.out.println("Output:");
        if (calc.number.equals("")) {
            System.out.println(calc.result);
        } else {
            calc.integerToRoman(calc.result);
            System.out.println(calc.number);
        }

        scanner.close();

    }

}

