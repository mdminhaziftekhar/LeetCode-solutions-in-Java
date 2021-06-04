class Solution {
    public String defangIPaddr(String address) {
        String s = "";
        
        for(int i = 0; i<address.length(); i++){
            if(address.charAt(i) == '.'){
                String s2 = "[.]";
                s = s + s2;
            }
            else{
                s = s + address.charAt(i);
            }
        }
        
        return s;
    }
}
