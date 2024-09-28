import java.util.concurrent.LinkedBlockingDeque;
import java.util.Deque;
class MyCircularDeque {
        public BlockingDeque<Integer> d ;
        public int capacity;
    public MyCircularDeque(int k) {
        this.capacity =k;
        this.d =  new LinkedBlockingDeque<>(k);
    }
    
    public boolean insertFront(int value) {
        if(d.size()<capacity){
          d.addFirst(value);
          return true;
        }
        return false;        
    }
    
    public boolean insertLast(int value) {
        if(d.size()<capacity){
         d.addLast(value);  
         return true;
        }
        return false;      
    }
    
    public boolean deleteFront() {
        return d.pollFirst()!=null;        
    }
    
    public boolean deleteLast() {
        return d.pollLast()!=null;        
    }
    
    public int getFront() {
       Integer val = d.peekFirst();
       return val == null ? -1 :val;
        
    }
    
    public int getRear() {
        Integer val = d.peekLast();
       return val == null ? -1 :val;
        
    }
    
    public boolean isEmpty() {
        return d.isEmpty();               
    }
    
    public boolean isFull() {
        return d.size()==capacity;
                
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */