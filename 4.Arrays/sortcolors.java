public class sortcolors {
    public void sortColors(int[] arr) {
        //selection sort
        int n=arr.length;
        for(int i=0;i<n;i++){
            int m=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<=arr[m]){
                    m=j;
                }
            }
            int t= arr[i];
            arr[i]=arr[m];
            arr[m]=t;
        } 
    }
}
