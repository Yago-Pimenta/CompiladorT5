// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.meu.lexico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MeuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, FALSO=3, VERDADEIRO=4, NEGACAO=5, REGISTRO=6, 
		FIM_REGISTRO=7, LEIA=8, ESCREVA=9, PROCEDIMENTO=10, FIM_PROCEDIMENTO=11, 
		RETORNE=12, FACA=13, FUNCAO=14, FIM_FUNCAO=15, DECLARE=16, TIPO=17, LITERAL=18, 
		VAR=19, CONSTANTE=20, REAL=21, LOGICO=22, INTEIRO=23, CASO=24, FIM_CASO=25, 
		SE=26, SENAO=27, FIM_SE=28, ENTAO=29, SEJA=30, ENQUANTO=31, FIM_ENQUANTO=32, 
		PARA=33, FIM_PARA=34, ATE=35, MAIOR_OU_IGUAL_QUE=36, IGUAL=37, DIFERENTE=38, 
		E=39, OU=40, ATRIBUICAO=41, MENOR_QUE=42, MAIOR_QUE=43, MENOR_OU_IGUAL_QUE=44, 
		NUM_REAL=45, NUM_INT=46, IDENT=47, E_COMERCIAL=48, SOMA=49, MODULO=50, 
		SUBTRACAO=51, DIVISAO=52, MULTIPLICACAO=53, DEREFERENCIA=54, FECHA_PARENTESES=55, 
		VIRGULA=56, ABRE_COLCHETES=57, FECHA_COLCHETES=58, PONTO=59, INTERVALO=60, 
		DOIS_PONTOS=61, ABRE_PARENTESES=62, CADEIA=63, CADEIA_NAO_FECHADA=64, 
		COMENTARIO_NAO_FECHADO=65, COMENTARIO=66, WS=67, ERRO=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_declaracao_constante = 4, RULE_declaracao_tipo = 5, RULE_declaracao_variavel = 6, 
		RULE_tipo = 7, RULE_variavel = 8, RULE_identificador = 9, RULE_dimensao = 10, 
		RULE_tipo_basico = 11, RULE_tipo_basico_ident = 12, RULE_tipo_estendido = 13, 
		RULE_valor_constante = 14, RULE_registro = 15, RULE_declaracao_global = 16, 
		RULE_parametro = 17, RULE_parametros = 18, RULE_corpo = 19, RULE_cmd = 20, 
		RULE_cmdLeia = 21, RULE_cmdEscreva = 22, RULE_cmdSe = 23, RULE_cmdCaso = 24, 
		RULE_cmdPara = 25, RULE_cmdEnquanto = 26, RULE_cmdFaca = 27, RULE_cmdAtribuicao = 28, 
		RULE_cmdChamada = 29, RULE_cmdRetorne = 30, RULE_selecao = 31, RULE_item_selecao = 32, 
		RULE_constantes = 33, RULE_numero_intervalo = 34, RULE_op_unario = 35, 
		RULE_exp_aritmetica = 36, RULE_termo = 37, RULE_fator = 38, RULE_op1 = 39, 
		RULE_op2 = 40, RULE_op3 = 41, RULE_parcela = 42, RULE_parcela_unario = 43, 
		RULE_parcela_nao_unario = 44, RULE_exp_relacional = 45, RULE_op_relacional = 46, 
		RULE_expressao = 47, RULE_termo_logico = 48, RULE_fator_logico = 49, RULE_parcela_logica = 50, 
		RULE_op_logico_1 = 51, RULE_op_logico_2 = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "declaracao_constante", 
			"declaracao_tipo", "declaracao_variavel", "tipo", "variavel", "identificador", 
			"dimensao", "tipo_basico", "tipo_basico_ident", "tipo_estendido", "valor_constante", 
			"registro", "declaracao_global", "parametro", "parametros", "corpo", 
			"cmd", "cmdLeia", "cmdEscreva", "cmdSe", "cmdCaso", "cmdPara", "cmdEnquanto", 
			"cmdFaca", "cmdAtribuicao", "cmdChamada", "cmdRetorne", "selecao", "item_selecao", 
			"constantes", "numero_intervalo", "op_unario", "exp_aritmetica", "termo", 
			"fator", "op1", "op2", "op3", "parcela", "parcela_unario", "parcela_nao_unario", 
			"exp_relacional", "op_relacional", "expressao", "termo_logico", "fator_logico", 
			"parcela_logica", "op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'falso'", "'verdadeiro'", "'nao'", 
			"'registro'", "'fim_registro'", "'leia'", "'escreva'", "'procedimento'", 
			"'fim_procedimento'", "'retorne'", "'faca'", "'funcao'", "'fim_funcao'", 
			"'declare'", "'tipo'", "'literal'", "'var'", "'constante'", "'real'", 
			"'logico'", "'inteiro'", "'caso'", "'fim_caso'", "'se'", "'senao'", "'fim_se'", 
			"'entao'", "'seja'", "'enquanto'", "'fim_enquanto'", "'para'", "'fim_para'", 
			"'ate'", "'>='", "'='", "'<>'", "'e'", "'ou'", "'<-'", "'<'", "'>'", 
			"'<='", null, null, null, "'&'", "'+'", "'%'", "'-'", "'/'", "'*'", "'^'", 
			"')'", "','", "'['", "']'", "'.'", "'..'", "':'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FIM_ALGORITMO", "FALSO", "VERDADEIRO", "NEGACAO", 
			"REGISTRO", "FIM_REGISTRO", "LEIA", "ESCREVA", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
			"RETORNE", "FACA", "FUNCAO", "FIM_FUNCAO", "DECLARE", "TIPO", "LITERAL", 
			"VAR", "CONSTANTE", "REAL", "LOGICO", "INTEIRO", "CASO", "FIM_CASO", 
			"SE", "SENAO", "FIM_SE", "ENTAO", "SEJA", "ENQUANTO", "FIM_ENQUANTO", 
			"PARA", "FIM_PARA", "ATE", "MAIOR_OU_IGUAL_QUE", "IGUAL", "DIFERENTE", 
			"E", "OU", "ATRIBUICAO", "MENOR_QUE", "MAIOR_QUE", "MENOR_OU_IGUAL_QUE", 
			"NUM_REAL", "NUM_INT", "IDENT", "E_COMERCIAL", "SOMA", "MODULO", "SUBTRACAO", 
			"DIVISAO", "MULTIPLICACAO", "DEREFERENCIA", "FECHA_PARENTESES", "VIRGULA", 
			"ABRE_COLCHETES", "FECHA_COLCHETES", "PONTO", "INTERVALO", "DOIS_PONTOS", 
			"ABRE_PARENTESES", "CADEIA", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", 
			"COMENTARIO", "WS", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(MeuParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(MeuParser.FIM_ALGORITMO, 0); }
		public TerminalNode EOF() { return getToken(MeuParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			declaracoes();
			setState(107);
			match(ALGORITMO);
			setState(108);
			corpo();
			setState(109);
			match(FIM_ALGORITMO);
			setState(110);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1262592L) != 0) {
				{
				{
				setState(112);
				decl_local_global();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case TIPO:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_localContext extends ParserRuleContext {
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public Declaracao_constanteContext declaracao_constante() {
			return getRuleContext(Declaracao_constanteContext.class,0);
		}
		public Declaracao_tipoContext declaracao_tipo() {
			return getRuleContext(Declaracao_tipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				declaracao_variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				declaracao_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				declaracao_tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_constanteContext extends ParserRuleContext {
		public TerminalNode CONSTANTE() { return getToken(MeuParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(MeuParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public Declaracao_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracao_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracao_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDeclaracao_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_constanteContext declaracao_constante() throws RecognitionException {
		Declaracao_constanteContext _localctx = new Declaracao_constanteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CONSTANTE);
			setState(128);
			match(IDENT);
			setState(129);
			match(DOIS_PONTOS);
			setState(130);
			tipo_basico();
			setState(131);
			match(IGUAL);
			setState(132);
			valor_constante();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_tipoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MeuParser.TIPO, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracao_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracao_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDeclaracao_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_tipoContext declaracao_tipo() throws RecognitionException {
		Declaracao_tipoContext _localctx = new Declaracao_tipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(TIPO);
			setState(135);
			match(IDENT);
			setState(136);
			match(DOIS_PONTOS);
			setState(137);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_variavelContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(MeuParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracao_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracao_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDeclaracao_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DECLARE);
			setState(140);
			variavel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REAL:
			case LOGICO:
			case INTEIRO:
			case IDENT:
			case DEREFERENCIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				tipo_estendido();
				}
				break;
			case REGISTRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				registro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			identificador();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(147);
				match(VIRGULA);
				setState(148);
				identificador();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(DOIS_PONTOS);
			setState(155);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(MeuParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MeuParser.IDENT, i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<TerminalNode> PONTO() { return getTokens(MeuParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(MeuParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IDENT);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_COLCHETES) {
				{
				{
				setState(158);
				dimensao();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(164);
				match(PONTO);
				setState(165);
				match(IDENT);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ABRE_COLCHETES) {
					{
					{
					setState(166);
					dimensao();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode ABRE_COLCHETES() { return getToken(MeuParser.ABRE_COLCHETES, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode FECHA_COLCHETES() { return getToken(MeuParser.FECHA_COLCHETES, 0); }
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ABRE_COLCHETES);
			setState(178);
			exp_aritmetica();
			setState(179);
			match(FECHA_COLCHETES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(MeuParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(MeuParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(MeuParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(MeuParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14942208L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_basico_ident);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REAL:
			case LOGICO:
			case INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode DEREFERENCIA() { return getToken(MeuParser.DEREFERENCIA, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEREFERENCIA) {
				{
				setState(187);
				match(DEREFERENCIA);
				}
			}

			setState(190);
			tipo_basico_ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(MeuParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(MeuParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(MeuParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(MeuParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MeuParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -9223266483738509288L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(MeuParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(MeuParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(REGISTRO);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(195);
				variavel();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(FIM_REGISTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(MeuParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(MeuParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(MeuParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(MeuParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaracao_global);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(PROCEDIMENTO);
				setState(204);
				match(IDENT);
				setState(205);
				match(ABRE_PARENTESES);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(206);
					parametros();
					}
				}

				setState(209);
				match(FECHA_PARENTESES);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1245184L) != 0) {
					{
					{
					setState(210);
					declaracao_local();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
					{
					{
					setState(216);
					cmd();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(FUNCAO);
				setState(224);
				match(IDENT);
				setState(225);
				match(ABRE_PARENTESES);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(226);
					parametros();
					}
				}

				setState(229);
				match(FECHA_PARENTESES);
				setState(230);
				match(DOIS_PONTOS);
				setState(231);
				tipo_estendido();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1245184L) != 0) {
					{
					{
					setState(232);
					declaracao_local();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
					{
					{
					setState(238);
					cmd();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(FIM_FUNCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MeuParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(248);
				match(VAR);
				}
			}

			setState(251);
			identificador();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(252);
				match(VIRGULA);
				setState(253);
				identificador();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(DOIS_PONTOS);
			setState(260);
			tipo_estendido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			parametro();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(263);
				match(VIRGULA);
				setState(264);
				parametro();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1245184L) != 0) {
				{
				{
				setState(270);
				declaracao_local();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
				{
				{
				setState(276);
				cmd();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmd);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				cmdRetorne();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(MeuParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(LEIA);
			setState(295);
			match(ABRE_PARENTESES);
			setState(296);
			expressao();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(297);
				match(VIRGULA);
				setState(298);
				expressao();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(MeuParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdEscreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ESCREVA);
			setState(307);
			match(ABRE_PARENTESES);
			setState(308);
			expressao();
			setState(309);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSeContext extends ParserRuleContext {
		public CmdContext cmd;
		public List<CmdContext> thenCmds = new ArrayList<CmdContext>();
		public List<CmdContext> elseCmds = new ArrayList<CmdContext>();
		public TerminalNode SE() { return getToken(MeuParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(MeuParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(MeuParser.FIM_SE, 0); }
		public TerminalNode SENAO() { return getToken(MeuParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(SE);
			setState(312);
			expressao();
			setState(313);
			match(ENTAO);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
				{
				{
				setState(314);
				((CmdSeContext)_localctx).cmd = cmd();
				((CmdSeContext)_localctx).thenCmds.add(((CmdSeContext)_localctx).cmd);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(320);
				match(SENAO);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
					{
					{
					setState(321);
					((CmdSeContext)_localctx).cmd = cmd();
					((CmdSeContext)_localctx).elseCmds.add(((CmdSeContext)_localctx).cmd);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(329);
			match(FIM_SE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdCasoContext extends ParserRuleContext {
		public CmdContext cmd;
		public List<CmdContext> elseCmds = new ArrayList<CmdContext>();
		public TerminalNode CASO() { return getToken(MeuParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(MeuParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(MeuParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(MeuParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(CASO);
			setState(332);
			exp_aritmetica();
			setState(333);
			match(SEJA);
			setState(334);
			selecao();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(335);
				match(SENAO);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
					{
					{
					setState(336);
					((CmdCasoContext)_localctx).cmd = cmd();
					((CmdCasoContext)_localctx).elseCmds.add(((CmdCasoContext)_localctx).cmd);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
			match(FIM_CASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MeuParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(MeuParser.ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(MeuParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(MeuParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(MeuParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(PARA);
			setState(347);
			match(IDENT);
			setState(348);
			match(ATRIBUICAO);
			setState(349);
			exp_aritmetica();
			setState(350);
			match(ATE);
			setState(351);
			exp_aritmetica();
			setState(352);
			match(FACA);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
				{
				{
				setState(353);
				cmd();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(FIM_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(MeuParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(MeuParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(MeuParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(ENQUANTO);
			setState(362);
			expressao();
			setState(363);
			match(FACA);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
				{
				{
				setState(364);
				cmd();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(FIM_ENQUANTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(MeuParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(MeuParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(FACA);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
				{
				{
				setState(373);
				cmd();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(ATE);
			setState(380);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(MeuParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DEREFERENCIA() { return getToken(MeuParser.DEREFERENCIA, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEREFERENCIA) {
				{
				setState(382);
				match(DEREFERENCIA);
				}
			}

			setState(385);
			identificador();
			setState(386);
			match(ATRIBUICAO);
			setState(387);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MeuParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(IDENT);
			setState(390);
			match(ABRE_PARENTESES);
			setState(391);
			expressao();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(392);
				match(VIRGULA);
				setState(393);
				expressao();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(MeuParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitCmdRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitCmdRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(RETORNE);
			setState(402);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM_INT || _la==SUBTRACAO) {
				{
				{
				setState(404);
				item_selecao();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(MeuParser.DOIS_PONTOS, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			constantes();
			setState(411);
			match(DOIS_PONTOS);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18155146819154688L) != 0) {
				{
				{
				setState(412);
				cmd();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			numero_intervalo();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(419);
				match(VIRGULA);
				setState(420);
				numero_intervalo();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(MeuParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(MeuParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode INTERVALO() { return getToken(MeuParser.INTERVALO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTRACAO) {
				{
				setState(426);
				op_unario();
				}
			}

			setState(429);
			match(NUM_INT);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVALO) {
				{
				setState(430);
				match(INTERVALO);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(431);
					op_unario();
					}
				}

				setState(434);
				match(NUM_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(MeuParser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(SUBTRACAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			termo();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					op1();
					setState(441);
					termo();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			fator();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIVISAO || _la==MULTIPLICACAO) {
				{
				{
				setState(449);
				op2();
				setState(450);
				fator();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			parcela();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODULO) {
				{
				{
				setState(458);
				op3();
				setState(459);
				parcela();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(MeuParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(MeuParser.SUBTRACAO, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(MeuParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(MeuParser.DIVISAO, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==DIVISAO || _la==MULTIPLICACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op3Context extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(MeuParser.MODULO, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(MODULO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parcela);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(472);
					op_unario();
					}
				}

				setState(475);
				parcela_unario();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				parcela_nao_unario();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DEREFERENCIA() { return getToken(MeuParser.DEREFERENCIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MeuParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MeuParser.VIRGULA, i);
		}
		public TerminalNode E_COMERCIAL() { return getToken(MeuParser.E_COMERCIAL, 0); }
		public TerminalNode NUM_INT() { return getToken(MeuParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(MeuParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parcela_unario);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case DEREFERENCIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEREFERENCIA) {
					{
					setState(479);
					match(DEREFERENCIA);
					}
				}

				setState(482);
				identificador();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABRE_PARENTESES) {
					{
					setState(483);
					match(ABRE_PARENTESES);
					setState(484);
					expressao();
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(485);
						match(VIRGULA);
						setState(486);
						expressao();
						}
						}
						setState(491);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(492);
					match(FECHA_PARENTESES);
					}
				}

				}
				break;
			case E_COMERCIAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(E_COMERCIAL);
				setState(497);
				identificador();
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(NUM_INT);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				match(NUM_REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(MeuParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parcela_nao_unario);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			exp_aritmetica();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 31267361914880L) != 0) {
				{
				setState(507);
				op_relacional();
				setState(508);
				exp_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(MeuParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(MeuParser.DIFERENTE, 0); }
		public TerminalNode MAIOR_OU_IGUAL_QUE() { return getToken(MeuParser.MAIOR_OU_IGUAL_QUE, 0); }
		public TerminalNode MENOR_OU_IGUAL_QUE() { return getToken(MeuParser.MENOR_OU_IGUAL_QUE, 0); }
		public TerminalNode MAIOR_QUE() { return getToken(MeuParser.MAIOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(MeuParser.MENOR_QUE, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 31267361914880L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			termo_logico();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(515);
				op_logico_1();
				setState(516);
				termo_logico();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			fator_logico();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(524);
				op_logico_2();
				setState(525);
				fator_logico();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NEGACAO() { return getToken(MeuParser.NEGACAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(532);
				match(NEGACAO);
				}
			}

			setState(535);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(MeuParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(MeuParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public TerminalNode ABRE_PARENTESES() { return getToken(MeuParser.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(MeuParser.FECHA_PARENTESES, 0); }
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parcela_logica);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(VERDADEIRO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(FALSO);
				}
				break;
			case NUM_REAL:
			case NUM_INT:
			case IDENT:
			case E_COMERCIAL:
			case SUBTRACAO:
			case DEREFERENCIA:
			case CADEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				exp_relacional();
				}
				break;
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				match(ABRE_PARENTESES);
				setState(541);
				expressao();
				setState(542);
				match(FECHA_PARENTESES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(MeuParser.OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_logico_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitOp_logico_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(OU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(MeuParser.E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuParserListener ) ((MeuParserListener)listener).exitOp_logico_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuParserVisitor ) return ((MeuParserVisitor<? extends T>)visitor).visitOp_logico_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u0227\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001r\b\u0001"+
		"\n\u0001\f\u0001u\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003~\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0091\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u0096\b\b\n\b\f\b\u0099\t\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0005\t\u00a0\b\t\n\t\f\t\u00a3\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t\f\t\u00ab\t\t\u0005\t\u00ad\b\t"+
		"\n\t\f\t\u00b0\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0003\f\u00ba\b\f\u0001\r\u0003\r\u00bd\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00c5\b"+
		"\u000f\n\u000f\f\u000f\u00c8\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d0\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00d4\b\u0010\n\u0010\f\u0010\u00d7\t\u0010\u0001"+
		"\u0010\u0005\u0010\u00da\b\u0010\n\u0010\f\u0010\u00dd\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e4\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ea\b\u0010"+
		"\n\u0010\f\u0010\u00ed\t\u0010\u0001\u0010\u0005\u0010\u00f0\b\u0010\n"+
		"\u0010\f\u0010\u00f3\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00f7"+
		"\b\u0010\u0001\u0011\u0003\u0011\u00fa\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00ff\b\u0011\n\u0011\f\u0011\u0102\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u010a\b\u0012\n\u0012\f\u0012\u010d\t\u0012\u0001\u0013\u0005\u0013"+
		"\u0110\b\u0013\n\u0013\f\u0013\u0113\t\u0013\u0001\u0013\u0005\u0013\u0116"+
		"\b\u0013\n\u0013\f\u0013\u0119\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0125\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u012c\b\u0015\n\u0015\f\u0015\u012f"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u013c\b\u0017\n\u0017\f\u0017\u013f\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0143\b\u0017\n\u0017\f\u0017\u0146\t\u0017\u0003\u0017\u0148"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0152\b\u0018\n\u0018\f\u0018"+
		"\u0155\t\u0018\u0003\u0018\u0157\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0163\b\u0019\n\u0019\f\u0019\u0166\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u016e\b\u001a\n\u001a\f\u001a\u0171\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u0177\b\u001b\n\u001b\f\u001b"+
		"\u017a\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c"+
		"\u0180\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u018b\b\u001d"+
		"\n\u001d\f\u001d\u018e\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0005\u001f\u0196\b\u001f\n\u001f\f\u001f"+
		"\u0199\t\u001f\u0001 \u0001 \u0001 \u0005 \u019e\b \n \f \u01a1\t \u0001"+
		"!\u0001!\u0001!\u0005!\u01a6\b!\n!\f!\u01a9\t!\u0001\"\u0003\"\u01ac\b"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01b1\b\"\u0001\"\u0003\"\u01b4\b\""+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u01bc\b$\n$\f$\u01bf"+
		"\t$\u0001%\u0001%\u0001%\u0001%\u0005%\u01c5\b%\n%\f%\u01c8\t%\u0001&"+
		"\u0001&\u0001&\u0001&\u0005&\u01ce\b&\n&\f&\u01d1\t&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001*\u0003*\u01da\b*\u0001*\u0001*\u0003*\u01de"+
		"\b*\u0001+\u0003+\u01e1\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u01e8"+
		"\b+\n+\f+\u01eb\t+\u0001+\u0001+\u0003+\u01ef\b+\u0001+\u0001+\u0001+"+
		"\u0001+\u0003+\u01f5\b+\u0001,\u0001,\u0003,\u01f9\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u01ff\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u0207\b/\n/\f/\u020a\t/\u00010\u00010\u00010\u00010\u00050\u0210\b0"+
		"\n0\f0\u0213\t0\u00011\u00031\u0216\b1\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u0221\b2\u00013\u00013\u00014\u0001"+
		"4\u00014\u0000\u00005\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfh\u0000\u0005\u0002\u0000\u0012\u0012\u0015\u0017\u0003\u0000\u0003"+
		"\u0004-.??\u0002\u00001133\u0001\u000045\u0002\u0000$&*,\u0236\u0000j"+
		"\u0001\u0000\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004x\u0001\u0000"+
		"\u0000\u0000\u0006}\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000\u0000"+
		"\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000\u0000\u0000"+
		"\u000e\u0090\u0001\u0000\u0000\u0000\u0010\u0092\u0001\u0000\u0000\u0000"+
		"\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000"+
		"\u0016\u00b5\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000\u0000\u0000"+
		"\u001a\u00bc\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000"+
		"\u001e\u00c2\u0001\u0000\u0000\u0000 \u00f6\u0001\u0000\u0000\u0000\""+
		"\u00f9\u0001\u0000\u0000\u0000$\u0106\u0001\u0000\u0000\u0000&\u0111\u0001"+
		"\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000*\u0126\u0001\u0000\u0000"+
		"\u0000,\u0132\u0001\u0000\u0000\u0000.\u0137\u0001\u0000\u0000\u00000"+
		"\u014b\u0001\u0000\u0000\u00002\u015a\u0001\u0000\u0000\u00004\u0169\u0001"+
		"\u0000\u0000\u00006\u0174\u0001\u0000\u0000\u00008\u017f\u0001\u0000\u0000"+
		"\u0000:\u0185\u0001\u0000\u0000\u0000<\u0191\u0001\u0000\u0000\u0000>"+
		"\u0197\u0001\u0000\u0000\u0000@\u019a\u0001\u0000\u0000\u0000B\u01a2\u0001"+
		"\u0000\u0000\u0000D\u01ab\u0001\u0000\u0000\u0000F\u01b5\u0001\u0000\u0000"+
		"\u0000H\u01b7\u0001\u0000\u0000\u0000J\u01c0\u0001\u0000\u0000\u0000L"+
		"\u01c9\u0001\u0000\u0000\u0000N\u01d2\u0001\u0000\u0000\u0000P\u01d4\u0001"+
		"\u0000\u0000\u0000R\u01d6\u0001\u0000\u0000\u0000T\u01dd\u0001\u0000\u0000"+
		"\u0000V\u01f4\u0001\u0000\u0000\u0000X\u01f8\u0001\u0000\u0000\u0000Z"+
		"\u01fa\u0001\u0000\u0000\u0000\\\u0200\u0001\u0000\u0000\u0000^\u0202"+
		"\u0001\u0000\u0000\u0000`\u020b\u0001\u0000\u0000\u0000b\u0215\u0001\u0000"+
		"\u0000\u0000d\u0220\u0001\u0000\u0000\u0000f\u0222\u0001\u0000\u0000\u0000"+
		"h\u0224\u0001\u0000\u0000\u0000jk\u0003\u0002\u0001\u0000kl\u0005\u0001"+
		"\u0000\u0000lm\u0003&\u0013\u0000mn\u0005\u0002\u0000\u0000no\u0005\u0000"+
		"\u0000\u0001o\u0001\u0001\u0000\u0000\u0000pr\u0003\u0004\u0002\u0000"+
		"qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u0003\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vy\u0003\u0006\u0003\u0000wy\u0003 \u0010\u0000xv\u0001"+
		"\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0005\u0001\u0000\u0000"+
		"\u0000z~\u0003\f\u0006\u0000{~\u0003\b\u0004\u0000|~\u0003\n\u0005\u0000"+
		"}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0014\u0000\u0000"+
		"\u0080\u0081\u0005/\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082\u0083"+
		"\u0003\u0016\u000b\u0000\u0083\u0084\u0005%\u0000\u0000\u0084\u0085\u0003"+
		"\u001c\u000e\u0000\u0085\t\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0011"+
		"\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\u0089\u0005=\u0000\u0000"+
		"\u0089\u008a\u0003\u000e\u0007\u0000\u008a\u000b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\u0010\u0000\u0000\u008c\u008d\u0003\u0010\b\u0000\u008d"+
		"\r\u0001\u0000\u0000\u0000\u008e\u0091\u0003\u001a\r\u0000\u008f\u0091"+
		"\u0003\u001e\u000f\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u000f\u0001\u0000\u0000\u0000\u0092\u0097"+
		"\u0003\u0012\t\u0000\u0093\u0094\u00058\u0000\u0000\u0094\u0096\u0003"+
		"\u0012\t\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005=\u0000\u0000\u009b\u009c\u0003\u000e\u0007"+
		"\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u00a1\u0005/\u0000\u0000"+
		"\u009e\u00a0\u0003\u0014\n\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00ae\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005;\u0000\u0000\u00a5\u00a9"+
		"\u0005/\u0000\u0000\u00a6\u00a8\u0003\u0014\n\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0013\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"9\u0000\u0000\u00b2\u00b3\u0003H$\u0000\u00b3\u00b4\u0005:\u0000\u0000"+
		"\u00b4\u0015\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000\u0000"+
		"\u00b6\u0017\u0001\u0000\u0000\u0000\u00b7\u00ba\u0003\u0016\u000b\u0000"+
		"\u00b8\u00ba\u0005/\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u00056\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0003\u0018\f\u0000\u00bf\u001b\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007"+
		"\u0001\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000\u00c2\u00c6\u0005"+
		"\u0006\u0000\u0000\u00c3\u00c5\u0003\u0010\b\u0000\u00c4\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0007"+
		"\u0000\u0000\u00ca\u001f\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\n\u0000"+
		"\u0000\u00cc\u00cd\u0005/\u0000\u0000\u00cd\u00cf\u0005>\u0000\u0000\u00ce"+
		"\u00d0\u0003$\u0012\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d5"+
		"\u00057\u0000\u0000\u00d2\u00d4\u0003\u0006\u0003\u0000\u00d3\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00db\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00da\u0003"+
		"(\u0014\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00f7\u0005\u000b\u0000\u0000\u00df\u00e0\u0005\u000e"+
		"\u0000\u0000\u00e0\u00e1\u0005/\u0000\u0000\u00e1\u00e3\u0005>\u0000\u0000"+
		"\u00e2\u00e4\u0003$\u0012\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u00057\u0000\u0000\u00e6\u00e7\u0005=\u0000\u0000\u00e7\u00eb\u0003"+
		"\u001a\r\u0000\u00e8\u00ea\u0003\u0006\u0003\u0000\u00e9\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003(\u0014"+
		"\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005\u000f\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00cb\u0001\u0000\u0000\u0000\u00f6\u00df\u0001\u0000\u0000"+
		"\u0000\u00f7!\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005\u0013\u0000\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0100\u0003\u0012\t\u0000\u00fc"+
		"\u00fd\u00058\u0000\u0000\u00fd\u00ff\u0003\u0012\t\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0005=\u0000\u0000\u0104\u0105\u0003\u001a\r\u0000\u0105#\u0001\u0000"+
		"\u0000\u0000\u0106\u010b\u0003\"\u0011\u0000\u0107\u0108\u00058\u0000"+
		"\u0000\u0108\u010a\u0003\"\u0011\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
		"\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c%\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0003\u0006\u0003\u0000\u010f"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0117\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114"+
		"\u0116\u0003(\u0014\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\'\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u011a\u0125\u0003*\u0015\u0000\u011b\u0125\u0003,\u0016"+
		"\u0000\u011c\u0125\u0003.\u0017\u0000\u011d\u0125\u00030\u0018\u0000\u011e"+
		"\u0125\u00032\u0019\u0000\u011f\u0125\u00034\u001a\u0000\u0120\u0125\u0003"+
		"6\u001b\u0000\u0121\u0125\u00038\u001c\u0000\u0122\u0125\u0003:\u001d"+
		"\u0000\u0123\u0125\u0003<\u001e\u0000\u0124\u011a\u0001\u0000\u0000\u0000"+
		"\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000\u0000\u0000"+
		"\u0124\u011d\u0001\u0000\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000"+
		"\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000\u0000"+
		"\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0125)\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\b\u0000\u0000\u0127\u0128\u0005>\u0000\u0000\u0128\u012d"+
		"\u0003^/\u0000\u0129\u012a\u00058\u0000\u0000\u012a\u012c\u0003^/\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u00057\u0000\u0000\u0131+\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0005\t\u0000\u0000\u0133\u0134\u0005>\u0000\u0000\u0134\u0135\u0003"+
		"^/\u0000\u0135\u0136\u00057\u0000\u0000\u0136-\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0005\u001a\u0000\u0000\u0138\u0139\u0003^/\u0000\u0139\u013d"+
		"\u0005\u001d\u0000\u0000\u013a\u013c\u0003(\u0014\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0147\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0144\u0005"+
		"\u001b\u0000\u0000\u0141\u0143\u0003(\u0014\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0140\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0005\u001c\u0000\u0000\u014a/\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0005\u0018\u0000\u0000\u014c\u014d\u0003H$\u0000\u014d"+
		"\u014e\u0005\u001e\u0000\u0000\u014e\u0156\u0003>\u001f\u0000\u014f\u0153"+
		"\u0005\u001b\u0000\u0000\u0150\u0152\u0003(\u0014\u0000\u0151\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0157\u0001"+
		"\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u014f\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0005\u0019\u0000\u0000\u01591\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005!\u0000\u0000\u015b\u015c\u0005/\u0000\u0000"+
		"\u015c\u015d\u0005)\u0000\u0000\u015d\u015e\u0003H$\u0000\u015e\u015f"+
		"\u0005#\u0000\u0000\u015f\u0160\u0003H$\u0000\u0160\u0164\u0005\r\u0000"+
		"\u0000\u0161\u0163\u0003(\u0014\u0000\u0162\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0005\"\u0000\u0000\u0168"+
		"3\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u001f\u0000\u0000\u016a\u016b"+
		"\u0003^/\u0000\u016b\u016f\u0005\r\u0000\u0000\u016c\u016e\u0003(\u0014"+
		"\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0005 \u0000\u0000\u01735\u0001\u0000\u0000\u0000\u0174"+
		"\u0178\u0005\r\u0000\u0000\u0175\u0177\u0003(\u0014\u0000\u0176\u0175"+
		"\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b"+
		"\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0005#\u0000\u0000\u017c\u017d\u0003^/\u0000\u017d7\u0001\u0000\u0000"+
		"\u0000\u017e\u0180\u00056\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0003\u0012\t\u0000\u0182\u0183\u0005)\u0000\u0000\u0183"+
		"\u0184\u0003^/\u0000\u01849\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"/\u0000\u0000\u0186\u0187\u0005>\u0000\u0000\u0187\u018c\u0003^/\u0000"+
		"\u0188\u0189\u00058\u0000\u0000\u0189\u018b\u0003^/\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f"+
		"\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u00057\u0000\u0000\u0190;\u0001\u0000\u0000\u0000\u0191\u0192\u0005\f"+
		"\u0000\u0000\u0192\u0193\u0003^/\u0000\u0193=\u0001\u0000\u0000\u0000"+
		"\u0194\u0196\u0003@ \u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198?\u0001\u0000\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0003B!\u0000\u019b\u019f\u0005=\u0000"+
		"\u0000\u019c\u019e\u0003(\u0014\u0000\u019d\u019c\u0001\u0000\u0000\u0000"+
		"\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0A\u0001\u0000\u0000\u0000\u01a1"+
		"\u019f\u0001\u0000\u0000\u0000\u01a2\u01a7\u0003D\"\u0000\u01a3\u01a4"+
		"\u00058\u0000\u0000\u01a4\u01a6\u0003D\"\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8C\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ac\u0003F#\u0000\u01ab"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad\u01b3\u0005.\u0000\u0000\u01ae\u01b0"+
		"\u0005<\u0000\u0000\u01af\u01b1\u0003F#\u0000\u01b0\u01af\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b4\u0005.\u0000\u0000\u01b3\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4E\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u00053\u0000\u0000\u01b6G\u0001\u0000\u0000\u0000\u01b7\u01bd"+
		"\u0003J%\u0000\u01b8\u01b9\u0003N\'\u0000\u01b9\u01ba\u0003J%\u0000\u01ba"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01beI\u0001\u0000\u0000\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c6\u0003L&\u0000\u01c1\u01c2\u0003P"+
		"(\u0000\u01c2\u01c3\u0003L&\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c1\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7K\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9"+
		"\u01cf\u0003T*\u0000\u01ca\u01cb\u0003R)\u0000\u01cb\u01cc\u0003T*\u0000"+
		"\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0M\u0001\u0000\u0000\u0000\u01d1"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d3\u0007\u0002\u0000\u0000\u01d3"+
		"O\u0001\u0000\u0000\u0000\u01d4\u01d5\u0007\u0003\u0000\u0000\u01d5Q\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u00052\u0000\u0000\u01d7S\u0001\u0000\u0000"+
		"\u0000\u01d8\u01da\u0003F#\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"\u01de\u0003V+\u0000\u01dc\u01de\u0003X,\u0000\u01dd\u01d9\u0001\u0000"+
		"\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01deU\u0001\u0000\u0000"+
		"\u0000\u01df\u01e1\u00056\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e2\u01ee\u0003\u0012\t\u0000\u01e3\u01e4\u0005>\u0000\u0000\u01e4"+
		"\u01e9\u0003^/\u0000\u01e5\u01e6\u00058\u0000\u0000\u01e6\u01e8\u0003"+
		"^/\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u00057\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ee\u01e3\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f5\u0001\u0000\u0000\u0000\u01f0\u01f1\u00050\u0000\u0000\u01f1"+
		"\u01f5\u0003\u0012\t\u0000\u01f2\u01f5\u0005.\u0000\u0000\u01f3\u01f5"+
		"\u0005-\u0000\u0000\u01f4\u01e0\u0001\u0000\u0000\u0000\u01f4\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f5W\u0001\u0000\u0000\u0000\u01f6\u01f9\u0003\u0012"+
		"\t\u0000\u01f7\u01f9\u0005?\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9Y\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fe\u0003H$\u0000\u01fb\u01fc\u0003\\.\u0000\u01fc\u01fd\u0003"+
		"H$\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff[\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0007\u0004\u0000\u0000\u0201]\u0001\u0000\u0000\u0000\u0202"+
		"\u0208\u0003`0\u0000\u0203\u0204\u0003f3\u0000\u0204\u0205\u0003`0\u0000"+
		"\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0203\u0001\u0000\u0000\u0000"+
		"\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000"+
		"\u0208\u0209\u0001\u0000\u0000\u0000\u0209_\u0001\u0000\u0000\u0000\u020a"+
		"\u0208\u0001\u0000\u0000\u0000\u020b\u0211\u0003b1\u0000\u020c\u020d\u0003"+
		"h4\u0000\u020d\u020e\u0003b1\u0000\u020e\u0210\u0001\u0000\u0000\u0000"+
		"\u020f\u020c\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212a\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214"+
		"\u0216\u0005\u0005\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u0218\u0003d2\u0000\u0218c\u0001\u0000\u0000\u0000\u0219\u0221\u0005"+
		"\u0004\u0000\u0000\u021a\u0221\u0005\u0003\u0000\u0000\u021b\u0221\u0003"+
		"Z-\u0000\u021c\u021d\u0005>\u0000\u0000\u021d\u021e\u0003^/\u0000\u021e"+
		"\u021f\u00057\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u0219"+
		"\u0001\u0000\u0000\u0000\u0220\u021a\u0001\u0000\u0000\u0000\u0220\u021b"+
		"\u0001\u0000\u0000\u0000\u0220\u021c\u0001\u0000\u0000\u0000\u0221e\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0005(\u0000\u0000\u0223g\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0005\'\u0000\u0000\u0225i\u0001\u0000\u0000\u0000"+
		"8sx}\u0090\u0097\u00a1\u00a9\u00ae\u00b9\u00bc\u00c6\u00cf\u00d5\u00db"+
		"\u00e3\u00eb\u00f1\u00f6\u00f9\u0100\u010b\u0111\u0117\u0124\u012d\u013d"+
		"\u0144\u0147\u0153\u0156\u0164\u016f\u0178\u017f\u018c\u0197\u019f\u01a7"+
		"\u01ab\u01b0\u01b3\u01bd\u01c6\u01cf\u01d9\u01dd\u01e0\u01e9\u01ee\u01f4"+
		"\u01f8\u01fe\u0208\u0211\u0215\u0220";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}