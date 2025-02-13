
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        // Count frequencies
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Get the frequency of the first character
        int firstFreq = freq.values().iterator().next();

        // Check if all frequencies are the same
        for (int f : freq.values()) {
            if (f != firstFreq) {
                return false;
            }
        }

        return true;
    }
}
