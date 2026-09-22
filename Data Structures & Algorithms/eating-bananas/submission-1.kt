class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
    
        val maxPile = piles.maxOrNull() ?: 0

        var result = maxPile
        
        var left = 1
        var right = maxPile
        while (left <= right) {
            
            val mid = (left + right) / 2
            val k = mid
            var sum = 0
            for (pile in piles) {
                sum += ceil(pile.toDouble() / k).toInt()
            }

            if (sum <= h) {
                result = k
                right = mid - 1
            } else {
                left = mid + 1
            }

        }

        return result
    }
}
