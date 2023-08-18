class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;

        int left=0;
        int right=height.length-1;

        while(left < right){
            int leftHeight = height[left];
            int rightHeight = height[right];
            int minHeight = Math.min(leftHeight,rightHeight);

            maxWater = Math.max(maxWater , minHeight*(right-left));

            if(leftHeight < rightHeight){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}