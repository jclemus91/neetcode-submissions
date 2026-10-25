/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    var max = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        val highest = depth(root)
        println("highest: $highest max: $max" )
        return max
    }

    fun depth(root: TreeNode?): Int {
        if (root == null) return 0

        val left = depth(root.left)
        val right = depth(root.right)

        max = maxOf(max, (left + right))

        return 1 + maxOf(left, right)
    }


}
