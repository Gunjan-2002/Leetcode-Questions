class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int currentBestSum = nums[0];
        int originalBestSum = nums[0];

        for(int i=1;i<n;i++){
            if(currentBestSum >= 0){
                currentBestSum += nums[i];
            }else{
                currentBestSum=nums[i];
            }

            if(currentBestSum > originalBestSum){
                originalBestSum = currentBestSum;
            }
        }

        return originalBestSum;
    }
}