class Solution {
    public String largestNumber(int[] nums) {

        ArrayList<String> li= new ArrayList<>();
        for(var i:nums)
        {
            li.add(Integer.toString(i));
        }
        Collections.sort(li, (a,b) -> (a+b).compareTo(b+a));

        StringBuilder s = new StringBuilder();

        for(int i = li.size()-1 ; i>=0 ; i--)
        {
            s.append(li.get(i));
        }
        if(s.charAt(0) == '0')
        {
            return "0";
        }

        return s.toString();
        
    }
}