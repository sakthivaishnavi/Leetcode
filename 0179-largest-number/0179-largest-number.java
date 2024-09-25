class Solution {
    public String largestNumber(int[] nums) {

        String arr[] = new String[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        if(arr[0].equals("0"))
        return "0";

             
        StringBuilder sb = new StringBuilder();
        for(String a : arr)
        {
            sb.append(a);
        }
        return sb.toString();
        
    }
}