open class Dog(val dogFood: String, val dogLocation: String, val dogName: String, val size: String): Animal (dogFood, dogLocation, dogName)
{
    override fun makeNoise() {
        println("$name мешает спать гавканьем")
    }
    override fun eat() {
        println("$name опять ест")
    }
}