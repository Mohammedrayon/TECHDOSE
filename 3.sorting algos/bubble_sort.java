import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr ={3,1,5,4,2};
        int n= arr.length;
        for(int i=n-1;i>=0;i--){    // runs (n-1) times
            for(int j=1;j<=i;j++){  // runs i times every time
                if(arr[j] < arr[j-1]){
                    int t= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
