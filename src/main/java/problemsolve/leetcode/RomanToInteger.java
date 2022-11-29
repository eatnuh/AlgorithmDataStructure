package problemsolve.leetcode;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public int romanToInt(String s) {
        int romanToInteger = 0;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            int symbolToInteger = convert(symbol);
            romanToInteger += (i + 1 < s.length() && convert(s.charAt(i + 1)) > symbolToInteger) ? -symbolToInteger : symbolToInteger;
        }

        return romanToInteger;
    }

    private int convert(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
