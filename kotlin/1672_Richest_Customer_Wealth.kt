class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var noOfAccounts = accounts.size
        var maxWealth = 0
        for (account in accounts) {
            var totalWealth = 0
            for (wealth in account) {
                totalWealth = totalWealth + wealth
            }
            if (totalWealth > maxWealth) {
                maxWealth = totalWealth
            }
        }
        return maxWealth
    }
}