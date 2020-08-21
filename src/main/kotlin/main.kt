fun main(args: Array<String>) {

    val locationProvider: GpsLocationProvider = GpsLocationProvider()

    locationProvider.registerListener { latitude, longitude ->
        println("Log location from listener1: latitude: $latitude; longitude: $longitude")
    }

    locationProvider.registerListener { latitude, longitude ->
        println("Log location from listener2: latitude: $latitude; longitude: $longitude")
    }

    locationProvider.notifyListeners(1.0, 1.0)
    locationProvider.notifyListeners(2.0, 2.0)
    locationProvider.notifyListeners(3.0, 3.0)

}