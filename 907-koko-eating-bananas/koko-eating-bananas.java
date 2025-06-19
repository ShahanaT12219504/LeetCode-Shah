class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=-1;
        for(int val:piles){
            if(val>high) high=val;
        }
        int ans=-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(canEatWithinTime(mid,piles,h)){
                ans = mid;
                high = mid-1;
            }
            else low=mid+1;

        } return ans;
    }

    public boolean canEatWithinTime(int mid,int[] piles,int h){
        int hours=0;
        for(int val:piles){
            hours+=Math.ceil((double)val/mid);
        }
        return hours<=h;
    }
}