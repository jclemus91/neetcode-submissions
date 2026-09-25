class Solution {
    fun search(nums: IntArray, target: Int): Int {

        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (left + right) / 2

            if (target == nums[mid]) {
                return mid
            }

            // left sorted portion
            if (nums[left] <= nums[mid]) {
                if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1 
                } else {
                    right = mid - 1
                }                
            } else {
                // right sorted portion
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }
        }

        return -1
    }
}
