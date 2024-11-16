class Solution {
    public int singleNumber(int[] nums) 
    {
        if (nums.length == 1)
        {
            return nums[0];
        }
        for(int i = 0; i < nums.length ; i++)
        {   
            int match = 0;
            for(int j = 0 ; j < nums.length; j++)
            {
                if(nums[i] == nums[j] && i != j )
                {
                    match = 1;
                }
            }

            if (match == 0)
            {
                return nums[i];
            }
        }
        return -1;
    }
}