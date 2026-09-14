class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // optiomal
        Map<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> dp=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int i=0; i<bucket.length; i++){
            bucket[i]=new ArrayList<>();
        }
        

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
           int freq=entry.getValue();
           bucket[freq].add(entry.getKey());
        }
        int result[] = new int[k];
        int idx=0;
        for(int i=bucket.length-1; i>=0 && idx< k; i--){
            if(bucket[i]== null) continue;
            for(int num: bucket[i]){
                result[idx++]=num;
                if(idx==k){
                    break;
                }
            }
        }

        return result;
    }
}
