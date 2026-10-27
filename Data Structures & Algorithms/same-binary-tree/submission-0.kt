/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return same(p, q)
    }

    fun same(p: TreeNode?, q: TreeNode?) : Boolean {
        if (p == null && q == null) return true

        val left = same(p?.left, q?.left)
        val right = same(p?.right, q?.right)

        return p?.`val` == q?.`val` && left && right
    }
}
