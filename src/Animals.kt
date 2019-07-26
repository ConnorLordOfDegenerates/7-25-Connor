interface Roamable {
    fun roam()
}

abstract class Animal {
    abstract val image = ""
    abstract val food = ""
    abstract val habitat = ""
    open var hunger = 10


    abstract fun makeNoise() {
        println("The animal is making a noise")
    }

    override fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}