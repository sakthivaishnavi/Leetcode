class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            int diff= target-nums[i];

            if(map.containsKey(diff))
            {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i],i);
        }
        return null;       
    }
}