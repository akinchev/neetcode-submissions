class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 1;
        int blue = 2;

        int L = 0;
        int R = nums.length - 1;
        int cur = 0;
        while (cur <= R) {
            if (nums[cur] == red) {
                nums[cur] = nums[L];
                nums[L] = red;
                L++;
                cur++;
            } else if (nums[cur] == blue) {
                nums[cur] = nums[R];
                nums[R] = blue;
                R--;
            } else {
                cur++;
            }
        }
    }
}