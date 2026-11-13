class Solution {
    public int[] twoSum(int[] nums, int target) {
        System.gc();
        int n = nums.length;
        boolean done = false;
        int leftPtr = 0;
        int rightPtr = 1;

        int[] ans = new int[2];

        while(! (done) ){
            if( (rightPtr < n) && nums[leftPtr] + nums[rightPtr] == target){
                ans[0] = leftPtr;
                ans[1] = rightPtr;
                done = true;
                break;
            }else{
                rightPtr++;
            }
            // if( (rightPtr == n - 1) && (leftPtr < n) ){
            //     leftPtr++;
            //     rightPtr = leftPtr + 1;
            // }
        }
        return ans;
    }
}
