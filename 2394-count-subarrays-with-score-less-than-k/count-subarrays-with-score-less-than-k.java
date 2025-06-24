class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        int l=0;
        int r=0;
        long sum = 0;
        long count=0;

        while(r<n){
            sum+=nums[r];
            while(sum*(r-l+1)>=k){
                sum-=nums[l];
                l++;
            }

            count+=r-l+1;
            r++;

        }

        return count;

    }
}