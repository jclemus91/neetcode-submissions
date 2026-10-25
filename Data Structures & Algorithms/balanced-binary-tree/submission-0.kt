/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        return depth(root).isBalanced
    }

    fun depth(root: TreeNode?): Balance {
        if (root == null) {
            return Balance(isBalanced = true, depth = 0)
        }
        
        val left = depth(root.left)
        val right = depth(root.right)

        val isBalanced = left.isBalanced && 
            right.isBalanced && 
            abs(left.depth - right.depth) <= 1

        return Balance(
            isBalanced = isBalanced, 
            depth = 1 + maxOf(left.depth, right.depth)
        )
    }

    data class Balance(
        val isBalanced: Boolean, 
        val depth: Int
    )
}
