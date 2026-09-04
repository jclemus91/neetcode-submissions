class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        nums.sort()

        var a = 0
        val results = mutableListOf<List<Int>>()

        while (a < nums.size - 2) { 
            var l = a + 1
            var r = nums.size - 1

            while (l < r) {
                val sum = nums[a] + nums[l] + nums[r]

                if (sum == 0) {
                    results.add(listOf(nums[a], nums[l], nums[r]))
                    l++
                    r--

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++
                    }
                
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--
                    }

                } else if (sum > 0) {
                    r--
                } else {
                    l++
                }
            }

            var nextA = a + 1
            while (nextA < nums.size - 1 && nums[a] == nums[nextA]) {
                nextA++
            }
            a = nextA
        }

        return results
    }
}
