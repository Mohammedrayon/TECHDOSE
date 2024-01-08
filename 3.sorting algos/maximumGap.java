import java.util.Arrays;

/**
 * maximumGap
 */
public class maximumGap {

    public static int maximum_Gap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2) return 0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i]-nums[i-1],max);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums={1,3,9,6};
        System.out.println(maximum_Gap(nums));
    }
}


