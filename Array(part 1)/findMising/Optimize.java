public class Optimize {
    public static int[] repeatinandmissing(int arr[][]) {
        int n = arr.length; // Number of rows/columns in the square 2D array
        int size = n * n;   // Total elements expected
        int[] temp = new int[size + 1]; // To track frequency of each number
        int[] result = new int[2];      // To store [repeating, missing]

        // Populate frequency array
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                temp[arr[row][col]]++;// temp[arr[row][col]] = temp[arr[row][col]]
            }
        }

        // Identify repeating and missing numbers
        for (int i = 1; i <= size; i++) {
            if (temp[i] == 0) {
                result[1] = i; // Missing number
            } else if (temp[i] > 1) {
                result[0] = i; // Repeating number
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {2, 2}
        };

        int[] ans = repeatinandmissing(arr);

        System.out.println("Repeating: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}
