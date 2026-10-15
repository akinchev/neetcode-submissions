class Solution {
    public void rotate(int[] nums, int k) {
        int count = 0;
        while (count < k) {
            int prev = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int cur = nums[i];
                nums[i] = prev;
                prev = cur;
                if (i == nums.length -1) {
                    nums[0] = cur;
                }
            }
            count++;
        }
    }
}