package q_342_power_of_four;

public class Solution {

    public void test1() {

        this.test("test 1", -2147483648, false);
        this.test("test 2", 4, true);
        this.test("test 3", 16, true);
        this.test("test 4", 17, false);
    }

    private void test(String testName, int val, boolean expectedAns) {

        boolean ans = this.isPowerOfFour(val);

        boolean isPass = ans == expectedAns;
        System.out.println(testName + ": " + ans + " expected: " + expectedAns + ", isPass: " + isPass);
    }

    /**
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     * An integer n is a power of four, if there exists an integer x such that n == 4x.
     * @param n - number to check
     * @return - the answer
     */
    public boolean isPowerOfFour(int n) {

        if(n == 1) return true;

        while (n > 4) {

            if(n % 4 != 0) return false;
            n /= 4;
        }

        return n == 4;
    }
}
