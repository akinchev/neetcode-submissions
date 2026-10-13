class Solution {
    public String mergeAlternately(String word1, String word2) {
        int L = 0;
        int R = 0;
        StringBuilder sb = new StringBuilder();
        while (L < word1.length() || R < word2.length()) {
            if (L < word1.length()) {
                sb.append(word1.charAt(L));
                L++;
            }
            if (R < word2.length()) {
                sb.append(word2.charAt(R));
                R++;
            }
   
        }

        return sb.toString();
    }
}
