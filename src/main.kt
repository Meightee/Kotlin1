fun main()
{
    val dog = Dog("мяско", "дом", "Бобик", "большой")
    val cat = Cat("корм", "пакет", "Гав", "сиамский")
    val horse = Horse("овес", "стойло", "Спирит", "очень быстрый")
    val animalArray: Array<Animal> = arrayOf(dog, cat, horse)
    var veterinarian = Veterinarian()
    for(animal in animalArray) {
        veterinarian.treatAnimal(animal)
    }
}
