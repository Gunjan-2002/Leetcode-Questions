class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];

        int n=nums.length;
        int pre=1;

        for(int i=0;i<n;i++){
            arr[i] = pre;
            pre = pre*nums[i];
        }

        pre=1;

        for(int i=n-1;i>=0;i--){
            arr[i] = arr[i]*pre;
            pre = pre*nums[i];
        }

        return arr;
    }
}