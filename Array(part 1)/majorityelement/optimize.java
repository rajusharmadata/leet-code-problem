public class optimize {
    public static int majorityelment(int arr[]) {
        int n = arr.length;
        int el = 0;
        int freq = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                freq++;
                el = arr[i];
            } else if (el == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == el) {
                count++;

            }
            if (count > n / 2) {
                ans = arr[j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        System.out.println(majorityelment(arr));
    }
}
