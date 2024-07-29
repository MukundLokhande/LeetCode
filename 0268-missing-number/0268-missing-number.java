class Solution {
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        boolean flag = false;
        for(int i = 0; i <= n; i++)
        {
            flag = false;
            for (int j = 0 ; j < n ; j++)
            {
                if(i == nums[j])
                {
                    flag = true;
                }
            }

            if (flag == false)
                return i;
            
        }
        return n;
        
    }
}