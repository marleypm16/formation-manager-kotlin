package models

class Aluno(val nome:String,val email:String) {

    override fun toString(): String {
        return "Aluno(nome='$nome', email='$email')"
    }

}