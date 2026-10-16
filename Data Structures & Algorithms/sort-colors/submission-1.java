class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        int idx = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                nums[idx] = i;
                idx++;
                counts[i]--;
            }
        }
    }
}