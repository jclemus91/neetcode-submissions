class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.length <= 1) return s.length

        
        val set = mutableSetOf<Char>()
        var left = 0
        var longest = 0

        for (right in s.indices) {
            while (s[right] in set) {
                set.remove(s[left])
                left++
            }    

            set.add(s[right])

            longest = maxOf(longest, right - left + 1)
        }

        return longest
    }
}
