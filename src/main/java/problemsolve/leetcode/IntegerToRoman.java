package problemsolve.leetcode;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder romanBuilder = new StringBuilder();

        while (num >= 1000) {
            romanBuilder.append(toSymbol(1000));
            num -= 1000;
        }

        if (num >= 900) {
            romanBuilder.append(toSymbol(100));
            romanBuilder.append(toSymbol(1000));
            num -= 900;
        }

        if (num >= 500) {
            romanBuilder.append(toSymbol(500));
            num -= 500;
        }

        if (num >= 400) {
            romanBuilder.append(toSymbol(100));
            romanBuilder.append(toSymbol(500));
            num -= 400;
        }

        while (num >= 100) {
            romanBuilder.append(toSymbol(100));
            num -= 100;
        }

        if (num >= 90) {
            romanBuilder.append(toSymbol(10));
            romanBuilder.append(toSymbol(100));
            num -= 90;
        }

        if (num >= 50) {
            romanBuilder.append(toSymbol(50));
            num -= 50;
        }

        if (num >= 40) {
            romanBuilder.append(toSymbol(10));
            romanBuilder.append(toSymbol(50));
            num -= 40;
        }

        while (num >= 10) {
            romanBuilder.append(toSymbol(10));
            num -= 10;
        }

        if (num >= 9) {
            romanBuilder.append(toSymbol(1));
            romanBuilder.append(toSymbol(10));
            num -= 9;
        }

        if (num >= 5) {
            romanBuilder.append(toSymbol(5));
            num -= 5;
        }

        if (num >= 4) {
            romanBuilder.append(toSymbol(1));
            romanBuilder.append(toSymbol(5));
            num -= 4;
        }

        while (num >= 1) {
            romanBuilder.append(toSymbol(1));
            num -= 1;
        }


        return romanBuilder.toString();

    }

    public char toSymbol(int num) {
        return switch (num) {
            case 1000 -> 'M';
            case 500 -> 'D';
            case 100 -> 'C';
            case 50 -> 'L';
            case 10 -> 'X';
            case 5 -> 'V';
            case 1 -> 'I';
            default -> '?';
        };
    }
}
