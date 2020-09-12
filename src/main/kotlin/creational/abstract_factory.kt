package creational

interface Button
interface CheckBox
interface TextField

class IOSButton : Button
class IOSCheckBox : CheckBox
class IOSTextField : TextField

class AndroidButton : Button
class AndroidCheckBox : CheckBox
class AndroidTextField : TextField

interface UiFactory {

    fun getButton(): Button

    fun getCheckBox(): CheckBox

    fun getTextField(): TextField

}

class IOSUIFactory : UiFactory {

    override fun getButton(): Button {
        return IOSButton()
    }

    override fun getCheckBox(): CheckBox {
        return IOSCheckBox()
    }

    override fun getTextField(): TextField {
        return IOSTextField()
    }

}

class AndroidUiFactory : UiFactory {

    override fun getButton(): Button {
        return AndroidButton()
    }

    override fun getCheckBox(): CheckBox {
        return AndroidCheckBox()
    }

    override fun getTextField(): TextField {
        return AndroidTextField()
    }

}
