class Solution {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val anagrams = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {

            val rawKey = IntArray(26)
            for (char in str) {
                rawKey[char - 'a']++
            }
            
            val key = rawKey.joinToString("-")

            anagrams.getOrPut(key) { mutableListOf<String>()}.add(str)
        }

        return anagrams.values.toList()

    }
}
