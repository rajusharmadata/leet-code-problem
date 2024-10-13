# 169. Majority Element

### Easy


Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 ```
 class Solution {
    public int majorityElement(int[] nums) {
        int element = 0 ;
        int count =0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                count++;
                element = nums[i];
            }else if(element == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int count1 = 0;
        for(int j =0;j<nums.length;j++){
            if(element == nums[j]){
                count1++;
            }
            if(count1> (nums.length)/2){
                return nums[j];
            }

        }
        return -1;
    }
}
 ```