class Solution {
    public int[] twoSum(int[] nums, int target) {
        System.gc();
        int n = nums.length;
        boolean done = false;
        int leftPtr = 0;
        int rightPtr = 1;

        int[] ans = new int[2];

        while(! (done) ){
            // Case for when end of array is reached:
            // move the left pointer over and check everything.  
            if(rightPtr == n){
                leftPtr++;
                rightPtr = leftPtr + 1;
            }
            if( (rightPtr < n) && nums[leftPtr] + nums[rightPtr] == target){
                ans[0] = leftPtr;
                ans[1] = rightPtr;
                done = true;
                break;
            }else{
                rightPtr++;
            }
        }
        return ans;
    }
}
