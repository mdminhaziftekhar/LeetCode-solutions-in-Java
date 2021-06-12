class Solution {
    public int balancedStringSplit(String s) {
        
        int balancedCount = 0, count = 0;
        
        for(int i = 0; i<s.length(); i++){
            
            if(s.charAt(i) == 'R'){
                count++;
            }
            else if(s.charAt(i) == 'L'){
                count--;
            }
            
            if(count == 0) balancedCount++;
        }
        
        return balancedCount;
    }
}
