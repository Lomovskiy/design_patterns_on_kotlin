package behavioral.mediator

internal interface Component {

    fun doSmt()

}

internal class Component1(private val mediator: Mediator) : Component {

    override fun doSmt() {
        mediator.notify(this)
    }

}

internal class Component2(private val mediator: Mediator) : Component {

    override fun doSmt() {
        mediator.notify(this)
    }

}

internal class Component3(private val mediator: Mediator) : Component {

    override fun doSmt() {
        mediator.notify(this)
    }

}