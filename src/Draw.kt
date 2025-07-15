import javax.swing.*
import java.awt.*
import kotlin.math.*

fun drawPointPairs(g: Graphics, list : List<Nothing?>){  //TODO: Replace "Nothing?" with something!
    //should get a list of 4 doubles + extra data somehow
}

class DrawingPanel : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        g.color = Color.BLUE
        g.drawLine(50, 50, 150, 150)
    }
}

fun main() {
    val frame = JFrame("Simple Drawing")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(400, 400)
    frame.add(DrawingPanel())
    frame.isVisible = true
}
