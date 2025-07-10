class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++)
                count[s.charAt(i) - 'a']++;
            // Build a key like "#1#0#0#0#0..." to uniquely identify anagrams
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}




// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> hmap = new HashMap<>();
//         for (String val : strs) {
//             int[] shash = new int[26];
//             for (char c : val.toCharArray()) shash[c - 'a']++;
//             StringBuilder key = new StringBuilder();
//             for (int n : shash) key.append('#').append(n);
//             hmap.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(val);
//         }
//         return new ArrayList<>(hmap.values());
//     }
// }
