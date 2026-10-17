class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 1;
        int blue = 2;

        int L = 0;
        for (int R = 0; R < nums.length; R++) {
            if (nums[R] == red) {
                nums[R] = nums[L];
                nums[L] = red;
                L++;
            }
        }

        for (int R = L; R < nums.length; R++) {
            if (nums[R] == white) {
                nums[R] = nums[L];
                nums[L] = white;
                L++;
            }
        }
    }
}