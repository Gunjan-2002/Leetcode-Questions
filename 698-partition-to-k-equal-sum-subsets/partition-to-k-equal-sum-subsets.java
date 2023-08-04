class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            sum += nums[i];
        }

        if(sum % k != 0){
            return false;
        }

        if(n < k){
            return false;
        }

        int subsetSum = sum/k;

        boolean visited[] = new boolean[n];

        return canPartition(nums,visited,0,k,0,subsetSum);
    }

    private boolean canPartition(int nums[], boolean visited[], int index, int k, int currSum, int subsetSum){
        if(k == 0){
            return true;
        }

        if(currSum > subsetSum){
            return false;
        }

        if(currSum == subsetSum){
            return canPartition(nums,visited,0,k-1,0,subsetSum);
        }

        for(int i=index;i<nums.length;i++){
            if(visited[i] == true){
                continue;
            }
            visited[i]=true;
            if(canPartition(nums,visited,i+1,k,currSum+nums[i],subsetSum)){
                return true;
            }
            visited[i]=false;
        }
        return false;
    }
}