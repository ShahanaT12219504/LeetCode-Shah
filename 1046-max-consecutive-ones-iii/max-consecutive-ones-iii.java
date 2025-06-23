class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;

        int countZeroes = 0;
        int maxLen = Integer.MIN_VALUE;

        while (r < n) {
            if (nums[r] == 0)
                countZeroes++;

            while (countZeroes > k) {
                if (nums[l] == 0)
                    countZeroes--;
                l++;
            }

            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            r++;
        }
        return maxLen;

    }
}