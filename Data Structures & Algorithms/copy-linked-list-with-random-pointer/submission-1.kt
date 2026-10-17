/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {

    fun copyRandomList(head: Node?): Node? {

        var original: Node? = head

        var result: Node? = null
        var clone: Node? = result

        // Original - Clone
        val map = mutableMapOf<Node, Node>()

        while (original != null) {
            val newNode = map.getClone(original)
            
            newNode?.next = map.getClone(original?.next)
            newNode?.random = map.getClone(original?.random)

            if (clone == null) {
                clone = newNode
                result = clone
            } else {
                clone?.next = newNode
                clone = clone?.next
            }
        
            original = original?.next
        }

        return result
    }

    private fun MutableMap<Node, Node>.getClone(original: Node?) : Node? {
        if (original == null) return null

        return this.getOrPut(original, { Node(original.`val`) })
    }

}
