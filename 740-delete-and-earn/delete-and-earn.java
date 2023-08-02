class Solution {
    public int deleteAndEarn(int[] nums) {
        int fre[] = new int[10001];

        int include = 0;
        int exclude = 0;

        for(int count : nums){
            fre[count]++;
        }

        for(int i=0;i<=10000;i++){
            int newInclude = exclude + fre[i]*i;
            int newExclude = Math.max(include,exclude);

            include = newInclude;
            exclude = newExclude;
        }

        return Math.max(include, exclude);
    }
}