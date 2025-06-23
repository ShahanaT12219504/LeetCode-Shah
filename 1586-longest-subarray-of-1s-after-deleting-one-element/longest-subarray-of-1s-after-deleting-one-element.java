class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int r=0;
        int countZero = 0;
        int ans = 0;

        while(r<nums.length) {
            if (nums[r] == 0) {
                countZero++;
            }
            while (countZero > 1) {
                if (nums[l] == 0) {
                    countZero--;
                }
                l++;
            }
            int currlen = (r-l+1)-1;
            ans = Math.max(ans, currlen);
            r++;
        }
        return ans;
    }
}