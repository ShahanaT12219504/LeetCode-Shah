class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> freq =new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
         
        int count =freq.get(s.charAt(0));

      for (char key : freq.keySet()) {
         
           if(freq.get(key)!=count){
                return false;
           }
          
       }

       return true;
       
    }
}