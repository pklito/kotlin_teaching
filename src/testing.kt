import java.util.Vector

enum class Units{
    METERS,
    INCHES
}

class RobotArm{
    val INCHES_TO_METERS = 100 / 2.54   //constant
    var armLength: Double = 0.0
    var wristOpen: Boolean? = false

    constructor(armLength: Double, wristOpen: Boolean?, units: Units = Units.METERS) {
        //store the class attributes.
        this.armLength = armLength
        this.wristOpen = wristOpen

        //TODO: task 1, rework the constructor to be the short version you know! (if you prefer it)

        if(units == Units.INCHES){
            // convert inches input into meters to store.
            this.armLength *= INCHES_TO_METERS
            //this.shoulderLength *= INCHES_TO_METERS
            //this.palmLength *= INCHES_TO_METERS
        }//TODO: optional: `implement convertUnitsToMeters(value: Double, from_units: Units): Units` and implement Units.Centimeters
    }

    fun calculateEndEffector(angleDegrees: Double): Pair<Double, Double> {
        // TODO: task 2, Implement this method
        //  Y
        //  |
        //  . _ _ X
        // If the angle is zero, the robot arm extends towards X.
        // If the robot HAS A WRIST, 0.05 cm are added to the length.
        return Pair(0.0, 0.0)
    }
}



// ---- RUN -----
var angle = 0.0
fun loop(robot: RobotArm){
    println(robot.calculateEndEffector(angle))
    angle += 20
}

fun main(){
    val robot = RobotArm(0.1, false, Units.METERS)  //final variable of the robot
    loop(robot)
    loop(robot)
    loop(robot)
    loop(robot)
    loop(robot)

}