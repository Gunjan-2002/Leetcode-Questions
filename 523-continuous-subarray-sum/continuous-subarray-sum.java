class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,-1);
        int sum=0;
        int rem=0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            rem = sum % k;

            if(rem < 0){
                rem += k;
            }

            if(h.containsKey(rem)){
                if(i - h.get(rem) >=2){
                    return true;
                }
            }
            else{
                h.put(rem,i);
            }
        }

        return false;
    }
}