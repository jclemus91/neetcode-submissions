class Solution {

    private val map = mutableMapOf<String, List<String>>()

    fun encode(strs: List<String>): String {
        val key = strs.joinToString("-")
        map[key] = strs
        return key
    }

    fun decode(str: String): List<String> {
        return map[str] ?: emptyList()
    }
}
