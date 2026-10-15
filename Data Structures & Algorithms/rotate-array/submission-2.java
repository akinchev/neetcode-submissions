class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Переворачиваем весь массив
        int L = 0;
        int R = n - 1;
        while (L < R) {
            int tmp = nums[L];
            nums[L] = nums[R];
            nums[R] = tmp;
            L++;
            R--;
        }

        // Переворачиваем до k
        L = 0;
        R = k - 1;
        while (L < R) {
            int tmp = nums[L];
            nums[L] = nums[R];
            nums[R] = tmp;
            L++;
            R--;
        }

        // Переворачиваем после k
        L = k;
        R = n - 1;

        while (L < R) {
            int tmp = nums[L];
            nums[L] = nums[R];
            nums[R] = tmp;
            L++;
            R--;
        }

    }
}

// O(n) - время
// O(1) - память