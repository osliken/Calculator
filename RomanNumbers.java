package prog.calculator;

public class RomanNumbers extends Calculator{

    public String[] romanNumbers = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public String number = "";

    public String[] hundredRomanHumbers =
            {"I","II","III","IV","V","VI","VII","VIII","IX","X",
            "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
            "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
            "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLXII","XLXIII","XLIX","L",
            "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
            "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
            "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
            "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
            "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};

    public String romanToInteger(String value) throws CalculatorException {
        switch (value) {
            case "I": {
                number = "1";
                break;
            }
            case "II": {
                number = "2";
                break;
            }
            case "III": {
                number = "3";
                break;
            }
            case "IV": {
                number = "4";
                break;
            }
            case "V": {
                number = "5";
                break;
            }
            case "VI": {
                number = "6";
                break;
            }
            case "VII": {
                number = "7";
                break;
            }
            case "VIII": {
                number = "8";
                break;
            }
            case "IX": {
                number = "9";
                break;
            }
            case "X": {
                number = "10";
                break;
            }
            default: throw new CalculatorException("Введите числа от 1 до 10");
        }
        return number;
    }

    public void integerToRoman(int result) {
        number = hundredRomanHumbers[result - 1];
    }

}
