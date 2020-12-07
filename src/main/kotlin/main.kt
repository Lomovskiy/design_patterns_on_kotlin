import structural.Bios
import structural.Facade
import structural.Os

fun main() {

    val os: Os = object : Os {

        override fun halt() {
            println("Halted")
        }

        override fun getName(): String {
            return "Windows"
        }


    }

    val bios: Bios = object : Bios {

        override fun execute() {
            println("Executed")
        }

        override fun waitForKeyPress() {
            println("Waiting for key press")
        }

        override fun launch(os: Os) {
            println("Launched ${os.getName()}")
        }

        override fun powerDown() {
            println("Powered downed))")
        }


    }

    val facade = Facade(os, bios)
    facade.turnOn()
    facade.turnOff()

}
