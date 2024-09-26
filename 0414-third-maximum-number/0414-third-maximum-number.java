class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        Arrays.sort(nums);
            for(int i=0;i<nums.length;i++)
            {
                s.add(nums[i]);
            }
        List<Integer> li = new ArrayList<>(s);
        Collections.sort(li);
        if(s.size()<3)
        return li.get(li.size()-1);
        return li.get(li.size()-3);
         
        
    }
}