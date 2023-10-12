import java.util.HashMap;
import java.util.Scanner;
public class Romannumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); 
        scanner.close();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer equivalent: " + result);
    }
    private static int romanToInteger(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentNumeral = romanMap.get(s.charAt(i));
            if (i < s.length() - 1) {
                int nextNumeral = romanMap.get(s.charAt(i + 1));
                if (currentNumeral < nextNumeral) {
                    result -= currentNumeral;
                } else {
                    result += currentNumeral;
                }
            } else {
                result += currentNumeral;
            }
        }
        return result;
    }
}
