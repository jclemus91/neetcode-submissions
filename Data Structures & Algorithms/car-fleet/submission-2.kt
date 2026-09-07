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

        var fleets = 0
        var fleetArrivalTime = 0.0

        for (car in cars) {
            val distanceToTarget = target - car.position
            val arrivalTime = distanceToTarget.toDouble() / car.speed

            if (arrivalTime > fleetArrivalTime) {
                fleets++
                fleetArrivalTime = arrivalTime
            }
        }

        return fleets
    }
}

data class Car(
    val position: Int,
    val speed: Int
)

