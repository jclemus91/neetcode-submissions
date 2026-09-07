class Solution {

    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

        val cars = position.indices
            .map { index -> 
                Car(
                    position[index],
                    speed[index]
                )
            }
            .sortedByDescending { car ->
                car.position
            }


        val stack = ArrayDeque<Double>()

        for (car in cars) {
            val distanceToTarget = target - car.position
            val arrivalTime = distanceToTarget.toDouble() / car.speed

            if (stack.isEmpty() || arrivalTime > stack.last()) {
                stack.addLast(arrivalTime)
            }
        }

        return stack.size
    }
}

data class Car(
    val position: Int,
    val speed: Int
)

