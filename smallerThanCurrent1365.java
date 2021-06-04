class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] smaller = new int[101];
        
        for(int i = 0; i<nums.length; i++){
            smaller[nums[i]]++;
        }
        
        for(int i = 1; i < 101; i++){
            smaller[i] += smaller[i-1];
        }
        
        for(int i = 0; i < nums.length; i++){
            int position = nums[i];
            
            if(position == 0) nums[i] = 0;
            
            else{
                nums[i] = smaller[position-1];
            }
        }
        
        return nums;
    }
}
