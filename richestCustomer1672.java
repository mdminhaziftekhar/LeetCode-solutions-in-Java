class Solution {
    public int maximumWealth(int[][] accounts) {
        
        ArrayList<Integer> sum = new ArrayList<>();
        
        int sum1 = 0;
        
        for(int i = 0; i<accounts.length; i++){
            for(int j = 0; j<accounts[0].length; j++){
                sum1 = sum1 + accounts[i][j];
            }
            sum.add(sum1);
            sum1 = 0;
        }
        
        Collections.sort(sum);
        int max = sum.get(sum.size()-1);
        
        return max;
    }
}
