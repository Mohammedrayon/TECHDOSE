import java.util.PriorityQueue;

/**
 * findKthlargest
 */
public class findKthlargest {
    public static int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer> m = new PriorityQueue<>((a,b)->(b-a));
        int r=0;
        for(int i:nums){
            m.add(i);
        }
        for(int i=0;i<k;i++){
            r=m.poll();
        }
        return r;
    }
    public static void main(String[] args) {
        int nums[] ={1,2,5,7,3,7,4,2,4};
        int k=3;
        System.out.println(findKthLargest(nums,k));
    } 
}