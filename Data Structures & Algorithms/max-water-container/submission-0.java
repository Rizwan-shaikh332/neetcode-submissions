class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int res=0;

        while(left<right){
            int minh=Math.min(heights[left],heights[right]);
            int calc=minh*(right-left);
            res=Math.max(res,calc);
            if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return res;
    }
}
