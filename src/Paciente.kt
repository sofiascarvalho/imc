import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var nome:String = ""
    var dataNascimento:LocalDate?=null
    //criar variavel do tipo date com valor nulo, a interrogacao serve para quebrar a regra
    var peso:Int=0
    var altura:Double=0.0




    private fun calcularImc():Double{
        return peso/altura.pow(2)
    }

    fun exibirDados(){
        println("----------------------")
        println("RESULTADOS")
        println("----------------------")
        println("Nome: $nome")
        println("Idade: ${calcularIdade()}")
        println("Peso: $peso")
        println("Altura: $altura")
        println("IMC: ${calcularImc()}")
        println("----------------------")
    }

    private fun calcularIdade(): Int{
        var hoje=LocalDate.now()
        return Period.between(dataNascimento, hoje).years
    }



}