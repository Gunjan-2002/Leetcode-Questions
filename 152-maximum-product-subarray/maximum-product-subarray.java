class Solution {
    public int maxProduct(int[] nums) {
        int minSoFar = nums[0];
        int maxSoFar = nums[0];
        int res = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int copyMaxSoFar = maxSoFar;

            maxSoFar = Math.max(nums[i], Math.max(maxSoFar*nums[i], minSoFar*nums[i]));

            minSoFar = Math.min(nums[i], Math.min(copyMaxSoFar*nums[i], minSoFar*nums[i]));

            res = Math.max(res,maxSoFar);
        }

        return res;
    }
}