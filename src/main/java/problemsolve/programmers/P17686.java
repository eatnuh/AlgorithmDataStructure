package problemsolve.programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/17686
public class P17686 {
    public String[] solution(String[] files) {
        Arrays.sort(files, (file1, file2) -> {
            String o1Head = getHead(file1);
            String o2Head = getHead(file2);
            int o1Number = getNumber(file1);
            int o2Number = getNumber(file2);

            int compareHead = o1Head.compareTo(o2Head);
            int compareNumber = o1Number - o2Number;

            return compareHead != 0 ? compareHead : compareNumber;
        });


        return files;
    }

    private int getNumber(String file) {
        StringBuilder numberBuilder = new StringBuilder();
        boolean find = false;
        for (int i = 0; i < file.length(); i++) {
            char c = file.charAt(i);
            if(isNumber(c)) {
                numberBuilder.append(c);
                find = true;
            } else if(find) {
                break;
            }
        }

        return Integer.parseInt(numberBuilder.toString());
    }

    private String getHead(String file) {
        StringBuilder headBuilder = new StringBuilder();
        for (int i = 0; i < file.length(); i++) {
            char c = file.charAt(i);
            if (!isNumber(c)) headBuilder.append(c);
            else break;
        }
        return headBuilder.toString().toLowerCase();
    }

    public boolean isNumber(char c) {
        return '0' <= c && c <= '9';
    }
}
