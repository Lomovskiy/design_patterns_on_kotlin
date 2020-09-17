import behavioral.System

// Caretaker
fun main() {

    val states = mutableListOf<System.Momento>()

    val system = System("1")

    states.add(system.set("2"))
    states.add(system.set("3"))
    states.add(system.set("4"))

    system.restore(states.first())

}
