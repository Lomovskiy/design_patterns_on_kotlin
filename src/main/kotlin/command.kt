interface Command {
    fun execute()
}

class Back(val receiver: Receiver) : Command {
    override fun execute() {
        receiver.applyCommand(this)
    }
}

class Forward(val receiver: Receiver) : Command {
    override fun execute() {
        receiver.applyCommand(this)
    }
}

interface Receiver {
    fun applyCommand(command: Command)
}

class ReceiverImpl : Receiver {
    override fun applyCommand(command: Command) {
        when (command) {
            is Back -> {
                println("Do back")
            }
            is Forward -> {
                println("Do forward")
            }
        }
    }
}

class Invoker {

    private final var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun run() {
        command?.execute()
    }

}
