class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();

        int l=0;
        int r=0;
        int currCost=0;
        int maxLen=0;

        while(r<n){
            currCost+=Math.abs(s.charAt(r) - t.charAt(r));

            //if condition gets violated, decrement the window size
            while(currCost>maxCost){
                currCost = currCost - Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }

            int len = r-l+1;
            maxLen = Math.max(maxLen,len);
            r++;
        }

        return maxLen;
    }
}