class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counter = new HashMap<>();
        for (int n: nums) {
            int curCount = counter.getOrDefault(n, 0);
            curCount++;
            counter.put(n, curCount);
            if (curCount > nums.length / 2) {
                return n;
            }
        }

        return 0;
    }
}