class Solution {
    fun fizzBuzz(n: Int): List<String> {
        var output = ArrayList<String>()
        var i = 1
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz")
            } else if (i % 5 == 0) {
                output.add("Buzz")
            } else if (i % 3 == 0) {
                output.add("Fizz")
            } else {
                output.add("${i}")
            }
            i++;
        }
        return output
    }
}