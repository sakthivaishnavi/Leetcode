class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int arr[] = new int[k];
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        temp = head;
        while(size-k>=0){
           ListNode prev = temp;
            for(int i =0;i<k;i++){
                arr[i] = temp.val;
                temp = temp.next;
            }
            for(int i =k-1;i>=0;i--){
                prev.val = arr[i];
                prev = prev.next;
            }
            size-=k;
        }
        return head;
    }
}