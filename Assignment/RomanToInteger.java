import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        
        int integer = romanToInt(romanNumeral);
        
        if (integer == -1) {
            System.out.println("Invalid Roman numeral input.");
        } else {
            System.out.println("Integer value: " + integer);
        }
    }
    
    public static int romanToInt(String s) {
       
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int result = 0;
        int i = 0;
        
        while (i < s.length()) {
            for (int j = 0; j < symbols.length; j++) {
                if (i + symbols[j].length() <= s.length() && s.substring(i, i + symbols[j].length()).equals(symbols[j])) {
                    result += values[j];
                    i += symbols[j].length();
                    break;
                }
            }
        }
        
        if (i < s.length()) {
            return -1;
        }
        
        return result;
    }
}
