class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashSet<String> unique = new HashSet<>();
        HashSet<String> dup = new HashSet<>();

        removeDup(s1, unique, dup);
        removeDup(s2, unique, dup);

        List<String> l = new ArrayList<>();
        for(String s : unique)
        {
            l.add(s);
        }

        return l.toArray(new String[0]);

    }

    public void removeDup(String s, HashSet<String> unique, HashSet<String> dup)
    {
        for(String a : s.split(" "))
        {
            if(!unique.add(a))
            {
                dup.add(a);
            }
        }
        unique.removeAll(dup);
    }
}