class Solution {
    public void moveZeroes(int[] nums) 
    {
        int n = nums.length;
        for (int i = n-2; i >= 0 ; i--)
        {
            if(nums[i] == 0) 
            {
                for (int j = i; j < n-1 ; j++)
                { 
                    nums[j] = nums[j+1];
                }
                nums[n-1] = 0;
            }
        }
    }
}