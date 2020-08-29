fun main() {

    val figures: ArrayList<Figure> = ArrayList(3)
    figures.add(Triangle())
    figures.add(Circle())
    figures.add(Rectangle())

    val colorDrawer = ColorDrawer()
    val blackWhiteDrawer = BlackWhiteDrawer()

    figures.forEach { figure: Figure ->
        figure.accept(blackWhiteDrawer)
    }

}
