package structural

interface Os {

    fun halt()

    fun getName(): String

}

interface Bios {

    fun execute()

    fun waitForKeyPress()

    fun launch(os: Os)

    fun powerDown()

}

class Facade(
    private val os: Os,
    private val bios: Bios
) {

    fun turnOn() {
        bios.execute()
        bios.waitForKeyPress()
        bios.launch(os)
    }

    fun turnOff() {
        os.halt()
        bios.powerDown()
    }

}
