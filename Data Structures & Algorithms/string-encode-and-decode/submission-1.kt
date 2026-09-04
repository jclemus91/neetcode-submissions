class Solution {

    // 4#Hello5#World
    fun encode(strs: List<String>): String {
        var result = ""

        for (str in strs) {
            result += "${str.length}#$str"

        }
        
        return result
    }

    fun decode(str: String): List<String> {
        
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            var j = i
            while (str[j]!! != '#') {
                j += 1
            }

            val length = str.substring(i, j).toInt()
            val start = j + 1
            val end = start + length
            val word = str.substring(start, end)
            result.add(word)

            i = end
        }

        return result
    }
}
