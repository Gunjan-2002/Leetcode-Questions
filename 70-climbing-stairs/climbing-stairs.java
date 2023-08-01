class Solution {
    public int climbStairs(int n) {
        int dp[]= new int[n];

        if(n==1){
            return 1;
        }

        dp[n-1]=1;
        dp[n-2]=2;

        for(int i=n-3;i>=0;i--){
            dp[i] = dp[i+1]+dp[i+2];
        }
     
     return dp[0];
    }
}

//     private int stair(int n , int mem[]){
//        if(n==0){
//            return 1;
//        }
//        if(n<0){
//            return 0;
//        }

//        if(mem[n]>0){
//            return mem[n];
//        }

//        int n1 = climbStairs(n-1);
//        int n2 = climbStairs(n-2);

//         mem[n]=n1+n2;
//        return n1+n2;
//     }
// }

//  int arr[] = new int[n];
//         if(n==1)
//         {
//             return 1;
//         }
//         arr[n-1]=1;
//         arr[n-2]=2;

//         for(int i=n-3;i>=0;i--)
//         {
//             arr[i] = arr[i+1] + arr[i+2];
//         }

//         return arr[0];