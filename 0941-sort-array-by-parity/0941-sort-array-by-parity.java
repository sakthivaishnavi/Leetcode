class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int frst=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[frst];
                nums[frst]=nums[i]; 
                nums[i]=temp; 
                frst++; 
            } 
        }
      
        return nums;
        
    }
}