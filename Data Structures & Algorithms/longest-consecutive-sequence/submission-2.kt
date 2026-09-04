class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()

        var result = 0
        for (i in 0 until nums.size) {
            if (!set.contains(nums[i] - 1)) {
                var length = 0
                while (set.contains(nums[i] + length)) {
                    length++
                }

                result = maxOf(result, length)
            }
        }

        return result
    }
}
