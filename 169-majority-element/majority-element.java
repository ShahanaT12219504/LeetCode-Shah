class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> major = new HashMap<>();

        for(int ele : nums){
            major.put(ele,major.getOrDefault(ele,0)+1);
        }


        for(int key : major.keySet()){
            if(major.get(key)>n/2){
                return key;
            }
           
        }
        return -1;

    }
}