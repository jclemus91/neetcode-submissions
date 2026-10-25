/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    
    fun maxDepth(root: TreeNode?): Int {
        return depth(root, 0)
    }

    fun depth(root: TreeNode?, depth: Int) : Int {
        if (root == null) return depth
        
        val left = depth(root.left, depth + 1)
        val right = depth(root.right, depth + 1)

        return maxOf(left, right)
    }
}
