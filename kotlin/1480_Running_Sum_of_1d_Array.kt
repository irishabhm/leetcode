class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var output: IntArray = IntArray()
        var sum = 0
        for (i=0;i<nums.size;i++) {
            sum = sum + num;
            output.set(i, sum)
        }
        return output;
    }
}