class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        boolean ans = false;

        Hashtable<Character, Integer> ht = new Hashtable<>();
        
        for(int i = 0; i < n; i++){
            // For when a unique key (char) is encountered.   
            if(! (ht.containsKey(s.charAt(i)))){
                ht.put(s.charAt(i), 0);
            }else{
                // We simply increase the character count 
                // if the character is already present in the Hashtable.
                ht.put(s.charAt(i), ht.get(s.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < m; i++){
            if( (! (ht.containsKey(t.charAt(i))) ) ){
                ans = false;
                break;
            }else{
                ht.put(t.charAt(i), ht.get(t.charAt(i)) + 1);
            }
        }
        ans = true;
        return ans;
    }
}
