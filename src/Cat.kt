open class Cat(val catFood: String, val catLocation: String, val catName: String, val breed: String): Animal (catFood, catLocation, catName)
{
    override fun makeNoise() {
        println("$name сделал мяу")
    }
    override fun eat() {
        println("$name решил поесть")
    }
}