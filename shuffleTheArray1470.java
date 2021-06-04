class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] a = new int[nums.length/2];
        int[] b = new int[nums.length/2];
        
        for(int i = 0; i<n; i++){
            a[i] = nums[i];
        }
        
        int i = 0;
        
        for(int j = n;j<nums.length; j++){
            b[i] = nums[j];
            i++;
        }
        
        int a1= 0, b1= 0;
        
        for(i = 0; i<nums.length; i++){
            if(i % 2 == 0){
                nums[i] = a[a1];
                a1++;
            }
            else{
                nums[i] = b[b1];
                b1++;
            }
        }
        
        return nums;
    }
}
