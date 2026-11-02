/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()

        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)

        val rightSide = mutableListOf<Int>()

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (index in 0 until size) {
                val node = queue.removeFirst()

                if (index == size - 1) {
                    rightSide.add(node.`val`)
                }

                if (node.left != null) queue.addLast(node.left)
                if (node.right != null) queue.addLast(node.right)
            }
        }

        return rightSide
    }
}
