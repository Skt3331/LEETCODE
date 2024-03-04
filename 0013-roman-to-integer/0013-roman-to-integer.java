class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        
        // Create a map to store the values of Roman numerals
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        // Loop through the characters of the input string
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = map.get(s.charAt(i));
            
            // If the value of the current character is less than the previous one, subtract it
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            
            prevValue = value;
        }
        
        return result;
    }
}
