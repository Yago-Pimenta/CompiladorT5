// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.meu.lexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeuParser}.
 */
public interface MeuParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MeuParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MeuParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MeuParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(MeuParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(MeuParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(MeuParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(MeuParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(MeuParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(MeuParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#declaracao_constante}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_constante(MeuParser.Declaracao_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#declaracao_constante}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_constante(MeuParser.Declaracao_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#declaracao_tipo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_tipo(MeuParser.Declaracao_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#declaracao_tipo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_tipo(MeuParser.Declaracao_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variavel(MeuParser.Declaracao_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variavel(MeuParser.Declaracao_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MeuParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MeuParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(MeuParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(MeuParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(MeuParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(MeuParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(MeuParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(MeuParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(MeuParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(MeuParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(MeuParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(MeuParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(MeuParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(MeuParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(MeuParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(MeuParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(MeuParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(MeuParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(MeuParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(MeuParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MeuParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MeuParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MeuParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MeuParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(MeuParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(MeuParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(MeuParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(MeuParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(MeuParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(MeuParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(MeuParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(MeuParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(MeuParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(MeuParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(MeuParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(MeuParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(MeuParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(MeuParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(MeuParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(MeuParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(MeuParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(MeuParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(MeuParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(MeuParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(MeuParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(MeuParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(MeuParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(MeuParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(MeuParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(MeuParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(MeuParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(MeuParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(MeuParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(MeuParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(MeuParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(MeuParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(MeuParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(MeuParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(MeuParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(MeuParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(MeuParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(MeuParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(MeuParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(MeuParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(MeuParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(MeuParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(MeuParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(MeuParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(MeuParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(MeuParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(MeuParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(MeuParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(MeuParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(MeuParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(MeuParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(MeuParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(MeuParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(MeuParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(MeuParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(MeuParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(MeuParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(MeuParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(MeuParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(MeuParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(MeuParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(MeuParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(MeuParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(MeuParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(MeuParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(MeuParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MeuParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(MeuParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MeuParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(MeuParser.Op_logico_2Context ctx);
}