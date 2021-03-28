package prog.calculator;

public class Calculator {

    public String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public String[] operations = {"+", "-", "*", "/"};
    public int result = 0;

    public boolean check(String[] array, String value) {
        boolean test = false;
        for (String element : array) {
            if (element.equals(value)) {
                test = true;
                break;
            }
        }
        return test;
    }

    public void calculate(String valueX, String valueY, String operation) throws CalculatorException {
        if (check(arabicNumbers, valueX) && check(arabicNumbers, valueY)) {
            int x = Integer.parseInt(valueX);
            int y = Integer.parseInt(valueY);
            if (check(operations, operation)) {
                switch (operation) {
                    case "+": {
                        result = x + y;
                        break;
                    }
                    case "-": {
                        result = x - y;
                        break;
                    }
                    case "*": {
                        result = x * y;
                        break;
                    }
                    case "/": {
                        result = x / y;
                        break;
                    }
                }
            }
        } else throw new CalculatorException("Введите числа от 1 до 10");
    }

}

