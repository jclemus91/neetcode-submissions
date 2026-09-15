class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return false
        }

        val rows = matrix.size
        val cols = matrix[0].size

        var left = 0
        var right = (rows * cols) - 1
        
        while (left <= right) {
            val mid = (left + right) / 2

            val row = mid / cols
            val col = mid % cols

            if (matrix[row][col] == target) {
                return true
            }

            if (matrix[row][col] > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return false
    }
}
