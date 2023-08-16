class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i : nums){
            h.put(i, h.getOrDefault(i,0)+1);
        }

        PriorityQueue<int[]> p = new PriorityQueue<>((a,b) -> (a[1] - b[1]));

        for(Map.Entry<Integer,Integer> entry : h.entrySet()){
            p.offer(new int[]{entry.getKey() , entry.getValue()});
            if(p.size() > k){
                p.poll();
            }
        }

        int ans[] = new int[k];

        while(k > 0){
            ans[k-1] = p.poll()[0];
            k--;
        }
        return ans;
    }
}