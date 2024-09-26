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
        int arr[] = new int[s.size()];
        int j=0;
        for(int i=0;i<li.size();i++)
        {
            arr[j]=li.get(i);
            j++;
        }
        if(s.size()<3)
        return arr[s.size()-1];
        return arr[s.size()-3];
         
        
    }
}