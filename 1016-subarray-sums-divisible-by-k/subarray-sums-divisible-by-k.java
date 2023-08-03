class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);

        int sum=0;
        int rem=0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            rem = sum % k;

            if(rem < 0){
                rem = rem + k;
            }

            if(h.containsKey(rem)){
                ans += h.get(rem);
                h.put(rem , h.get(rem)+1);
            }
            else{
                h.put(rem,1);
            }
        }
        return ans;
    }
}