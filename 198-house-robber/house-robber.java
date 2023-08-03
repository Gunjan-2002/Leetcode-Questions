class Solution {
    public int rob(int[] nums) {
        int inc = 0;
        int exc = 0;

        for(int i=0;i<nums.length;i++){
            int nInc = exc + nums[i];
            int nExc = Math.max(inc,exc);

            inc = nInc;
            exc = nExc;
        }

        return Math.max(inc,exc);
    }
}