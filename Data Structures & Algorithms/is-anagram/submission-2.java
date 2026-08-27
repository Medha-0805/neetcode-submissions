class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap <Character,Integer> hashmap1= new HashMap<>();
    HashMap <Character,Integer> hashmap2= new HashMap<>();
    if (s.length()!= t.length())
     return false;
    for(int i=0;i<s.length();i++){
        hashmap1.put(s.charAt(i), hashmap1.getOrDefault(s.charAt(i),0)+1);
        hashmap2.put(t.charAt(i), hashmap2.getOrDefault(t.charAt(i),0)+1);
    }
    return hashmap1.equals(hashmap2);
    }
}
