package interview;

import java.util.Arrays;
// 아나그램(같은 알파벳으로 이루어진 문자열) 판별
public class Anagram {

    // 1. using sort O(nlogn)
    public boolean compareAnagramUsingSort(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    // 2. using bucket O(n)
    public boolean compareAnagramUsingBucket(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        int len = str1.length();
        int[] bucket = new int[26]; // lower case alphabet

        for(int i = 0; i < len; i++) {
            bucket[str1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < len; i++) {
            if(bucket[str2.charAt(i)]-- < 0) return false;
        }

        return true;
    }

}
