# 📚 Projeto de Estudos em Kotlin

Pequeno projeto criado para praticar os **conceitos básicos da linguagem Kotlin**, como classes, encapsulamento, listas mutáveis, exceções personalizadas e organização de código.

Este repositório contém uma estrutura simples que simula um sistema de **formações educacionais**, onde é possível cadastrar alunos, adicionar conteúdos e gerenciar matrículas.

---

## 🚀 Objetivo do Projeto

O propósito deste código é servir como um **exercício de aprendizado**, explorando fundamentos importantes de Kotlin:

* Definição de classes
* Construtores primários
* Propriedades `val` e `var`
* Encapsulamento com propriedades privadas
* Getters somente leitura usando `toList()`
* Mutabilidade controlada com `MutableList`
* Criação e lançamento de exceções customizadas
* Organização de arquivos em um pacote (`models`)
* Uso de enums para representar níveis

---

## 🧩 Estrutura do Projeto

```
src/
 └── models/
      ├── Formacoes.kt
      ├── Aluno.kt
      ├── ConteudosEducacionais.kt
      └── Nivel.kt
 └── exceptions/
      ├── JaExisteAlunoException.kt
      ├── AlunoNaoEncontradoException.kt
      ├── JaExisteCursoException.kt
      └── ConteudoNaoEncontradoException.kt
```

---

## 🏛️ Classe Principal: `Formacoes`

A classe `Formacoes` representa uma formação educacional.
Ela armazena:

* Nome da formação
* Nível (enum `Nivel`)
* Conteúdos educacionais
* Alunos inscritos

### Principais funcionalidades:

✔ Matricular alunos
✔ Cancelar matrícula
✔ Adicionar conteúdos
✔ Remover conteúdos
✔ Evitar duplicidades
✔ Lançar exceções caso algo não exista

Listas internas são privadas e expostas de forma segura por meio de:

```kotlin
val inscritos get() = _inscritos.toList()
```

Garantindo imutabilidade externa.

---

## ⚠️ Exceções Personalizadas

O projeto utiliza diversas exceções para deixar o fluxo mais claro e seguro:

* `JaExisteAlunoException`
* `AlunoNaoEncontradoException`
* `JaExisteCursoException`
* `ConteudoNaoEncontradoException`

Essas exceções ajudam a reforçar a prática de **tratamento de erros e validações**.

---

## 📘 Tecnologias Utilizadas

* **Kotlin** (JVM)
* IntelliJ IDEA / Android Studio / qualquer IDE compatível

---

## 🧪 Como Executar

1. Certifique-se de ter o **Kotlin** ou o **JDK** instalado.
2. Clone o repositório:

   ```
   git clone https://github.com/SEU_USUARIO/SEU_REPO.git
   ```
3. Abra o projeto em sua IDE favorita.
4. Compile e execute o arquivo principal (se houver).

---

## 🎓 Aprendizados

Durante o desenvolvimento deste mini-projeto, foram praticados:

* Sintaxe básica do Kotlin
* Organização de classes e pacotes
* Encapsulamento e boas práticas
* Manipulação de listas mutáveis
* Criação de exceções customizadas
* Uso de enums
* Construtores e propriedades
* Escrita de métodos com validação

Este é um projeto simples, mas eficiente para aprender o essencial da linguagem.

---

## ✨ Melhorias Futuras

* Criar testes unitários com KotlinTest / JUnit
* Adicionar persistência simples (ex: JSON, arquivo, ou banco em memória)
* Criar uma interface CLI
* Evoluir para uma API usando Ktor ou Spring Boot Kotlin
* Adicionar documentação do código com KDoc

---

## 📝 Licença

Este projeto é apenas para estudo. Use como quiser!
