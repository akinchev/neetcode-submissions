class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        Set<Character> seen = new HashSet<>();
        int L = 0;
        for (int R = 0; R < chars.length; R++) {
            while(seen.contains(chars[R])) {
                seen.remove(chars[L]);
                L++;
            }
            res = Math.max(res, R - L + 1);
            seen.add(chars[R]);

        }

        return res;
    }
}
