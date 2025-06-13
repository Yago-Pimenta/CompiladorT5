// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.meu.lexico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeuParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MeuParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MeuParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(MeuParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(MeuParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(MeuParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#declaracao_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_constante(MeuParser.Declaracao_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#declaracao_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_tipo(MeuParser.Declaracao_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_variavel(MeuParser.Declaracao_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MeuParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(MeuParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(MeuParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(MeuParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(MeuParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(MeuParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(MeuParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(MeuParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(MeuParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(MeuParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(MeuParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MeuParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(MeuParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(MeuParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(MeuParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(MeuParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(MeuParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(MeuParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(MeuParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(MeuParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(MeuParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(MeuParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(MeuParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(MeuParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(MeuParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(MeuParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(MeuParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(MeuParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(MeuParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(MeuParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(MeuParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(MeuParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(MeuParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(MeuParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(MeuParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(MeuParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(MeuParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(MeuParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(MeuParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(MeuParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(MeuParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(MeuParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(MeuParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(MeuParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(MeuParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MeuParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(MeuParser.Op_logico_2Context ctx);
}