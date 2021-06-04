class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if((num & 1) == 0)             // checking the number is even
					num = num >>1;        // dividing the number 2
            else
                num = num^1;        // subtracting by 1 
            
            count++;
        }
        return count;
    }
}
