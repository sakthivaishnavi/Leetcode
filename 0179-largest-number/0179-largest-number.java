class Solution {
    public String largestNumber(int[] nums) {

        String arr[] = new String[nums.length];
        boolean flag=true;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);
            if(!arr[i].equals("0"))
            flag=false;
        }
        if(flag)
        return "0";

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if((arr[j]+arr[j+1]).compareTo(arr[j+1]+arr[j])<0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder("");
        for(String a : arr)
        {
            sb.append(a);
        }
        return sb.toString();
        
    }
}