class Solution {
    public boolean isPalindrome(String s) {
        int L = 0;
        int R = s.length() - 1;
        while (L < R) {
            while (!isAlphaNumeric(s.charAt(L)) && L < R) {
                L++;
            }
            while (!isAlphaNumeric(s.charAt(R)) && L < R) {
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
