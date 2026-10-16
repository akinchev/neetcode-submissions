class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;

        Map<Integer, Integer> seenSumsCounter = new HashMap<>();
        seenSumsCounter.put(0, 1);
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            int diff = curSum - k;
            res += seenSumsCounter.getOrDefault(diff, 0);
            seenSumsCounter.put(curSum, seenSumsCounter.getOrDefault(curSum, 0) + 1);

        }

        return res;
    }
}
