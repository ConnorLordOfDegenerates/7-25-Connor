class Lion: Feline(){

    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "savannah"

    override fun makeNoise() {
        println("Roar")
    }

    override fun eat() {

        println("The Lion is eating $food")
    }
}