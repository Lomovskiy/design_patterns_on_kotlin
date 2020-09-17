package behavioral

class System(private var state: String) {

    fun set(state: String): Momento {
        val momento = Momento(this.state)
        this.state = state
        println("setting state to ${this.state}")
        return momento
    }

    fun restore(momento: Momento) {
        this.state = momento.state
        println("restored state to $state")
    }

    inner class Momento(val state: String)

}