class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int L = 0;
        Set<Integer> seen = new HashSet<Integer>();
        for (int R = 0; R < nums.length; R++) {
            if (seen.contains(nums[R])) {
                return true;
            }
            seen.add(nums[R]);
            if (R - L == k) {
                seen.remove(nums[L]);
                L++;
            }
        }

        return false;
    }
}

// nums=[1,2,3,1]
//       L
//       R
// seen = {1}

// nums=[1,2,3,1]
//       L
//         R
// seen = {1, 2}

// nums=[1,2,3,1]
//       L
//           R
// seen = {1, 2}





