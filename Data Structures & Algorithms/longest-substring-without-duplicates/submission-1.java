class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        Map<Character, Integer> seen = new HashMap<>();
        int L = 0;
        for (int R = 0; R < chars.length; R++) {
            if (seen.containsKey(chars[R]) && L <= seen.get(chars[R])) {
                L = seen.get(chars[R]) + 1;
            }
            res = Math.max(res, R - L + 1);
            seen.put(chars[R], R);
        }

        return res;
    }
}
