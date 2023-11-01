class Solution {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var numberOfSteps = 0;
        while (number != 0) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number - 1;
            }
            numberOfSteps++;
        }
        return numberOfSteps;
    }
}