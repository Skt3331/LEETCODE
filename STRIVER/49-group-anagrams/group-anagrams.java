class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for (String val : strs) {
            int[] shash = new int[26];
            for (char c : val.toCharArray()) shash[c - 'a']++;
            StringBuilder key = new StringBuilder();
            for (int n : shash) key.append('#').append(n);
            hmap.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(val);
        }
        return new ArrayList<>(hmap.values());
    }
}
