public class FindmissingandRepeatedValues {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
       int[] cnt = new int[n * n + 1];
       int[] ans = new int[2];
       for (int[] row : grid) {
           for (int x : row) {
               if (++cnt[x] == 2) {
                   ans[0] = x;
               }
           }
       }
       for (int x = 1;; ++x) {
           if (cnt[x] == 0) {
               ans[1] = x;
               return ans;
           }
       }

   }
}
// Dry run 
/*
 * Step-by-Step Dry Run
Initialization:

Set n as the number of rows in the grid:
java
Copy code
n = grid.length; // n = 2
Initialize the cnt array:
java
Copy code
int[] cnt = new int[n * n + 1]; // cnt = [0, 0, 0, 0, 0, 0] (length = 5)
Initialize the ans array:
java
Copy code
int[] ans = new int[2]; // ans = [0, 0]
Counting Occurrences:

Loop through each row in the grid to count occurrences:
java
Copy code
for (int[] row : grid) {
    for (int x : row) {
        if (++cnt[x] == 2) {
            ans[0] = x; // Capture repeated number
        }
    }
}
Iteration Breakdown:

First Row {1, 3}:
For x = 1: cnt[1] becomes 1 → cnt = [0, 1, 0, 0, 0]
For x = 3: cnt[3] becomes 1 → cnt = [0, 1, 0, 1, 0]
Second Row {2, 2}:
For the first x = 2: cnt[2] becomes 1 → cnt = [0, 1, 1, 1, 0]
For the second x = 2: cnt[2] becomes 2 → cnt = [0, 1, 2, 1, 0]
Since cnt[2] is now 2, set ans[0] = 2 (the repeated number):
java

ans[0] = 2; // ans = [2, 0]
Finding the Missing Number:

Start checking from x = 1:
java
for (int x = 1;; ++x) {
    if (cnt[x] == 0) {
        ans[1] = x; // Capture missing number
        return ans;
    }
}
Iteration Breakdown:

For x = 1: cnt[1] = 1 (not missing)
For x = 2: cnt[2] = 2 (not missing)
For x = 3: cnt[3] = 1 (not missing)
For x = 4: cnt[4] = 0 (missing number found)
Set ans[1] = 4:
java
Copy code
ans[1] = 4; // ans = [2, 4]
Return Result:

The method returns the ans array:
java
Copy code
return ans; // Output is [2, 4]
Final Output
The final output for the input [[1, 3], [2, 2]] is:

java
Copy code
[2, 4] // Where 2 is the repeated number and 4 is the missing number.
 */