interface Drawer {

    fun draw(figure: Figure)

}

class ColorDrawer : Drawer {

    override fun draw(figure: Figure) {
        println("Рисую цветной $figure")
    }

}

class BlackWhiteDrawer : Drawer {

    override fun draw(figure: Figure) {
        println("Рисую чёрно-белый $figure")
    }

}

interface Figure {
    fun accept(drawer: Drawer)
}

class Triangle : Figure {

    override fun accept(drawer: Drawer) {
        drawer.draw(this)
    }

    override fun toString(): String {
        return "треугольник"
    }

}

class Circle : Figure {

    override fun accept(drawer: Drawer) {
        drawer.draw(this)
    }

    override fun toString(): String {
        return "круг"
    }

}

class Rectangle : Figure {

    override fun accept(drawer: Drawer) {
        drawer.draw(this)
    }

    override fun toString(): String {
        return "прямоугольник"
    }

}
