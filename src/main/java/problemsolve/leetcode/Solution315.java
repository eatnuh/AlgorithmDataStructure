package problemsolve.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Count of Smaller Numbers After Self
 * https://leetcode.com/problems/count-of-smaller-numbers-after-self/
 */
public class Solution315 {
    public List<Integer> countSmaller(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {

            int numOfSmaller = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) numOfSmaller++;
                else if (nums[i] == nums[j]) {
                    result[i] = result[j];
                }
            }
            result[i] += numOfSmaller;
        }
        return Arrays.stream(result).boxed().collect(Collectors.toList());
    }
}
