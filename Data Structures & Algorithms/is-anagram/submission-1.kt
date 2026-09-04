class Solution {

    fun isAnagram(s: String, t: String): Boolean {
        
        val sItems = mutableListOf<Char>()
        for (letter in s) {
            sItems.add(letter)
        }

        for (letter in t) {
            if (!sItems.remove(letter)) {
                return false
            }
        }

        return sItems.isEmpty()
    }

}
