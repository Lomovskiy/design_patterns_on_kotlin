import behavioral.mediator.Component
import behavioral.mediator.Component1
import behavioral.mediator.Component2
import behavioral.mediator.Component3
import behavioral.mediator.PrintMediator

fun main() {

    val components: List<Component> = listOf(
            Component1(PrintMediator),
            Component2(PrintMediator),
            Component3(PrintMediator)
    )

    components.forEach { component: Component ->
        component.doSmt()
    }

}
