package behavioral

enum class ClickType {
    SHORT,
    LONG,
    MOVE
}

class ClickEvent(val type: ClickType)

interface ClickHandler {

    fun handleClick(clickEvent: ClickEvent)

    fun getParent(): ClickHandler?

}


class Button(private val parent: ClickHandler?) : ClickHandler {

    override fun handleClick(clickEvent: ClickEvent) {
        if (clickEvent.type == ClickType.SHORT) {
            print("Обработала быстрое нажатие")
        } else {
            getParent()?.handleClick(clickEvent)
        }
    }

    override fun getParent(): ClickHandler? {
        return parent
    }

}

class DialogWindow() : ClickHandler {

    override fun handleClick(clickEvent: ClickEvent) {
        if (clickEvent.type == ClickType.LONG) {
            print("Обработал долгое нажатие")
        } else {
            print("Никто не обработал этот event")
        }
    }

    override fun getParent(): ClickHandler? {
        return null
    }

}