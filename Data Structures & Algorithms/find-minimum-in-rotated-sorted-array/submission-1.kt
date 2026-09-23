class Solution {
    fun findMin(nums: IntArray): Int {
        
        var min = nums[0]
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            if (nums[left] < nums[right]) {
                min = minOf(min, nums[left])
                break
            }
            
            val mid = (left + right) / 2

            min = minOf(min, nums[mid])

            if (nums[mid] >= nums[left]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return min
    }
}
