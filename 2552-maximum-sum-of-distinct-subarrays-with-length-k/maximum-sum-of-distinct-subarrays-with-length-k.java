class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n=nums.length;
        int l=0;
        int r=0;
        long maxSum=0;
        long currSum=0;

        while(r<n){
            //condition violated, start shrinking the window
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                currSum-=nums[l];
                l++;
            }

            set.add(nums[r]);
            currSum+=nums[r];

            //if current window is size of k
            if(r-l+1 == k){
                maxSum=Math.max(maxSum,currSum);

                set.remove(nums[l]);
                currSum-=nums[l];
                l++;
                r++;
            } else r++;
        }

        return maxSum;
    }
}