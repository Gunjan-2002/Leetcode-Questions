class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> h = new HashSet<>();

        for(int e : nums){
            h.add(e);
        }

        int maxLen=0;

        for(int e : nums){
            int currLen=1;
            int left = e;
            int right = e;

            while(h.contains(left-1)){
                currLen++;
                h.remove(left-1);
                left--;
            }

            while(h.contains(right+1)){
                currLen++;
                h.remove(right+1);
                right++;
            }

            maxLen = Math.max(maxLen,currLen);
        }
        return maxLen;
    }
}