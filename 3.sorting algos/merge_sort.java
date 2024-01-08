import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int [] mergesort(int[] arr) {
        if(arr.length ==1) return arr;

        int m=arr.length / 2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,m));
        int [] right = mergesort(Arrays.copyOfRange(arr,m,arr.length));

        return merge(left,right);

    }

    public static int[] merge(int[] left, int[] right) {
        int [] mix = new int[left.length + right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
                k++;
            }
            else{
               mix[k]=right[j];
               j++;
               k++;
            }
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
