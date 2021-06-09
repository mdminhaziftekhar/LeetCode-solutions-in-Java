class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for(int i = 0; i<index.length; i++){
            list.add(index[i], nums[i]);
        }
        
        Object[] objectAarray = list.toArray();
        int length = objectAarray.length;
        int[] arr = new int[length];
        
        for(int i = 0 ; i<length; i++){
            arr[i] = (int)objectAarray[i];
        }
        
        return arr;
    }
}
