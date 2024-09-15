class Solution {
    public int longestSubarray(int[] nums) {
        int res=0;
       for(int num : nums)
       {
         res = Math.max(res,num);
       }
       int maxval = 0;
       int currval = 0;
       for(int num : nums)
       {
        if(num == res)
        {
            currval++;
            maxval = Math.max(maxval,currval);
        }
        else
        {
            currval=0;
        }
       }
       return maxval;
       
        
    }
}