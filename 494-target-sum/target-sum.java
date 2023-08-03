class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        find(nums,target,0,0);
        return count;
    }

    private void find(int[] nums, int target, int ind, int sum){
        if(ind == nums.length){
            if(sum == target){
                count++;
            }
            return;
        }


        find(nums,target,ind+1,sum+nums[ind]);
        find(nums,target,ind+1,sum-nums[ind]);
    }
}