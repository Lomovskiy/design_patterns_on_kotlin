fun main() {

    val order = Order(AssignedState())
    order.handleInput(InputType.PressAddPhotoButton)
    order.handleInput(InputType.PressStartWorkButton)
    order.handleInput(InputType.PressAddPhotoButton)
    order.handleInput(InputType.PressPostponeButton)
    order.handleInput(InputType.PressAddPhotoButton)
    order.handleInput(InputType.PressAddPhotoButton)
    order.handleInput(InputType.PressEndWorkButton)
    order.handleInput(InputType.PressStartWorkButton)

}
