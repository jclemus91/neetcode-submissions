/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val list = mutableListOf<Int>()
        kth(root, k, list)
        return list.get(k-1)
    }

    fun kth(root: TreeNode?, k: Int, list: MutableList<Int>): Boolean {
        if (root == null) return false

        if (kth(root.left, k, list)) return true

        list.add(root.`val`)
        if (k == list.size) return true

        if (kth(root.right, k, list)) return true

        return false
    }
}
