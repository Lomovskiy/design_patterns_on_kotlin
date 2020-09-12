import behavioral.*
import creational.*

fun main() {

    var uiFactory: UiFactory = IOSUIFactory()

    var button: Button = uiFactory.getButton()
    var checkBox: CheckBox = uiFactory.getCheckBox()
    var textField: TextField = uiFactory.getTextField()

    println(button)
    println(checkBox)
    println(textField)
    println("--------------")

    uiFactory = AndroidUiFactory()

    button = uiFactory.getButton()
    checkBox = uiFactory.getCheckBox()
    textField = uiFactory.getTextField()

    println(button)
    println(checkBox)
    println(textField)

}
