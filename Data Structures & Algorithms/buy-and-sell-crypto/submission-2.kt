class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size <= 1) return 0

        var maxProfit = 0
        var left = 0
        var right = 1
        while (right < prices.size) {
            val ln = prices[left]
            val rn = prices[right]

            if (ln < rn) {
                val current = rn - ln
                maxProfit = maxOf(maxProfit, current)
                right++
            } else {
                left = right
                right++
            }
        }
        return maxProfit
    }
}
