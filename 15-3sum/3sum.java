class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> al = new HashSet<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
                int j=i+1;
                int k=nums.length-1;

                while(j < k)
                {
                    int total_sum = nums[i] + nums[j] + nums[k];
                    if(total_sum == 0)
                    {
                        al.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                        j++;
                        k--;
                    }

                    if(total_sum > 0)
                    {
                        k--;
                    }
                    else if(total_sum < 0)
                    {
                        j++;
                    }
                }
        }

        return new ArrayList<>(al);

    }
}
