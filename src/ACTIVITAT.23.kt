import java.util.Scanner

//Fes un programa que rebi el valor del nivell de riure de 5 persones i comprovi si la dita és certa.
fun main() {

    val scan = Scanner(System.`in`)

    var lletra : Double = scan.nextDouble()

    var resultado : Boolean

    if ( lletra == 13) {
        resultado = true
    }


    else {
        resultado = false
    }

    println( resultado )
}
