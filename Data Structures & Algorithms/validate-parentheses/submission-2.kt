class Solution {

    fun isValid(string: String): Boolean {

        val stack = ArrayDeque<Char>()
        for (char in string) {
            if (char == '(' || char == '{' || char == '[') {
                stack.addLast(char)
            } else {
                if (stack.isEmpty()) return false
                when (char) {
                    ')' -> {
                        if (stack.removeLast() != '(') return false
                    }
                    '}' -> {
                        if (stack.removeLast() != '{') return false
                    }
                    ']' -> {
                        if (stack.removeLast() != '[') return false
                    }
                }
            }
        } 
        
        return stack.isEmpty()       
    }
}
