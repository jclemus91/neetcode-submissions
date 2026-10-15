/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {

        var slow = head
        var fast = head
        var previous: ListNode? = null
        while (fast != null) {
            previous = slow
            slow = slow?.next
            fast = fast?.next?.next
        }

        previous?.next = null
        var firstHead = head

        var prev: ListNode? = null

        while (slow != null) {
            var next = slow?.next
            slow.next = prev
            prev = slow
            slow = next
        }

        var secondHead = prev

        while (firstHead != null && secondHead != null) {


            var firstNext = firstHead.next
            var secondNext = secondHead.next

            firstHead?.next = secondHead
            firstHead.next?.next = firstNext

            firstHead = firstNext
            secondHead = secondNext
        }
    }
}
