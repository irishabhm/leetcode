class Solution {
    public int[] runningSum(int[] nums) {
        List<Integer> output = new ArrayList<Integer>();
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
            output.add(sum);
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}