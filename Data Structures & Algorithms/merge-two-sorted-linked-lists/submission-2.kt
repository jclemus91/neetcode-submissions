/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        
        var l1 = list1
        var l2 = list2
        var head = ListNode(0)
        var current: ListNode? = head
        while (l1 != null && l2 != null) {
            
            if (l1.`val` < l2.`val`) {
                current?.next = l1
                current = current?.next
                l1 = l1.next
            } else {
                current?.next = l2
                current = current?.next
                l2 = l2.next
            }
        }

        if (l1 != null) {
            current?.next = l1
        }

        if (l2 != null) {
            current?.next = l2
        }

        return head.next
    }
}
