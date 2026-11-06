/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return isValid(
            root = root, 
            lowerBound = Int.MIN_VALUE, 
            upperBound = Int.MAX_VALUE
        )
    }

    fun isValid(root: TreeNode?, lowerBound: Int, upperBound: Int) : Boolean {
        if (root == null) return true

        val isValid = root.`val` > lowerBound && root.`val` < upperBound ?: return false

        val left = isValid(
            root = root?.left, 
            lowerBound = lowerBound,
            upperBound = root.`val`
        )
        val right = isValid(
            root = root?.right,
            lowerBound = root.`val`,
            upperBound = upperBound
        )

        return isValid && left && right
    }
}
