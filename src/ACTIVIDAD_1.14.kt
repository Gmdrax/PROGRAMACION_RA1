import java.util.Scanner

//Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims), imprimeixi quan haurà de
//pagar cada començal.
fun main() {

    val scan = Scanner(System.`in`)

    //Revem les dades de cuants començals hi han.
    println("cual es el numero de començals?")
    var numComen : Double = scan.nextDouble()
    //Revem el preu de cuan ha cosatat el sopar.
    println("cual es el preu del sopar?")
    var preuSopar : Double = scan.nextDouble()

    //Defininm la variable y dividim el preu del sopar entre els començals.
    var preuFinal = (preuSopar/numComen)

    //Mostrem el preu final del sopar pero cada persona.
    println("${preuFinal}  €" )

}

