class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var water = Int.MIN_VALUE

        while (left < right) {
            val distance = right - left
            val height = minOf(heights[left], heights[right])

            water = maxOf(water, distance * height)

            if (heights[left] > heights[right]) {
                right--
            } else {
                left++
            }
        }

        return water
    }
}
