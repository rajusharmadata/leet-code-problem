public class solution {
    public static int Singleunit(int arr[]) {
     /*
      *Brutforce -------------
       for (int i = 0; i < arr.length; i++) {
      int curr = arr[i];
      int freq = 0;

      for (int j = 0; j < arr.length; j++) {
          if (curr == arr[j]) {
              freq++;
          }

      }
      if (freq == 1) {
          return curr;
      }

     }
          return -1;
      */
     int result = 0;
     // This is foreach loop travers all array element
     for (int nums : arr) {
         result = result ^ nums;// nums[iendexs  ]
     }
     return result;
    }
    public static void main(String[] args) {
        int arr[] = { 3,3,1 };
        System.out.println(Singleunit(arr));
    }
}
