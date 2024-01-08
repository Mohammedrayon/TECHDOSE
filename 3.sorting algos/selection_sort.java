import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int [] arr={3,2,1,6,5,4,};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int m=i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[m]) {
                    m = j;
                }
            }
            int t= arr[i];
            arr[i]=arr[m];
            arr[m]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
