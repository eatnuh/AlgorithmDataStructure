package interview;

import java.util.Arrays;

public class Anagram {

    // using sort
    public boolean compareAnagramUsingSort(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

}
