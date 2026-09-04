class Solution {
    fun trap(height: IntArray): Int {
        val maxLeft = IntArray(height.size)
        var tmpMax = 0
        for (i in 0 until height.size) {
            maxLeft[i] = tmpMax
            tmpMax = maxOf(tmpMax, height[i])
        }

        val maxRight = IntArray(height.size)
        tmpMax = 0
        for (i in height.size - 1 downTo 0) {
            maxRight[i] = tmpMax
            tmpMax = maxOf(tmpMax, height[i])
        }

        var water = 0
        for (i in 0 until height.size) {
            val maxHeights = minOf(maxLeft[i], maxRight[i])
            val currentHeight = height[i]

            val tmpWater = maxHeights - currentHeight
            if (tmpWater >= 0) {
                water += tmpWater
            }
        }

        return water
    }
}
