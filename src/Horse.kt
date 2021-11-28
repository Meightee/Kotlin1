open class Horse(val horseFood: String, val horseLocation: String, val horseName: String, val speed: String): Animal (horseFood, horseLocation, horseName)
{
    override fun makeNoise() {
        println("$name фырчит")
    }
    override fun eat() {
        println("$name решила поесть")
    }
}