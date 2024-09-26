class MyCalendar {
    List<int[]> li;
    
    public MyCalendar() {
        li=new ArrayList<>();                
    }
    
    public boolean book(int start, int end) {

        for(int arr[] : li)
        {
            int st=arr[0];
            int en =arr[1];
            if(start<en && end>st)
            {
                return false;
            }
        }   
         li.add(new int[]{start,end});
         return true;
        
       
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */