open class Animal(val food: String, val location: String, val name: String)
{
    open fun makeNoise() {
        println("Такое-то животное издает звук")
    }
    open fun eat() {
        println("Такое-то животное ест")
    }
    fun sleep() {
        println("Такое-то животное спит")
    }
}