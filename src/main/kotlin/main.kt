fun main() {

    val invoker = Invoker()
    val receiver: Receiver = ReceiverImpl()
    var command: Command = Forward(receiver)
    invoker.setCommand(command)
    invoker.run()
    command = Back(receiver)
    invoker.setCommand(command)
    invoker.run()

}
