class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> h  = new HashMap<>();
        // h.put(0,0);

        for(int i=0;i<numbers.length;i++){
            if(h.containsKey(target-numbers[i])){
                return new int[]{ h.get(target-numbers[i]) , i+1 };
            }
            h.put(numbers[i],i+1);
        }
        return new int[]{0,0};

        // int i=0;
        // int j=numbers.length-1;

        // while(i < j){
        //     if(numbers[i]+numbers[j] == target){
        //         return new int[]{ i+1,j+1};
        //     }

        //     if(numbers[i]+numbers[j] > target){
        //         j--;
        //     }else{
        //         i++;
        //     }
        // }
        // return new int[]{0,0};
    }
}