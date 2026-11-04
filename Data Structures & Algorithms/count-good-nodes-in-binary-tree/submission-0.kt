/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun goodNodes(root: TreeNode?): Int {
        return findGoods(root, Int.MIN_VALUE)
    }

    fun findGoods(root: TreeNode?, maxInPath: Int): Int {
        if (root == null) return 0

        val current = if (root.`val` >= maxInPath) 1 else 0

        val updatedMaxInPath = maxOf(maxInPath, root.`val`)

        val left = findGoods(root?.left, updatedMaxInPath)
        val right = findGoods(root?.right, updatedMaxInPath)

        return current + left + right
    }
}
