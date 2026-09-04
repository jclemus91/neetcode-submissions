class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val hashMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            hashMap[num] = hashMap.getOrDefault(num, 0) + 1
        }

        val heap = PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })

        for (entry in hashMap.entries) {
            heap.add(entry.key to entry.value)
        }

        val result = IntArray(k)
        for (i in 0 until result.size) {
            val pair = heap.poll()
            result[i] = pair.first
        }

        return result
    }
}
