class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> groups = new HashMap<>();
        for (String s: strs) {
            Map<Character, Integer> key = key(s);
            List<String> group = groups.getOrDefault(key, new ArrayList<>());
            group.add(s);
            groups.put(key, group);
        }

        return new ArrayList<>(groups.values());
    }

    private Map<Character, Integer> key(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }
}
