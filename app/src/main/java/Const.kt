const  val PI = 3.14 // static final (in java) . Value of PI is known before code executes.
val pi =getPIvalue() // Allowed
// const val PI2=getPIvalue()  // Not allowed. Initializer should be a constant value.

fun main(){
    val name = "Chetali" // final (in java)
    var i = 1
}

fun getPIvalue() : Double = 3.14