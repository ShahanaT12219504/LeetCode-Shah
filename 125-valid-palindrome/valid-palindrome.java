class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       
       StringBuilder str1 =new StringBuilder();
       StringBuilder str2 =new StringBuilder();

       for(int i=0;i<s.length();i++){
         if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            str1.append(s.charAt(i));

         }
       }
       for(int i=s.length()-1;i>=0;i--){
         if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            str2.append(s.charAt(i));

         }
       }

       return str1.toString().equals(str2.toString());
        
    }
}