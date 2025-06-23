class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        if (n < 2 * k + 1) return res;

        long currSum = 0;
        for (int j = 0; j < 2 * k + 1; j++) {
            currSum += nums[j];
        }

        int i = k;
        res[i] = (int)(currSum / (2 * k + 1));

        for (int r = 2 * k + 1; r < n; r++) {
            currSum = currSum - (long)nums[r - 2 * k - 1] + (long)nums[r];
            i++;
            res[i] = (int)(currSum / (2 * k + 1));
        }

        return res;
    }
}
