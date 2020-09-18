import behavioral.*

// Caretaker
fun main() {

    val dialogWindow = DialogWindow()
    val button = Button(dialogWindow)

    button.handleClick(ClickEvent(ClickType.LONG))

}
