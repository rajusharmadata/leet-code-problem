public class MergeArray {

    // Method to merge two sorted arrays (nums1 and nums2) into nums1
    public static void mergeArray(int nums1[], int m, int nums2[], int n) {
        // Pointers to track positions in nums1 and nums2
        int i = m - 1; // Pointer to the last element of the valid part of nums1
        int j = n - 1; // Pointer to the last element of nums2
        int k = m + n - 1; // Pointer to the last position of nums1 array

        // Loop until either nums1 or nums2 has been fully traversed
        while (i >= 0 && j >= 0) {
            // Compare the elements of nums1 and nums2 from the back
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // If nums1 element is larger, place it in nums1[k]
                i--; // Move the nums1 pointer left
            } else {
                nums1[k] = nums2[j]; // If nums2 element is larger, place it in nums1[k]
                j--; // Move the nums2 pointer left
            }
            k--; // Move the nums1 placement pointer left
        }

        // If there are any remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--; // Move the nums2 pointer left
            k--; // Move the nums1 placement pointer left
        }
        // No need to handle nums1 leftovers, as they are already in place
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 }; // Array nums1 with extra space for merging
        int nums2[] = { 2, 5, 6 };          // Array nums2 to be merged into nums1
        int m = 3; // Number of initial valid elements in nums1
        int n = nums2.length; // Number of elements in nums2

        mergeArray(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
