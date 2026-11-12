class Solution {
    public boolean hasDuplicate(int[] nums) {
        System.gc();
        int n = nums.length;
        boolean ans = false;

        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                ans = true;
                break;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}