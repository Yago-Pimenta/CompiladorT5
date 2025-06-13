package br.ufscar.dc.compiladores.meu.lexico;

import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(args[1])) {
            // Criação do fluxo de caracteres a partir do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            System.out.println("Arquivo de entrada carregado com sucesso.");

            // Inicialização do lexer e parser
            MeuLexer lexer = new MeuLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MeuParser parser = new MeuParser(tokens);



            // Adiciona o listener personalizado para erros sintáticos
            // antes de adicionar o seu:
            parser.removeErrorListeners();          // opcional, remove o ConsoleErrorListener padrão
            parser.addErrorListener(new MyCustomErrorListener(pw));


            // Início da análise sintática
            MeuParser.ProgramaContext arvore = parser.programa();

            // Análise semântica
            LaSemantico analisadorSemantico = new LaSemantico();
            analisadorSemantico.visitPrograma(arvore);

            // Impressão dos erros semânticos
            for (String erro : LaSemanticoUtils.listaErros) {
                pw.println(erro);
            }

            pw.println("Fim da compilacao");

        } catch (Exception e) {
            System.err.println("Erro ao executar o compilador: " + e.getMessage());
        }
    }
}
