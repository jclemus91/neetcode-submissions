/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {


        var current = head
        val set = mutableSetOf<ListNode>()

        while (current != null) {
            
            if (current in set) {
                return true
            }

            set.add(current)
            current = current?.next
        }

        return false
    }
}
