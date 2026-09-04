class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val prefix = IntArray(nums.size)
        var tmp = 1
        for (index in nums.indices) {
            tmp *= nums[index]
            prefix[index] = tmp
        }

        val suffix = IntArray(nums.size)
        tmp = 1
        for (index in nums.indices.reversed()) {
            tmp *= nums[index]
            suffix[index] = tmp
        }

        val result = IntArray(nums.size)
        for (index in nums.indices) {
            val prefixNumber = if (index == 0) 1 else prefix[index - 1]
            val suffixNumber = if (index == nums.size - 1) 1 else suffix[index + 1]

            result[index] = prefixNumber * suffixNumber
        }
        
        return result
    }
}
