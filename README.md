COMPILADORES-T5

Quinto trabalho da disciplina de Compiladores (T5) – Gerador de Código em C para Linguagem LA

Aluno: Yago David Pimenta • RA: 800273

Professor: Andre Backes

Descrição do Projeto:
Este repositório contém a implementação do gerador de código para a Linguagem LA, desenvolvido com ANTLR4 e Java. O Trabalho 5 (T5) integra análise léxica, sintática, semântica e geração de código, produzindo um arquivo em C que replica o comportamento do programa de entrada em LA.

Funcionalidades Implementadas:

Suporte a variáveis de tipos inteiro, real, literal e lógico

Comando de leitura (leia) e escrita (escreva)

Atribuições e expressões aritméticas simples

Estruturas condicionais (se / senao)

Laços (para, enquanto, faca-while)

Comando caso (switch-case) sem expansão de intervalos

Tradução de operadores relacionais (=, <>, >=, <=)

Limitações:

Apenas 10 de 20 casos de teste passaram com sucesso

Não há suporte completo a intervalos em caso, vetores, funções/procedimentos ou expressões complexas

Pré-requisitos:

Java 8+ (JDK instalado)

Maven

Bash (Linux, Windows ou Mac)

ANTLR4 Maven Plugin (configurado no pom.xml)

Casos de teste:
Os casos de teste fornecidos pelo professor devem estar organizados em pastas casos-de-teste/entrada e casos-de-teste/saida.

Instalação (Debian/Ubuntu):

sudo apt update
sudo apt install openjdk-11-jdk maven

Como clonar:

git clone https://github.com/Yago-Pimenta/CompiladorT5.git
cd CompiladorT5

Compilar e gerar JAR:

mvn clean generate-sources package

Isso gera:

Gramática ANTLR em target/generated-sources/antlr4

Classes Java compiladas

JAR com dependências em target/CompiladorT5-1.0-SNAPSHOT-jar-with-dependencies.jar

Como executar:

java -jar target/CompiladorT5-1.0-SNAPSHOT-jar-with-dependencies.jar <entrada.la> <saida.c>

<entrada.la>: programa em LA

<saida.c>: arquivo C gerado

Uso do corretor automático:
Copie o JAR do corretor para a pasta do projeto e execute:

java -jar compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar \
    "java -jar target/CompiladorT5-1.0-SNAPSHOT-jar-with-dependencies.jar" \
    gcc temp casos-de-teste "800273" t5

Resultados Esperados:

O gerador deve compilar o C resultante com GCC e produzir saída idêntica à do LA

Atualmente, alcançamos 10/20 nos testes automáticos

Yago David Pimenta
