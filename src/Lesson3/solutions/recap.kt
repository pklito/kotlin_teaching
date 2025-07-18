package Lesson3.solutions

import kotlin.math.*

enum class Units{
    METERS,
    INCHES
}

fun deg2rad(degrees: Double) : Double = PI * degrees / 180.0
class RobotArm (var armLength: Double, var wristOpen: Boolean?, units: Units = Units.METERS){
    val INCHES_TO_METERS = 100 / 2.54   //constant
    val wristSize = 0.05
    // Alternatively to the "var" solution, we can still put them here:
    // var armLength : Double = armLength
    // var wristOpen = wristOpen

    init {
        // Init runs right after the constructor!
        // we use it to replace constructor code in the old method.
        armLength = when(units){
            Units.METERS -> armLength
            Units.INCHES -> armLength * INCHES_TO_METERS
        }
    }

    fun calculateEndEffector(angleDegrees: Double): Pair<Double, Double> {

        val radius = this.armLength + (if(wristOpen != null) wristSize else 0.0)
        return Pair(radius * cos(deg2rad(angleDegrees)),radius * sin(deg2rad(angleDegrees)))
    }
}



// ---- RUN -----
var angle = 0.0
fun loop(robot: RobotArm){
    println(robot.calculateEndEffector(angle))
    angle += 30
}

fun main(){
    val robot = RobotArm(0.1, false, Units.METERS)  //final variable of the robot
    loop(robot)
    loop(robot)
    loop(robot)
    loop(robot)
    loop(robot)

}