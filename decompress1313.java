class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 1; i<nums.length; i+=2){
            
            if(i >= nums.length) break;
            
            int val = nums[i];
            int freq = nums[i-1];
            
            for(int j= 0; j<freq; j++){
                arr.add(val);
            }
        }
        
        int[] n = new int[arr.size()];
        
        for(int i = 0; i<arr.size(); i++){
            n[i] = arr.get(i);
        }
        
        return n;
    }
}
