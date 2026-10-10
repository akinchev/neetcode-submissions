class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (sMap.containsKey(ch)) {
                sMap.put(ch, sMap.get(ch) + 1);
            } else {
                sMap.put(ch, 1);
            }
        }

         for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (tMap.containsKey(ch)) {
                tMap.put(ch, tMap.get(ch) + 1);
            } else {
                tMap.put(ch, 1);
            }
        }

        return sMap.equals(tMap);
    }
}
