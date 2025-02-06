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

    private fun classificarImc():String{
        val imc=calcularImc()
        val classificacao:String


        if(imc<18.5){
            classificacao = "Abaixo do peso"
        } else if (imc>=18.5 && imc<25.0) {
            classificacao="Peso normal"
        } else {
            classificacao="Acima do peso"
        }

        return classificacao
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
        println("Classificação: ${classificarImc()}")
        println("----------------------")
    }

    private fun calcularIdade(): Int{
        var hoje=LocalDate.now()
        return Period.between(dataNascimento, hoje).years
    }



}