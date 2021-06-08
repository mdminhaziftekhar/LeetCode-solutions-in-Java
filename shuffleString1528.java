class Solution {
    public String restoreString(String s, int[] indices) {
        
        String s2 = s;
        char[] ch = s.toCharArray();
        
        for(int i = 0; i<indices.length; i++){
            
            ch[indices[i]] = s.charAt(i);
            
            s2 = String.valueOf(ch);
        }
        
        return s2;
    }
}
