/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(headL1: ListNode?, headL2: ListNode?): ListNode? {
        
        var l1 = headL1
        var l2 = headL2

        val result = ListNode(0)
        var current: ListNode? = result
        
        var carry = 0

        while (l1 != null || l2 != null) {

            val sum = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + carry

            val ones = sum.mod(10)
            carry = sum.div(10)

            println(ones.toString())
            println(carry.toString())

            current?.next = ListNode(ones)
            current = current?.next

            l1 = l1?.next
            l2 = l2?.next
        }

        if (carry > 0) {
            current?.next = ListNode(carry)
        }

        return result?.next
    }
}
