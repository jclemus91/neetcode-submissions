/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (subRoot == null) return true

        return findSubRoot(root, subRoot)
    }

    fun findSubRoot(
        root: TreeNode?, 
        subRoot: TreeNode?
    ): Boolean {
        if (root == null) return false

        if (isValidSubtree(subRoot, root)) {
            return true
        } 

        return findSubRoot(root?.left, subRoot) || findSubRoot(root?.right, subRoot)
    }

    fun isValidSubtree(
        subRoot: TreeNode?,
        head: TreeNode?
    ): Boolean {
        if (subRoot == null && head == null) return true
        if (subRoot == null || head == null) return false
        
        if (subRoot.`val` != head.`val`) return false

        val left = isValidSubtree(subRoot?.left, head?.left)
        val right = isValidSubtree(subRoot?.right, head?.right)

        return left && right
    }
    
 }
