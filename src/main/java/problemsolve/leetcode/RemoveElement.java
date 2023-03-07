package problemsolve.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int cnt = 0;
        int notRemoveIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                swap(nums, notRemoveIdx, i);
                notRemoveIdx++;
                cnt++;
            }
        }

        return cnt;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int removeCnt = new RemoveElement().removeElement(nums, val);

        System.out.println(removeCnt);
        for(int num : nums) {
            System.out.print(num);
        }
    }
}
