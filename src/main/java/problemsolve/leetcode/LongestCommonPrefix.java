package problemsolve.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int index = 0;
        while(true) {
            char curChar = '.';
            for(String str : strs) {
                if(str.length() == index)
                    return sb.toString();
                if(curChar != '.' && curChar != str.charAt(index))
                    return sb.toString();
                curChar = str.charAt(index);
            }
            sb.append(curChar);
            index++;
        }
    }
}
