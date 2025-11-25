package models

import exceptions.AlunoNaoEncontradoException
import exceptions.ConteudoNaoEncontradoException
import exceptions.JaExisteAlunoException
import exceptions.JaExisteCursoException

class Formacoes( val nome:String,  val nivel: Nivel,  val conteudosIniciais: List<ConteudosEducacionais> = emptyList<ConteudosEducacionais>()) {

        private val _inscritos = mutableListOf<Aluno>()
        private val _conteudosFormacao = mutableListOf<ConteudosEducacionais>().apply {
        addAll(conteudosIniciais)
        }

    val inscritos get() = _inscritos.toList()
    val conteudosFormacao get() = _conteudosFormacao.toList()


    fun matricular(aluno: Aluno) {
        if (_inscritos.contains(aluno)) {
            throw JaExisteAlunoException("Aluno ${aluno.nome} já está matriculado na formação $nome")
        }
        _inscritos.add(aluno)
    }

    // CANCELAR MATRÍCULA - Lança exceção quando aluno não existe
    fun cancelarMatricula(aluno: Aluno) {
        if (!_inscritos.contains(aluno)) {
            throw AlunoNaoEncontradoException("Aluno ${aluno.nome} não encontrado na formação $nome")
        }
        _inscritos.remove(aluno)
    }

    // ADICIONAR CONTEÚDO - Lança exceção quando conteúdo já existe
    fun adicionarConteudo(conteudo: ConteudosEducacionais) {
        if (_conteudosFormacao.contains(conteudo)) {
            throw JaExisteCursoException("Conteúdo ${conteudo.nome} já existe na formação $nome")
        }
        _conteudosFormacao.add(conteudo)
    }

    // REMOVER CONTEÚDO - Lança exceção quando conteúdo não existe
    fun removerConteudo(conteudo: ConteudosEducacionais) {
        if (!_conteudosFormacao.contains(conteudo)) {
            throw ConteudoNaoEncontradoException("Conteúdo ${conteudo.nome} não encontrado na formação $nome")
        }
        _conteudosFormacao.remove(conteudo)
    }

}