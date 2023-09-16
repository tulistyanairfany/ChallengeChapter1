fun main() {
    val pyramid = Pyramid(8)
    val invertedPyramid = InvertedPyramid(8)
    val diamond = Diamond(8)
    val xShape = XShape(16)
    val hollowPyramid = HollowPyramid(6)

    println("Piramida Bintang:")
    pyramid.draw()

    println("\nPiramida Terbalik Bintang:")
    invertedPyramid.draw()

    println("\nLayang-layang Bintang:")
    diamond.draw()

    println("\nX Bintang:")
    xShape.draw()

    println("\nPiramida Hollow Bintang:")
    hollowPyramid.draw()
}

abstract class Shape(val size: Int) {
    abstract fun draw()
}

class Pyramid(size: Int) : Shape(size) {
    override fun draw() {
        for (i in 1..size) {
            for (j in 1..size - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}

class InvertedPyramid(size: Int) : Shape(size) {
    override fun draw() {
        for (i in size downTo 1) {
            for (j in 1..size - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}

class Diamond(size: Int) : Shape(size) {
    override fun draw() {
        for (i in 1..size) {
            for (j in 1..size - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
        for (i in size - 1 downTo 1) {
            for (j in 1..size - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}

class XShape(size: Int) : Shape(size) {
    override fun draw() {
        for (i in 1..size) {
            for (j in 1..size) {
                if (j == i || j == size - i + 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }

    }
}

class HollowPyramid(size: Int) : Shape(size) {
    override fun draw() {
        for (i in 1..size) {
            for (j in 1..size - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == size) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}
