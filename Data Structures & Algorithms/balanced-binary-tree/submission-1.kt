/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {

    fun isBalanced(root: TreeNode?): Boolean {
        return dfs(root) != -1
    }

    private fun dfs(root: TreeNode?): Int {
        if (root == null) return 0

        val left = dfs(root.left)
        if (left == -1) return -1

        val right = dfs(root.right)
        if (right == -1) return -1

        if (abs(left - right) > 1) return -1

        return 1 + maxOf(left, right)
    }
}
