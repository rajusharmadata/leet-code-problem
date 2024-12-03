public class brutforce {
    public static int  Mejortiyelemnt(int arr[]){
        int n =arr.length;
        int  ans = 0;
        for(int i = 0;i<n;i++){
            int el = arr[i];
            int freq = 0;
            for(int j = 0;j<n;j++){
                if(el==arr[j]){
                    freq++;
                }
            }
            if(freq>n/2){
                ans = el;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(Mejortiyelemnt(arr));
    }
}