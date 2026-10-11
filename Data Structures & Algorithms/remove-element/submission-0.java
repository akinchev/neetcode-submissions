class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int tail = n - 1;

        for (int i = 0; i < n; i++) {
            while (nums[i] == val) {
                nums[i] = nums[tail];
                nums[tail] = -1;
                tail--;
            }
        }

        return tail + 1;
    }
}