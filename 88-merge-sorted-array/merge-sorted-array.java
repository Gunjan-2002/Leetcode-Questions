class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1;
        int b = n-1;
        int k = m+n-1;


        while(a >= 0 && b >= 0)
        {
            if(nums2[b] > nums1[a])
            {
                nums1[k] = nums2[b];
                k--;
                b--;
            }
            else
            {
                nums1[k] = nums1[a];
                k--;
                a--;
            }
        }

        while(a >= 0)
        {
            nums1[k] = nums1[a];
            k--;
            a--;
        }

        while(b >= 0)
        {
           nums1[k] = nums2[b];
           k--;
           b--;
        }

    }
}


/*
    In this we simly apply merging two sorted arrays logic of two   pointers.
    but in this case we start pointers from the last.
    and everything is same.


    int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0)
        {
            if(nums1[i] < nums2[j])
            {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            else
            {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }

        while(j>=0)
        {
            nums1[k] = nums2[j];
                k--;
                j--;
        }

        while(i>=0)
        {
            nums1[k] = nums1[i];
                k--;
                i--;
        }

*/