class Solution {
    public boolean hasDuplicate(int[] nums) {
        System.gc();
        int n = nums.length;
        boolean ans = false;
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for(int i = 0; i < n ; i++){
            if(! (ht.containsKey(nums[i])) ){
                ht.put(nums[i], 0);
            }
            else{
                ans = true;
                break;
            }
        }
        return ans;
    }
}