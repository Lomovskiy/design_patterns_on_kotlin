package behavioral.mediator

internal interface Mediator {

    fun notify(component: Component)

}

internal object PrintMediator : Mediator {

    override fun notify(component: Component) {
        when (component) {
            is Component1 -> {
                println("Handling notify call from component 1")
            }
            is Component2 -> {
                println("Handling notify call from component 2")
            }
            is Component3 -> {
                println("Handling notify call from component 3")
            }
        }
    }

}
