class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < first) {
                first = n;
            } else if (first < n && n < second) {
                second = n;
            } else if (first < second && second < n)
                return true;
        }
        return false;
    }
}