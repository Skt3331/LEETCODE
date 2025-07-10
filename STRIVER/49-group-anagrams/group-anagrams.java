
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) count[c - 'a']++;
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(count[i]);
            }
            hmap.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hmap.values());
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
