class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid+1]<arr[mid] && arr[mid-1]<arr[mid]) return mid;
            else if(arr[mid+1]<arr[mid]) high=mid;
            else low=mid+1;
        }
        return low;
    }
}