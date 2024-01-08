import java.util.Arrays;

public class quick_sort {
    public static void quicksort(int []nums,int l,int h){
        if(l>h){
            return ;
        }
        int s=l;
        int e=h;
        int m=s+(e-s)/2;
        int p=nums[m];
    while(s<=e){
        while(nums[s]<p){
            s++;
        }
        while(nums[e]>p){
            e--;
        }
        if(s<=e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
        }
        quicksort(nums,l,e);
        quicksort(nums,s,h);
    }
    public static void main(String[] args) {
        int [] nums= {1,4,2,6,7,3,7,9};
        quicksort(nums,0,nums.length -1);
        System.out.println(Arrays.toString(nums));
    }
}
