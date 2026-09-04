class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        for (i in board.indices) {
            val hashSet = mutableSetOf<Char>()
            for (j in board[0].indices) {
                val number = board[i][j]
                
                if (number == '.') continue

                if (hashSet.contains(number)) return false

                hashSet.add(number)
            }
        }

        for (i in board.indices) {
            val hashSet = mutableSetOf<Char>()
            for (j in board[0].indices) {
                val number = board[j][i]

                if (number == '.') continue

                if (hashSet.contains(number)) return false

                hashSet.add(number)
            }
        }

        val hashMap = mutableMapOf<Int, MutableSet<Char>>()

        for (i in board.indices) {
            for (j in board[0].indices) {
                val subI = i / 3
                val subJ = j / 3
                val subBox = subI * 3 + subJ

                val number = board[i][j]

                if (number == '.') continue

                val hashSet = hashMap.getOrPut(subBox) { mutableSetOf<Char>() }

                if (hashSet.contains(number)) return false

                hashSet.add(number)
            }
        }

        return true
    }
}
