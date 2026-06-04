class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int pos1=0,pos2=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    pos1=i;
                    pos2=j;
                }
            }
        }
        int [] arr={pos1,pos2};
        return arr;
    }
}
