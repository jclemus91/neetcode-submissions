/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (p == null || q == null) return null

        return lca(root, p.`val` ?: 0, q.`val` ?: 0)
    }

    fun lca(root: TreeNode?, p: Int, q: Int): TreeNode? {
        if (root == null) return null

        val current = root?.`val` ?: 0

        return if (p < current && q < current) {
            lca(root?.left, p, q)
        } else if (p > current && q > current) {
            lca(root?.right, p, q)
        } else {
            root
        }
    }
}
