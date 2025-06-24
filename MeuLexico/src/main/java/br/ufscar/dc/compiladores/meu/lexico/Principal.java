package br.ufscar.dc.compiladores.meu.lexico;

import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(args[1])) {
            // Carrega o arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            System.out.println("Arquivo de entrada carregado com sucesso.");

            // Inicializa lexer e parser
            MeuLexer lexer = new MeuLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MeuParser parser = new MeuParser(tokens);

            // Configura listener de erros sintáticos
            parser.removeErrorListeners();
            MyCustomErrorListener listener = new MyCustomErrorListener(pw);
            parser.addErrorListener(listener);

            // Analisa sintaxe
            MeuParser.ProgramaContext arvore = parser.programa();

            // Análise semântica
            LaSemantico analisadorSemantico = new LaSemantico();
            analisadorSemantico.visitPrograma(arvore);

            // Imprime erros semânticos
            for (String erro : LaSemanticoUtils.listaErros) {
                pw.println(erro);
            }

            if (!listener.hasError() && LaSemanticoUtils.listaErros.isEmpty()) {
                       StringBuilder sb = new StringBuilder();
                       GeradorSelecao gerador = new GeradorSelecao(analisadorSemantico.contexto, sb);
                       // aqui chamamos o generate, que insere includes, int main, return, etc.
                       pw.print(gerador.generate(arvore));
            } else {
                       // se quiser manter a saída de erros (já foi escrito pelo listener e pelo LaSemanticoUtils),
                       // pode imprimir aqui um "Fim da compilacao", ou simplesmente deixá-lo sem nada extra.
                       // pw.println("Fim da compilacao");
                   }
        } catch (Exception e) {
            System.err.println("Erro ao executar o compilador: " + e.getMessage());
        }
    }
}
