import java.util.ArrayList;
import java.util.Arrays;
class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < m ; i++)
        {
            list.add(nums1[i]);
        }
        for (int j = 0; j < n ; j++)
        {
            list.add(nums2[j]);
        }
        for (int k = 0; k < list.size() ; k++)
        {
            nums1[k] = list.get(k);
        }
        Arrays.sort(nums1);

    }

}