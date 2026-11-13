class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        int sum = 0;
        boolean ans = false;

        Hashtable<Character, Integer> ht = new Hashtable<>();
        // Mismatch of string lengths results in an immediate false value.  
        if(n != m){
            ans = false;
            return ans;
        }
        
        for(int i = 0; i < n; i++){
            // For when a unique key (char) is encountered.   
            if(! (ht.containsKey(s.charAt(i)))){
                ht.put(s.charAt(i), 1);
            }else{
                // We simply increase the character count 
                // if the character is already present in the Hashtable.
                ht.put(s.charAt(i), ht.get(s.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < m; i++){
            if( (! (ht.containsKey(t.charAt(i))) ) ){
                ans = false;
                return ans;
            }else{
                ht.put(t.charAt(i), ht.get(t.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> e : ht.entrySet()){
            if(e.getValue() % 2 == 0){
                sum += e.getValue();
            }else{
                ans = false;
                return ans;
            }
        }
        if(sum == n + m){
            ans = true;
        }
        else{
            ans = false;
        }
        return ans;
    }
}
