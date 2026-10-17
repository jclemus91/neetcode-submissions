/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var left = 0
        var right = 0

        var previous: ListNode? = null
        var leftNode: ListNode? = head
        var rightNode: ListNode? = head 

        while (rightNode != null) {

            if (right - left == n) {
                previous = leftNode
                leftNode = leftNode?.next
                left += 1
            } 

            rightNode = rightNode?.next
            right += 1
        }

        if (previous == null) {
            return head?.next
        } else {
            previous?.next = leftNode?.next
        }
        
        return head
    }
}
