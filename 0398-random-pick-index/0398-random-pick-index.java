class Solution {
  
    HashMap<Integer,List<Integer>> h = new HashMap<>();
    private int nums[];

    public Solution(int[] nums) {
        this.nums=nums;
        for(int i=0;i< nums.length;i++)
        {
            if(!h.containsKey(nums[i]))
            {
            h.put(nums[i],new ArrayList<>());
            }
            h.get(nums[i]).add(i);  
        }     
    }
    
    public int pick(int target) {
        List<Integer> li = h.get(target);
        Random rand = new Random();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(h.get(i).containsVal(target))
        //     {
        //         li.add(i);
        //     }
        // }
        return li.get(rand.nextInt(li.size()));
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */