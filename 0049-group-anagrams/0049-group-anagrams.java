import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate through each string in the array
        for (String str : strs) {
            // Sort the characters of the string to get its unique identifier
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // Check if the sorted string is already in the map
            if (!map.containsKey(sortedStr)) {
                // If not, create a new list for this anagram group
                map.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the corresponding anagram group
            map.get(sortedStr).add(str);
        }
        
        // Add all the anagram groups to the result list
        for (List<String> group : map.values()) {
            result.add(group);
        }
        
        return result;
    }
}
