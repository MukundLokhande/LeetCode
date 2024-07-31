class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int T = 0;
        double n = nums.length / 2.0;
        if(nums.length == 1)
            return nums[0];
        for (int i = 0 ; i < nums.length - 1; i++)
        {
            int count = 1;
            for (int j = i+1 ; j < nums.length ; j++)
            {
                if (i != j)
                {
                    if( nums[i] == nums[j] )
                        count++;
                }
            }

            if (count >= n)
                T = nums[i];
        }
        return T;
    }
}