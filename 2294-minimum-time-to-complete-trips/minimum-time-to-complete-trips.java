class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        int min = Integer.MAX_VALUE;

        for (int val : time) {
            if (val < min) min = val;
        }

        long high = min * (long) totalTrips; 
        long ans = high; 

        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            long totalCompleted = 0;
            for (int val : time) {
                totalCompleted += mid / val; 
                if (totalCompleted >= totalTrips) break; 
            }

            if (totalCompleted >= totalTrips) {
                ans = mid;        
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
}
