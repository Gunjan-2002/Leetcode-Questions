class Solution {
    public int lengthOfLongestSubstring(String s) {
        // TC - O(n)
        // SC - O(1)
        // WE CAN USE HASHMAP OR SET BUT TAKING ARRAY WILL BE FASTER
        // AS ARRAY OPERATION IS FASTER THAN THESE DATA STRUCTURES.

        int start = 0;
        int i = 0;

        int maxLength = 0;

        int freq[] = new int[256];

        while(i < s.length()){
            int iIndex = s.charAt(i);
            freq[iIndex]++;

            while(freq[iIndex] > 1){
                int sIndex = s.charAt(start);
                freq[sIndex]--;
                start++;
            }

            int currLen = i - start + 1;

            maxLength = Math.max(currLen, maxLength);

            i++;
        }
        return maxLength;
    }
}
