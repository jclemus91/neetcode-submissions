/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()

        val queue = ArrayDeque<TreeNode>()
        queue.addLast(root)

        val levels = mutableListOf<List<Int>>()

        while (queue.isNotEmpty()) {
            val level = mutableListOf<Int>()

            repeat(queue.size) {
                val node: TreeNode = queue.removeFirst()
                level.add(node.`val`)

                node.left?.let { queue.addLast(it) }
                node.right?.let { queue.addLast(it) }
            }
            
            levels.add(level)
        }

        return levels
    }
}
