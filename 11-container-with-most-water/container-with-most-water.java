class Solution {
    public int maxArea(int[] height) {
        int max=0;

        int i=0;
        int j=height.length-1;

        while(i < j){
            int lh = height[i];
            int rh = height[j];

            int min_h = Math.min(lh,rh);

            max = Math.max(max, min_h*(j-i));

            if(lh < rh){
                i++;
            }else{
                j--;
            }
        }

        return max;
    }
}

/*
    Here we apply two pointer logic
    first one from 0 and second one from last index

    we will find height and width height=minimum of nums of
    start and end. and width is end - start.

    if start height is less than end then increment start else
    decrement end.

*/