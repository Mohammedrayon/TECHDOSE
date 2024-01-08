import java.util.List;

public class maximumsubarray {
    public int maxSubArray(List<Integer> nums) {
        int m = Integer.MIN_VALUE;
        int c = 0;

        if (nums.size() == 1) {
            return nums.get(0);
        }

        for (int i = 0; i < nums.size(); i++) {
            c += nums.get(i);
            if (c > m) {
                m = c;
            }
            if (c < 0) {
                c = 0;
            }
        }

        return m;
    }
}
