class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int more=target-nums[i];
            if(mp.containsKey(more)){
                return new int[]{mp.get(more),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}

//Brute Force
        // int n=nums.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1;j<n; j++){
        //         if(nums[i]+ nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};