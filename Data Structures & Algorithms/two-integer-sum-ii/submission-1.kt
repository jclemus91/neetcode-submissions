class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var l = 0
        var r = numbers.size - 1
        while (l != r) {
            val nl = numbers[l]
            val nr = numbers[r]

            val sum = nl + nr

            if (sum == target) {
                return intArrayOf(l+1, r+1)
            } else if (sum > target) {
                r--
            } else {
                l++
            }
        }

        return intArrayOf()
    }
}
