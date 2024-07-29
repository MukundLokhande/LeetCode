import java.util.ArrayList;
class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int n = nums1.length, n2 = nums2.length;
        int x = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n ; i++)
        {
            for (int j = 0 ; j < n2; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    list.add( nums1[i] );
                    x++;
                    nums2[j] = 99999;
                    break;
                }
            }
        }

        int arr[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
        
    }
}