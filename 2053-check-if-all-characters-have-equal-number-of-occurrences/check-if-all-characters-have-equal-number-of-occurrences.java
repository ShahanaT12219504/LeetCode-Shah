class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> freq =new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(freq.containsKey(s.charAt(i))){
                freq.put(s.charAt(i),freq.get(s.charAt(i))+1);

            }else{
                freq.put(s.charAt(i),1);

            }
        }
         
        int frequencyOfFirstElement =freq.get(s.charAt(0));

      for (char key : freq.keySet()) {
         
           if(freq.get(key)!=frequencyOfFirstElement){
                return false;
           }
          
       }

       return true;
       
    }
}