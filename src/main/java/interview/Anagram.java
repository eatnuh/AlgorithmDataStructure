package interview;

import java.util.Arrays;
// 아나그램(같은 알파벳으로 이루어진 문자열) 판별
public class Anagram {

    // 1. using sort O(n)
    public boolean compareAnagramUsingSort(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

}
