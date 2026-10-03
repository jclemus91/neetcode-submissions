class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        
        val map = mutableMapOf<Char, Int>()
        var res = 0

        var left = 0

        for (right in s.indices) {
            map[s[right]] = 1 + map.getOrDefault(s[right], 0)

            while ((right - left + 1) - map.values.max() > k) {
                map[s[left]] = (map[s[left]] ?: 0) - 1
                left++
            } 

            res = maxOf(res, right - left + 1)
        }
        
        return res
    }
}
