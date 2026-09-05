typealias Index = Int
typealias Temperature = Int

class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Pair<Index, Temperature>>()
        val result = IntArray(temperatures.size)

        for ((index, temperature) in temperatures.withIndex()) {
            while (
                stack.isNotEmpty() && 
                stack.last().second < temperature
            ) {
                val (topIndex, _) = stack.removeLast()
                result[topIndex] = index - topIndex
            }

            stack.addLast(index to temperature)
        }

        return result
    }
}
