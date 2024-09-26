class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[] = new int[nums.length+1];
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]-1]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==0)
            li.add(i+1);
        }
        return li;

        
    }
}