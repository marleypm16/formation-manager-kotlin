import models.Aluno
import models.ConteudosEducacionais
import models.Formacoes
import models.Nivel

fun main() {
    val aluno1 = Aluno(nome = "Guilherme","guilherme@gmail.com")
    //duracao em minutos
    val conteudosEducacional1 = ConteudosEducacionais(nome = "Introducao ao Kotlin", nivel = Nivel.INICIANTE, duracao = 80)
    val conteudosEducacional2 = ConteudosEducacionais(nome = "Introducao a ferramentas Android Com kotlin", nivel = Nivel.INTERMEDIARIO, duracao = 120)
    val conteudos = arrayListOf<ConteudosEducacionais>()
    conteudos.add(conteudosEducacional1)
    conteudos.add(conteudosEducacional2)
    val formacao = Formacoes(nivel = Nivel.INICIANTE, nome = "Formacao Kotlin", conteudosIniciais = conteudos)

    formacao.matricular(aluno1)
    println(formacao.inscritos)
    println(formacao.conteudosFormacao)
}