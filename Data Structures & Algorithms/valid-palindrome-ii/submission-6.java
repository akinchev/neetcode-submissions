class Solution {
    public boolean validPalindrome(String s) {
        int L = 0;
        int R = s.length() - 1;

        while (L < R) {
            while (L < R && !isAlphaNumeric(s.charAt(L))) {
                L++;
            }
            while (R > L && !isAlphaNumeric(s.charAt(R))) {
                R--;
            }

            char chL = Character.toLowerCase(s.charAt(L));
            char chR = Character.toLowerCase(s.charAt(R));

            if (chL != chR) {
                return isPalindrome(s, L +1, R) || isPalindrome(s, L, R -1);
            }

            L++;
            R--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int L, int R) {
        while (L < R) {
            while (L < R && !isAlphaNumeric(s.charAt(L))) {
                L++;
            }
            while (R > L && !isAlphaNumeric(s.charAt(R))) {
                R--;
            }

            char chL = Character.toLowerCase(s.charAt(L));
            char chR = Character.toLowerCase(s.charAt(R));

            if (chL != chR) {
                return false;
            }

            L++;
            R--;
        }

        return true;
    }

    private boolean isAlphaNumeric(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }
        if (ch >= 'a' && ch <= 'z') {
            return true;
        }
        if (ch >= '0' && ch <= '9') {
            return true;
        }

        return false;
    }
}