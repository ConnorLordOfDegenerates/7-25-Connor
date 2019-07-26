abstract class Animal {
    abstract val image = ""
    abstract val food = ""
    abstract val habitat = ""
    var hunger = 10


    abstract fun makeNoise() {
        println("The animal is making a noise")
    }

    abstract fun eat() {
        println("The animal is eating")
    }

    fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}