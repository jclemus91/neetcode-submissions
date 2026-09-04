class Solution {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        
        val sCount = mutableMapOf<Char, Int>()
        val tCount = mutableMapOf<Char, Int>()

        for (i in 0 until s.length) {
            sCount[s[i]] = sCount.getOrDefault(s[i], 0) + 1
            tCount[t[i]] = tCount.getOrDefault(t[i], 0) + 1
        }

        return sCount == tCount

    }

    

}
