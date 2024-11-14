import java.util.Arrays;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int arr[] = new int[nums1.length + nums2.length], T = 0;
        double temp = 0.0d;

        for (int i = 0 ; i < nums1.length ; i++)
        {
            arr[i] = nums1[i];
        }
        int o = nums1.length;
        for (int i = 0 ; i < nums2.length ; i++ )
        {
            arr[o] = nums2[i];
            o++;
        }
        Arrays.sort(arr);

        if(arr.length % 2 == 1)
        {
            int x = arr.length;
            x = x/2;
            T = arr[x];
            temp = T;
            return temp;
        }
        else
        {
            T = arr.length / 2;
            temp = (arr[T] + arr[T-1]) / 2.0;
            return temp;
        }
    }
}