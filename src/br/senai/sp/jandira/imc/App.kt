package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate
import java.time.LocalTime

fun main() {

    var paciente1= Paciente()
    paciente1.nome="Ana Maria"
    paciente1.peso=53
    paciente1.altura=1.70
    paciente1.dataNascimento=LocalDate.of(2003, 8, 14)
    paciente1.exibirDados()


    var paciente2= Paciente()
    paciente2.nome="Sofia"
    paciente2.peso=55
    paciente2.altura=1.75
    paciente2.dataNascimento=LocalDate.of(2007, 11, 28)
    paciente2.exibirDados()


    //criar um objeto medico
    var medico1=Medico()
    medico1.nome="Paula Oliveira"
    medico1.crm="333333-09"
    medico1.especialidades.add("Clínico Geral")
    medico1.especialidades.add("Cardiologista")
    medico1.especialidades.add("Dermatologista")
    medico1.exibirFichaDoMedico()


    //criar consulta
    var consulta1=Consulta()
    consulta1.marcarConsulta(
        900.0,
        medico1,
        paciente1,
        LocalDate.of(2025, 2, 23),
        LocalTime.of(10, 30)
    )
    consulta1.mostrarDadosConsulta()


//    //criar lista de frutas
//    var frutas=ArrayList<String>()
//    frutas.add("Banana")
//    frutas.add("Melancia")
//    frutas.add("Uva")
//    frutas.add("Maçã")
//
//    /*contar tamanho da lista atraves de funcao
//    println(frutas.count())
//
//
//    contar tamanho da lista atraves de atributo
//    println(frutas.size)
//
//
//    solicitando que mostre o nome da fruta nesse indice
//    println(frutas[1])
//
//
//    mudar valor do indice
//    frutas[1]="melao"
//    println(frutas[1])
//
//
//    exibir vetor em formato de lista while
//    var i=0
//    while (i<frutas.count()){
//        println("$i - ${frutas[i]}")
//        i++
//    }
//
//
//    exibir vetor em formato de lista for (sem indice)
//    for (fruta in frutas){
//        println(fruta)
//    }
//
//
//    estrutura de repeticao com while
//    var contador =1
//    while(contador<=10){
//        println("$contador - SENAI")
//        contador++
//    }
//
//
//    for(voltas in 1..10){
//        println("$voltas - SESI")
//    }
//
//
//    de 3 em 3
//    for (voltas in 1..100 step 3){
//        println("$voltas - SESI")
//    }*/


}