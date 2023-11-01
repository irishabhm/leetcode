class Solution {
    public int maximumWealth(int[][] accounts) {
        int noOfAccounts = accounts.length;
        int maxWealth = 0;
        for (int i = 0; i < noOfAccounts; i++) {
            int totalWealth = 0;
            int moneyInAccount = accounts[i].length;
            for (int j = 0; j < moneyInAccount; j++) {
                totalWealth = totalWealth + accounts[i][j];
            }
            if (totalWealth > maxWealth) {
                maxWealth = totalWealth;
            }
        }
        return maxWealth;
    }
}