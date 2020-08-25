fun main() {

    val navigator = Navigator(HikingStrategy)
    navigator.buildRoute(1.0, 2.0)
    navigator.setStrategy(CarStrategy)
    navigator.buildRoute(3.0, 4.0)
    navigator.setStrategy(PublicTransportStrategy)
    navigator.buildRoute(5.0, 6.0)

}
