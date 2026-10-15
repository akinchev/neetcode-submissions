class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        int L = 0;
        int R = 0;

        while (R < nums.length) {
            while (R < nums.length && seen.contains(nums[R])) {
                R++;
            }
            if (R < nums.length && !seen.contains(nums[R])) {
                seen.add(nums[R]);
                nums[L] = nums[R];
                L++;
            }
        }

        return L;
    }
}