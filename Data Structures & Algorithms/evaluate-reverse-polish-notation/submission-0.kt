class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        
        val stack = ArrayDeque<Int>()

        for (token in tokens) {
            if (token.toIntOrNull() != null) {
                stack.addLast(token.toInt())
            } else {
                val right = stack.removeLast()
                val left = stack.removeLast()
                when(token) {
                    "+" -> stack.addLast(left + right)
                    "-" -> stack.addLast(left - right)
                    "*" -> stack.addLast(left * right)
                    "/" -> stack.addLast(left / right)
                }
            }
        }

        return stack.last()
    }
}
