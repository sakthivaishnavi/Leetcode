class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().split("\\s+");
        List<String> li = Arrays.asList(a);
        Collections.reverse(li);
        return String.join(" ",li);
        
    }
}