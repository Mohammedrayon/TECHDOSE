import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int [] arr = {5,3,2,6,4,1};
        int i=0,n=arr.length;
        while(i<n){
            int correct=arr[i]-1;
            if(arr[i] !=arr[correct]){
                int t = arr[i];
                arr[i]=arr[correct];
                arr[correct]=t;
            }else{
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
