package models

class ConteudosEducacionais(val nome:String,val nivel: Nivel, val duracao:Int) {



    override fun toString(): String {
        return "Conteudo: $nome (${duracao}min - ${nivel.name.lowercase().replaceFirstChar { it.uppercase() }})"
    }

}