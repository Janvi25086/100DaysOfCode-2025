package DSA.Janvi_590014976;

public class Day1Ques1 {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Day1Ques1 obj = new Day1Ques1();

        int[] nums = {3, 0, 1};

        System.out.println(obj.missingNumber(nums));
    }
}
