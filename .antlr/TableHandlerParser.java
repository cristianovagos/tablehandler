// Generated from /home/cristiano/Área de Trabalho/LFA/Pratica/proj/lfa-2016-2017-t2-g3/TableHandler.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TableHandlerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, NULL=65, BOOLEAN=66, 
		INTEGER=67, ID=68, DELIMITER=69, STRING=70, SL_COMMENT=71, ML_COMMENT=72, 
		WS=73;
	public static final int
		RULE_main = 0, RULE_stat = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_print = 4, RULE_condition = 5, RULE_ifStatement = 6, RULE_elseIfList = 7, 
		RULE_elseStatement = 8, RULE_conditionBlock = 9, RULE_expr = 10, RULE_numExpr = 11, 
		RULE_boolExpr = 12, RULE_compareExpr = 13, RULE_tableExpr = 14, RULE_newTable = 15, 
		RULE_addRow = 16, RULE_addRowFrom = 17, RULE_remRow = 18, RULE_getValue = 19, 
		RULE_setValue = 20, RULE_clearRow = 21, RULE_removeRow = 22, RULE_addCol = 23, 
		RULE_addColFrom = 24, RULE_remCol = 25, RULE_clearField = 26, RULE_numColumns = 27, 
		RULE_numRows = 28, RULE_uniqueCol = 29, RULE_getCol = 30, RULE_getRow = 31, 
		RULE_getHeaderIndex = 32, RULE_subTableCol = 33, RULE_subTableCol2 = 34, 
		RULE_subTableRow = 35, RULE_subTableRow2 = 36, RULE_add = 37, RULE_sub = 38, 
		RULE_sort = 39, RULE_equals = 40, RULE_export = 41, RULE_printTable = 42, 
		RULE_printFirst = 43, RULE_printLast = 44, RULE_csvLine = 45, RULE_file = 46, 
		RULE_stringExpr = 47, RULE_dataType = 48;
	public static final String[] ruleNames = {
		"main", "stat", "declaration", "assignment", "print", "condition", "ifStatement", 
		"elseIfList", "elseStatement", "conditionBlock", "expr", "numExpr", "boolExpr", 
		"compareExpr", "tableExpr", "newTable", "addRow", "addRowFrom", "remRow", 
		"getValue", "setValue", "clearRow", "removeRow", "addCol", "addColFrom", 
		"remCol", "clearField", "numColumns", "numRows", "uniqueCol", "getCol", 
		"getRow", "getHeaderIndex", "subTableCol", "subTableCol2", "subTableRow", 
		"subTableRow2", "add", "sub", "sort", "equals", "export", "printTable", 
		"printFirst", "printLast", "csvLine", "file", "stringExpr", "dataType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'print'", "'if'", "'('", "')'", "'else if'", "'else'", "'{'", 
		"'}'", "'+'", "'-'", "'*'", "'/'", "'||'", "'&&'", "'=='", "'!='", "'<'", 
		"'>'", "'<='", "'>='", "'table('", "'read'", "'to'", "'add row '", "'at'", 
		"'remove row at'", "'from'", "'get value('", "','", "') from'", "'insert into'", 
		"'value='", "'at cell('", "'clear row at'", "'add column'", "'remove column at'", 
		"'clear field('", "'get col size from'", "'get row size from'", "'get unique column from'", 
		"'get column from'", "'header ='", "'get row from'", "'get index from'", 
		"'of value ='", "'col-subtable from'", "'start='", "'end='", "'row-subtable from'", 
		"'add'", "'with'", "'subtract'", "'sort'", "'equals'", "'export'", "'print first'", 
		"'lines of'", "'print last'", "'.csv'", "'int'", "'table'", "'boolean'", 
		"'word'", "'null'", null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NULL", "BOOLEAN", "INTEGER", "ID", "DELIMITER", 
		"STRING", "SL_COMMENT", "ML_COMMENT", "WS"
	};
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
	public String getGrammarFileName() { return "TableHandler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TableHandlerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TableHandlerParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__21) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==T__63 || _la==ID) {
				{
				{
				setState(98);
				stat();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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

	public static class StatContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TableHandlerParser.DELIMITER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__60:
			case T__61:
			case T__62:
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				declaration();
				setState(107);
				match(DELIMITER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				assignment();
				setState(110);
				match(DELIMITER);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				print();
				setState(113);
				match(DELIMITER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				condition();
				setState(116);
				match(DELIMITER);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				tableExpr();
				setState(119);
				match(DELIMITER);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DataTypeContext t;
		public Token var;
		public ExprContext v;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((DeclarationContext)_localctx).t = dataType();
			setState(124);
			((DeclarationContext)_localctx).var = match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(125);
				match(T__0);
				setState(126);
				((DeclarationContext)_localctx).v = expr();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token var;
		public ExprContext e;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((AssignmentContext)_localctx).var = match(ID);
			setState(130);
			match(T__0);
			setState(131);
			((AssignmentContext)_localctx).e = expr();
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__1);
			setState(134);
			((PrintContext)_localctx).e1 = expr();
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

	public static class ConditionContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<ElseIfListContext> elseIfList() {
			return getRuleContexts(ElseIfListContext.class);
		}
		public ElseIfListContext elseIfList(int i) {
			return getRuleContext(ElseIfListContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			ifStatement();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(137);
				elseIfList();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(143);
				elseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public BoolExprContext b;
		public ConditionBlockContext conditionBlock() {
			return getRuleContext(ConditionBlockContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__2);
			setState(147);
			match(T__3);
			setState(148);
			((IfStatementContext)_localctx).b = boolExpr(0);
			setState(149);
			match(T__4);
			setState(150);
			conditionBlock();
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

	public static class ElseIfListContext extends ParserRuleContext {
		public BoolExprContext b;
		public ConditionBlockContext conditionBlock() {
			return getRuleContext(ConditionBlockContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ElseIfListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfList; }
	}

	public final ElseIfListContext elseIfList() throws RecognitionException {
		ElseIfListContext _localctx = new ElseIfListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseIfList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__5);
			setState(153);
			match(T__3);
			setState(154);
			((ElseIfListContext)_localctx).b = boolExpr(0);
			setState(155);
			match(T__4);
			setState(156);
			conditionBlock();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public ConditionBlockContext conditionBlock() {
			return getRuleContext(ConditionBlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__6);
			setState(159);
			conditionBlock();
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

	public static class ConditionBlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__7);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__21) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==T__63 || _la==ID) {
				{
				{
				setState(162);
				stat();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__8);
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

	public static class ExprContext extends ParserRuleContext {
		public NumExprContext n;
		public BoolExprContext b;
		public StringExprContext s;
		public TableExprContext t;
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TableExprContext tableExpr() {
			return getRuleContext(TableExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((ExprContext)_localctx).n = numExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((ExprContext)_localctx).b = boolExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				((ExprContext)_localctx).s = stringExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				((ExprContext)_localctx).t = tableExpr();
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

	public static class NumExprContext extends ParserRuleContext {
		public NumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpr; }
	 
		public NumExprContext() { }
		public void copyFrom(NumExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends NumExprContext {
		public NumExprContext e1;
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ParContext(NumExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmContext extends NumExprContext {
		public NumExprContext e1;
		public Token op;
		public NumExprContext e2;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public ArithmContext(NumExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends NumExprContext {
		public Token v;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public VarContext(NumExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends NumExprContext {
		public Token e3;
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public IntContext(NumExprContext ctx) { copyFrom(ctx); }
	}

	public final NumExprContext numExpr() throws RecognitionException {
		return numExpr(0);
	}

	private NumExprContext numExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumExprContext _localctx = new NumExprContext(_ctx, _parentState);
		NumExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_numExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				match(T__3);
				setState(178);
				((ParContext)_localctx).e1 = numExpr(0);
				setState(179);
				match(T__4);
				}
				break;
			case INTEGER:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				((IntContext)_localctx).e3 = match(INTEGER);
				}
				break;
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				((VarContext)_localctx).v = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmContext(new NumExprContext(_parentctx, _parentState));
					((ArithmContext)_localctx).e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
					setState(185);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(186);
					((ArithmContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						((ArithmContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(187);
					((ArithmContext)_localctx).e2 = numExpr(5);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExprRelOpContext extends BoolExprContext {
		public BoolExprContext e1;
		public Token op;
		public BoolExprContext e2;
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BoolExprRelOpContext(BoolExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolParContext extends BoolExprContext {
		public BoolExprContext e1;
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolParContext(BoolExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolContext extends BoolExprContext {
		public TerminalNode BOOLEAN() { return getToken(TableHandlerParser.BOOLEAN, 0); }
		public BoolContext(BoolExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolVarContext extends BoolExprContext {
		public Token v;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public BoolVarContext(BoolExprContext ctx) { copyFrom(ctx); }
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				match(T__3);
				setState(195);
				((BoolParContext)_localctx).e1 = boolExpr(0);
				setState(196);
				match(T__4);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(BOOLEAN);
				}
				break;
			case ID:
				{
				_localctx = new BoolVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				((BoolVarContext)_localctx).v = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprRelOpContext(new BoolExprContext(_parentctx, _parentState));
					((BoolExprRelOpContext)_localctx).e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(202);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(203);
					((BoolExprRelOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
						((BoolExprRelOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(204);
					((BoolExprRelOpContext)_localctx).e2 = boolExpr(5);
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompareExprContext extends ParserRuleContext {
		public NumExprContext e1;
		public Token op;
		public NumExprContext e2;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compareExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((CompareExprContext)_localctx).e1 = numExpr(0);
			setState(211);
			((CompareExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
				((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			((CompareExprContext)_localctx).e2 = numExpr(0);
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

	public static class TableExprContext extends ParserRuleContext {
		public NewTableContext n;
		public AddRowContext a1;
		public AddRowFromContext a2;
		public RemRowContext r1;
		public GetValueContext v;
		public SetValueContext s;
		public ClearRowContext c;
		public RemoveRowContext r2;
		public AddColContext a3;
		public AddColFromContext a4;
		public RemColContext r3;
		public ClearFieldContext c2;
		public NumColumnsContext x1;
		public NumRowsContext x2;
		public UniqueColContext u1;
		public GetColContext g1;
		public GetRowContext g2;
		public GetHeaderIndexContext g3;
		public SubTableColContext s2;
		public SubTableCol2Context s3;
		public SubTableRowContext s4;
		public SubTableRow2Context s5;
		public AddContext ad;
		public SubContext su;
		public SortContext sr;
		public EqualsContext eq;
		public ExportContext ex;
		public PrintTableContext pr;
		public PrintFirstContext prf;
		public PrintLastContext prl;
		public NewTableContext newTable() {
			return getRuleContext(NewTableContext.class,0);
		}
		public AddRowContext addRow() {
			return getRuleContext(AddRowContext.class,0);
		}
		public AddRowFromContext addRowFrom() {
			return getRuleContext(AddRowFromContext.class,0);
		}
		public RemRowContext remRow() {
			return getRuleContext(RemRowContext.class,0);
		}
		public GetValueContext getValue() {
			return getRuleContext(GetValueContext.class,0);
		}
		public SetValueContext setValue() {
			return getRuleContext(SetValueContext.class,0);
		}
		public ClearRowContext clearRow() {
			return getRuleContext(ClearRowContext.class,0);
		}
		public RemoveRowContext removeRow() {
			return getRuleContext(RemoveRowContext.class,0);
		}
		public AddColContext addCol() {
			return getRuleContext(AddColContext.class,0);
		}
		public AddColFromContext addColFrom() {
			return getRuleContext(AddColFromContext.class,0);
		}
		public RemColContext remCol() {
			return getRuleContext(RemColContext.class,0);
		}
		public ClearFieldContext clearField() {
			return getRuleContext(ClearFieldContext.class,0);
		}
		public NumColumnsContext numColumns() {
			return getRuleContext(NumColumnsContext.class,0);
		}
		public NumRowsContext numRows() {
			return getRuleContext(NumRowsContext.class,0);
		}
		public UniqueColContext uniqueCol() {
			return getRuleContext(UniqueColContext.class,0);
		}
		public GetColContext getCol() {
			return getRuleContext(GetColContext.class,0);
		}
		public GetRowContext getRow() {
			return getRuleContext(GetRowContext.class,0);
		}
		public GetHeaderIndexContext getHeaderIndex() {
			return getRuleContext(GetHeaderIndexContext.class,0);
		}
		public SubTableColContext subTableCol() {
			return getRuleContext(SubTableColContext.class,0);
		}
		public SubTableCol2Context subTableCol2() {
			return getRuleContext(SubTableCol2Context.class,0);
		}
		public SubTableRowContext subTableRow() {
			return getRuleContext(SubTableRowContext.class,0);
		}
		public SubTableRow2Context subTableRow2() {
			return getRuleContext(SubTableRow2Context.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public PrintTableContext printTable() {
			return getRuleContext(PrintTableContext.class,0);
		}
		public PrintFirstContext printFirst() {
			return getRuleContext(PrintFirstContext.class,0);
		}
		public PrintLastContext printLast() {
			return getRuleContext(PrintLastContext.class,0);
		}
		public TableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpr; }
	}

	public final TableExprContext tableExpr() throws RecognitionException {
		TableExprContext _localctx = new TableExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__21);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(215);
				((TableExprContext)_localctx).n = newTable();
				}
				break;
			case 2:
				{
				setState(216);
				((TableExprContext)_localctx).a1 = addRow();
				}
				break;
			case 3:
				{
				setState(217);
				((TableExprContext)_localctx).a2 = addRowFrom();
				}
				break;
			case 4:
				{
				setState(218);
				((TableExprContext)_localctx).r1 = remRow();
				}
				break;
			case 5:
				{
				setState(219);
				((TableExprContext)_localctx).v = getValue();
				}
				break;
			case 6:
				{
				setState(220);
				((TableExprContext)_localctx).s = setValue();
				}
				break;
			case 7:
				{
				setState(221);
				((TableExprContext)_localctx).c = clearRow();
				}
				break;
			case 8:
				{
				setState(222);
				((TableExprContext)_localctx).r2 = removeRow();
				}
				break;
			case 9:
				{
				setState(223);
				((TableExprContext)_localctx).a3 = addCol();
				}
				break;
			case 10:
				{
				setState(224);
				((TableExprContext)_localctx).a4 = addColFrom();
				}
				break;
			case 11:
				{
				setState(225);
				((TableExprContext)_localctx).r3 = remCol();
				}
				break;
			case 12:
				{
				setState(226);
				((TableExprContext)_localctx).c2 = clearField();
				}
				break;
			case 13:
				{
				setState(227);
				((TableExprContext)_localctx).x1 = numColumns();
				}
				break;
			case 14:
				{
				setState(228);
				((TableExprContext)_localctx).x2 = numRows();
				}
				break;
			case 15:
				{
				setState(229);
				((TableExprContext)_localctx).u1 = uniqueCol();
				}
				break;
			case 16:
				{
				setState(230);
				((TableExprContext)_localctx).g1 = getCol();
				}
				break;
			case 17:
				{
				setState(231);
				((TableExprContext)_localctx).g2 = getRow();
				}
				break;
			case 18:
				{
				setState(232);
				((TableExprContext)_localctx).g3 = getHeaderIndex();
				}
				break;
			case 19:
				{
				setState(233);
				((TableExprContext)_localctx).s2 = subTableCol();
				}
				break;
			case 20:
				{
				setState(234);
				((TableExprContext)_localctx).s3 = subTableCol2();
				}
				break;
			case 21:
				{
				setState(235);
				((TableExprContext)_localctx).s4 = subTableRow();
				}
				break;
			case 22:
				{
				setState(236);
				((TableExprContext)_localctx).s5 = subTableRow2();
				}
				break;
			case 23:
				{
				setState(237);
				((TableExprContext)_localctx).ad = add();
				}
				break;
			case 24:
				{
				setState(238);
				((TableExprContext)_localctx).su = sub();
				}
				break;
			case 25:
				{
				setState(239);
				((TableExprContext)_localctx).sr = sort();
				}
				break;
			case 26:
				{
				setState(240);
				((TableExprContext)_localctx).eq = equals();
				}
				break;
			case 27:
				{
				setState(241);
				((TableExprContext)_localctx).ex = export();
				}
				break;
			case 28:
				{
				setState(242);
				((TableExprContext)_localctx).pr = printTable();
				}
				break;
			case 29:
				{
				setState(243);
				((TableExprContext)_localctx).prf = printFirst();
				}
				break;
			case 30:
				{
				setState(244);
				((TableExprContext)_localctx).prl = printLast();
				}
				break;
			}
			setState(247);
			match(T__4);
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

	public static class NewTableContext extends ParserRuleContext {
		public FileContext f;
		public Token v;
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public NewTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTable; }
	}

	public final NewTableContext newTable() throws RecognitionException {
		NewTableContext _localctx = new NewTableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_newTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__22);
			setState(250);
			((NewTableContext)_localctx).f = file();
			setState(251);
			match(T__23);
			setState(252);
			((NewTableContext)_localctx).v = match(ID);
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

	public static class AddRowContext extends ParserRuleContext {
		public CsvLineContext r;
		public Token v;
		public CsvLineContext csvLine() {
			return getRuleContext(CsvLineContext.class,0);
		}
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public AddRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addRow; }
	}

	public final AddRowContext addRow() throws RecognitionException {
		AddRowContext _localctx = new AddRowContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__24);
			setState(255);
			((AddRowContext)_localctx).r = csvLine();
			setState(256);
			match(T__23);
			setState(257);
			((AddRowContext)_localctx).v = match(ID);
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

	public static class AddRowFromContext extends ParserRuleContext {
		public CsvLineContext r;
		public Token i;
		public Token v;
		public CsvLineContext csvLine() {
			return getRuleContext(CsvLineContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public AddRowFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addRowFrom; }
	}

	public final AddRowFromContext addRowFrom() throws RecognitionException {
		AddRowFromContext _localctx = new AddRowFromContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addRowFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__24);
			setState(260);
			((AddRowFromContext)_localctx).r = csvLine();
			setState(261);
			match(T__25);
			setState(262);
			((AddRowFromContext)_localctx).i = match(INTEGER);
			setState(263);
			match(T__23);
			setState(264);
			((AddRowFromContext)_localctx).v = match(ID);
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

	public static class RemRowContext extends ParserRuleContext {
		public Token i;
		public Token v;
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public RemRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remRow; }
	}

	public final RemRowContext remRow() throws RecognitionException {
		RemRowContext _localctx = new RemRowContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_remRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__26);
			setState(267);
			((RemRowContext)_localctx).i = match(INTEGER);
			setState(268);
			match(T__27);
			setState(269);
			((RemRowContext)_localctx).v = match(ID);
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

	public static class GetValueContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public Token v;
		public List<TerminalNode> INTEGER() { return getTokens(TableHandlerParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(TableHandlerParser.INTEGER, i);
		}
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public GetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getValue; }
	}

	public final GetValueContext getValue() throws RecognitionException {
		GetValueContext _localctx = new GetValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_getValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__28);
			setState(272);
			((GetValueContext)_localctx).x = match(INTEGER);
			setState(273);
			match(T__29);
			setState(274);
			((GetValueContext)_localctx).y = match(INTEGER);
			setState(275);
			match(T__30);
			setState(276);
			((GetValueContext)_localctx).v = match(ID);
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

	public static class SetValueContext extends ParserRuleContext {
		public Token v;
		public ExprContext s1;
		public Token x;
		public Token y;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(TableHandlerParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(TableHandlerParser.INTEGER, i);
		}
		public SetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setValue; }
	}

	public final SetValueContext setValue() throws RecognitionException {
		SetValueContext _localctx = new SetValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_setValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__31);
			setState(279);
			((SetValueContext)_localctx).v = match(ID);
			setState(280);
			match(T__32);
			setState(281);
			((SetValueContext)_localctx).s1 = expr();
			setState(282);
			match(T__33);
			setState(283);
			((SetValueContext)_localctx).x = match(INTEGER);
			setState(284);
			match(T__29);
			setState(285);
			((SetValueContext)_localctx).y = match(INTEGER);
			setState(286);
			match(T__4);
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

	public static class ClearRowContext extends ParserRuleContext {
		public Token i;
		public Token v;
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public ClearRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearRow; }
	}

	public final ClearRowContext clearRow() throws RecognitionException {
		ClearRowContext _localctx = new ClearRowContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_clearRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__34);
			setState(289);
			((ClearRowContext)_localctx).i = match(INTEGER);
			setState(290);
			match(T__27);
			setState(291);
			((ClearRowContext)_localctx).v = match(ID);
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

	public static class RemoveRowContext extends ParserRuleContext {
		public Token i;
		public Token v;
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public RemoveRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeRow; }
	}

	public final RemoveRowContext removeRow() throws RecognitionException {
		RemoveRowContext _localctx = new RemoveRowContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_removeRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__26);
			setState(294);
			((RemoveRowContext)_localctx).i = match(INTEGER);
			setState(295);
			match(T__27);
			setState(296);
			((RemoveRowContext)_localctx).v = match(ID);
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

	public static class AddColContext extends ParserRuleContext {
		public CsvLineContext c;
		public Token v;
		public CsvLineContext csvLine() {
			return getRuleContext(CsvLineContext.class,0);
		}
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public AddColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addCol; }
	}

	public final AddColContext addCol() throws RecognitionException {
		AddColContext _localctx = new AddColContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__35);
			setState(299);
			((AddColContext)_localctx).c = csvLine();
			setState(300);
			match(T__23);
			setState(301);
			((AddColContext)_localctx).v = match(ID);
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

	public static class AddColFromContext extends ParserRuleContext {
		public CsvLineContext c;
		public Token i;
		public Token v;
		public CsvLineContext csvLine() {
			return getRuleContext(CsvLineContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public AddColFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColFrom; }
	}

	public final AddColFromContext addColFrom() throws RecognitionException {
		AddColFromContext _localctx = new AddColFromContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_addColFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__35);
			setState(304);
			((AddColFromContext)_localctx).c = csvLine();
			setState(305);
			match(T__25);
			setState(306);
			((AddColFromContext)_localctx).i = match(INTEGER);
			setState(307);
			match(T__23);
			setState(308);
			((AddColFromContext)_localctx).v = match(ID);
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

	public static class RemColContext extends ParserRuleContext {
		public Token i;
		public Token v;
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public RemColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remCol; }
	}

	public final RemColContext remCol() throws RecognitionException {
		RemColContext _localctx = new RemColContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_remCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__36);
			setState(311);
			((RemColContext)_localctx).i = match(INTEGER);
			setState(312);
			match(T__27);
			setState(313);
			((RemColContext)_localctx).v = match(ID);
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

	public static class ClearFieldContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public Token v;
		public List<TerminalNode> INTEGER() { return getTokens(TableHandlerParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(TableHandlerParser.INTEGER, i);
		}
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public ClearFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearField; }
	}

	public final ClearFieldContext clearField() throws RecognitionException {
		ClearFieldContext _localctx = new ClearFieldContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_clearField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__37);
			setState(316);
			((ClearFieldContext)_localctx).x = match(INTEGER);
			setState(317);
			match(T__29);
			setState(318);
			((ClearFieldContext)_localctx).y = match(INTEGER);
			setState(319);
			match(T__4);
			setState(320);
			match(T__27);
			setState(321);
			((ClearFieldContext)_localctx).v = match(ID);
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

	public static class NumColumnsContext extends ParserRuleContext {
		public Token v;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public NumColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numColumns; }
	}

	public final NumColumnsContext numColumns() throws RecognitionException {
		NumColumnsContext _localctx = new NumColumnsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__38);
			setState(324);
			((NumColumnsContext)_localctx).v = match(ID);
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

	public static class NumRowsContext extends ParserRuleContext {
		public Token v;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public NumRowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numRows; }
	}

	public final NumRowsContext numRows() throws RecognitionException {
		NumRowsContext _localctx = new NumRowsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__39);
			setState(327);
			((NumRowsContext)_localctx).v = match(ID);
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

	public static class UniqueColContext extends ParserRuleContext {
		public Token v;
		public Token i;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public UniqueColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueCol; }
	}

	public final UniqueColContext uniqueCol() throws RecognitionException {
		UniqueColContext _localctx = new UniqueColContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_uniqueCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__40);
			setState(330);
			((UniqueColContext)_localctx).v = match(ID);
			setState(331);
			match(T__25);
			setState(332);
			((UniqueColContext)_localctx).i = match(INTEGER);
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

	public static class GetColContext extends ParserRuleContext {
		public BoolExprContext b1;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public GetColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getCol; }
	}

	public final GetColContext getCol() throws RecognitionException {
		GetColContext _localctx = new GetColContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_getCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__41);
			setState(335);
			match(ID);
			setState(336);
			match(T__25);
			setState(337);
			match(INTEGER);
			setState(338);
			match(T__42);
			setState(339);
			((GetColContext)_localctx).b1 = boolExpr(0);
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

	public static class GetRowContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public GetRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getRow; }
	}

	public final GetRowContext getRow() throws RecognitionException {
		GetRowContext _localctx = new GetRowContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_getRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__43);
			setState(342);
			match(ID);
			setState(343);
			match(T__25);
			setState(344);
			match(INTEGER);
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

	public static class GetHeaderIndexContext extends ParserRuleContext {
		public Token v;
		public StringExprContext s1;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public GetHeaderIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getHeaderIndex; }
	}

	public final GetHeaderIndexContext getHeaderIndex() throws RecognitionException {
		GetHeaderIndexContext _localctx = new GetHeaderIndexContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_getHeaderIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__44);
			setState(347);
			((GetHeaderIndexContext)_localctx).v = match(ID);
			setState(348);
			match(T__45);
			setState(349);
			((GetHeaderIndexContext)_localctx).s1 = stringExpr();
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

	public static class SubTableColContext extends ParserRuleContext {
		public Token v;
		public Token s;
		public Token e;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(TableHandlerParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(TableHandlerParser.INTEGER, i);
		}
		public SubTableColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTableCol; }
	}

	public final SubTableColContext subTableCol() throws RecognitionException {
		SubTableColContext _localctx = new SubTableColContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_subTableCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__46);
			setState(352);
			((SubTableColContext)_localctx).v = match(ID);
			setState(353);
			match(T__47);
			setState(354);
			((SubTableColContext)_localctx).s = match(INTEGER);
			setState(355);
			match(T__48);
			setState(356);
			((SubTableColContext)_localctx).e = match(INTEGER);
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

	public static class SubTableCol2Context extends ParserRuleContext {
		public Token v;
		public Token s;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public SubTableCol2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTableCol2; }
	}

	public final SubTableCol2Context subTableCol2() throws RecognitionException {
		SubTableCol2Context _localctx = new SubTableCol2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_subTableCol2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__46);
			setState(359);
			((SubTableCol2Context)_localctx).v = match(ID);
			setState(360);
			match(T__47);
			setState(361);
			((SubTableCol2Context)_localctx).s = match(INTEGER);
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

	public static class SubTableRowContext extends ParserRuleContext {
		public Token v;
		public Token s;
		public Token e;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(TableHandlerParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(TableHandlerParser.INTEGER, i);
		}
		public SubTableRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTableRow; }
	}

	public final SubTableRowContext subTableRow() throws RecognitionException {
		SubTableRowContext _localctx = new SubTableRowContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_subTableRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__49);
			setState(364);
			((SubTableRowContext)_localctx).v = match(ID);
			setState(365);
			match(T__47);
			setState(366);
			((SubTableRowContext)_localctx).s = match(INTEGER);
			setState(367);
			match(T__48);
			setState(368);
			((SubTableRowContext)_localctx).e = match(INTEGER);
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

	public static class SubTableRow2Context extends ParserRuleContext {
		public Token v;
		public Token s;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public SubTableRow2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTableRow2; }
	}

	public final SubTableRow2Context subTableRow2() throws RecognitionException {
		SubTableRow2Context _localctx = new SubTableRow2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_subTableRow2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__49);
			setState(371);
			((SubTableRow2Context)_localctx).v = match(ID);
			setState(372);
			match(T__47);
			setState(373);
			((SubTableRow2Context)_localctx).s = match(INTEGER);
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

	public static class AddContext extends ParserRuleContext {
		public Token v1;
		public Token v2;
		public List<TerminalNode> ID() { return getTokens(TableHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TableHandlerParser.ID, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__50);
			setState(376);
			((AddContext)_localctx).v1 = match(ID);
			setState(377);
			match(T__51);
			setState(378);
			((AddContext)_localctx).v2 = match(ID);
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

	public static class SubContext extends ParserRuleContext {
		public Token v1;
		public Token v2;
		public List<TerminalNode> ID() { return getTokens(TableHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TableHandlerParser.ID, i);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__52);
			setState(381);
			((SubContext)_localctx).v1 = match(ID);
			setState(382);
			match(T__51);
			setState(383);
			((SubContext)_localctx).v2 = match(ID);
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

	public static class SortContext extends ParserRuleContext {
		public Token v;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__53);
			setState(386);
			((SortContext)_localctx).v = match(ID);
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

	public static class EqualsContext extends ParserRuleContext {
		public Token v1;
		public Token v2;
		public List<TerminalNode> ID() { return getTokens(TableHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TableHandlerParser.ID, i);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((EqualsContext)_localctx).v1 = match(ID);
			setState(389);
			match(T__54);
			setState(390);
			((EqualsContext)_localctx).v2 = match(ID);
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

	public static class ExportContext extends ParserRuleContext {
		public Token v;
		public FileContext f;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__55);
			setState(393);
			((ExportContext)_localctx).v = match(ID);
			setState(394);
			match(T__23);
			setState(395);
			((ExportContext)_localctx).f = file();
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

	public static class PrintTableContext extends ParserRuleContext {
		public Token v;
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public PrintTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printTable; }
	}

	public final PrintTableContext printTable() throws RecognitionException {
		PrintTableContext _localctx = new PrintTableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_printTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__1);
			setState(398);
			((PrintTableContext)_localctx).v = match(ID);
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

	public static class PrintFirstContext extends ParserRuleContext {
		public Token i;
		public Token v;
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public PrintFirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printFirst; }
	}

	public final PrintFirstContext printFirst() throws RecognitionException {
		PrintFirstContext _localctx = new PrintFirstContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_printFirst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__56);
			setState(401);
			((PrintFirstContext)_localctx).i = match(INTEGER);
			setState(402);
			match(T__57);
			setState(403);
			((PrintFirstContext)_localctx).v = match(ID);
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

	public static class PrintLastContext extends ParserRuleContext {
		public Token i;
		public Token v;
		public TerminalNode INTEGER() { return getToken(TableHandlerParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public PrintLastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printLast; }
	}

	public final PrintLastContext printLast() throws RecognitionException {
		PrintLastContext _localctx = new PrintLastContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_printLast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__58);
			setState(406);
			((PrintLastContext)_localctx).i = match(INTEGER);
			setState(407);
			match(T__57);
			setState(408);
			((PrintLastContext)_localctx).v = match(ID);
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

	public static class CsvLineContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TableHandlerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TableHandlerParser.ID, i);
		}
		public CsvLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvLine; }
	}

	public final CsvLineContext csvLine() throws RecognitionException {
		CsvLineContext _localctx = new CsvLineContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_csvLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(410);
				match(ID);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(411);
					match(T__29);
					}
				}

				}
				}
				setState(416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TableHandlerParser.ID, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(ID);
			setState(419);
			match(T__59);
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

	public static class StringExprContext extends ParserRuleContext {
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
	 
		public StringExprContext() { }
		public void copyFrom(StringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringNullContext extends StringExprContext {
		public TerminalNode NULL() { return getToken(TableHandlerParser.NULL, 0); }
		public StringNullContext(StringExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringParContext extends StringExprContext {
		public StringExprContext t2;
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public StringParContext(StringExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends StringExprContext {
		public Token t1;
		public TerminalNode STRING() { return getToken(TableHandlerParser.STRING, 0); }
		public StringContext(StringExprContext ctx) { copyFrom(ctx); }
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_stringExpr);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				((StringContext)_localctx).t1 = match(STRING);
				}
				break;
			case T__3:
				_localctx = new StringParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(T__3);
				setState(423);
				((StringParContext)_localctx).t2 = stringExpr();
				setState(424);
				match(T__4);
				}
				break;
			case NULL:
				_localctx = new StringNullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(NULL);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (T__60 - 61)) | (1L << (T__61 - 61)) | (1L << (T__62 - 61)) | (1L << (T__63 - 61)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return numExpr_sempred((NumExprContext)_localctx, predIndex);
		case 12:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3|\n\3\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\5\7\u0093\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\7"+
		"\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b1"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\r\3\r\3\r\7\r\u00bf\n"+
		"\r\f\r\16\r\u00c2\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cb\n"+
		"\16\3\16\3\16\3\16\7\16\u00d0\n\16\f\16\16\16\u00d3\13\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00f8\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3/\3/\5/\u019f\n/\6/\u01a1\n/\r/\16/\u01a2\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01ae\n\61\3\62\3\62\3\62\2\4"+
		"\30\32\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`b\2\6\3\2\f\17\3\2\20\23\3\2\22\27\3\2?B\2\u01b3"+
		"\2g\3\2\2\2\4{\3\2\2\2\6}\3\2\2\2\b\u0083\3\2\2\2\n\u0087\3\2\2\2\f\u008a"+
		"\3\2\2\2\16\u0094\3\2\2\2\20\u009a\3\2\2\2\22\u00a0\3\2\2\2\24\u00a3\3"+
		"\2\2\2\26\u00b0\3\2\2\2\30\u00b9\3\2\2\2\32\u00ca\3\2\2\2\34\u00d4\3\2"+
		"\2\2\36\u00d8\3\2\2\2 \u00fb\3\2\2\2\"\u0100\3\2\2\2$\u0105\3\2\2\2&\u010c"+
		"\3\2\2\2(\u0111\3\2\2\2*\u0118\3\2\2\2,\u0122\3\2\2\2.\u0127\3\2\2\2\60"+
		"\u012c\3\2\2\2\62\u0131\3\2\2\2\64\u0138\3\2\2\2\66\u013d\3\2\2\28\u0145"+
		"\3\2\2\2:\u0148\3\2\2\2<\u014b\3\2\2\2>\u0150\3\2\2\2@\u0157\3\2\2\2B"+
		"\u015c\3\2\2\2D\u0161\3\2\2\2F\u0168\3\2\2\2H\u016d\3\2\2\2J\u0174\3\2"+
		"\2\2L\u0179\3\2\2\2N\u017e\3\2\2\2P\u0183\3\2\2\2R\u0186\3\2\2\2T\u018a"+
		"\3\2\2\2V\u018f\3\2\2\2X\u0192\3\2\2\2Z\u0197\3\2\2\2\\\u01a0\3\2\2\2"+
		"^\u01a4\3\2\2\2`\u01ad\3\2\2\2b\u01af\3\2\2\2df\5\4\3\2ed\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\2\2\3k\3\3\2\2\2lm"+
		"\5\6\4\2mn\7G\2\2n|\3\2\2\2op\5\b\5\2pq\7G\2\2q|\3\2\2\2rs\5\n\6\2st\7"+
		"G\2\2t|\3\2\2\2uv\5\f\7\2vw\7G\2\2w|\3\2\2\2xy\5\36\20\2yz\7G\2\2z|\3"+
		"\2\2\2{l\3\2\2\2{o\3\2\2\2{r\3\2\2\2{u\3\2\2\2{x\3\2\2\2|\5\3\2\2\2}~"+
		"\5b\62\2~\u0081\7F\2\2\177\u0080\7\3\2\2\u0080\u0082\5\26\f\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083\u0084\7F\2\2\u0084"+
		"\u0085\7\3\2\2\u0085\u0086\5\26\f\2\u0086\t\3\2\2\2\u0087\u0088\7\4\2"+
		"\2\u0088\u0089\5\26\f\2\u0089\13\3\2\2\2\u008a\u008e\5\16\b\2\u008b\u008d"+
		"\5\20\t\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093"+
		"\5\22\n\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\r\3\2\2\2\u0094"+
		"\u0095\7\5\2\2\u0095\u0096\7\6\2\2\u0096\u0097\5\32\16\2\u0097\u0098\7"+
		"\7\2\2\u0098\u0099\5\24\13\2\u0099\17\3\2\2\2\u009a\u009b\7\b\2\2\u009b"+
		"\u009c\7\6\2\2\u009c\u009d\5\32\16\2\u009d\u009e\7\7\2\2\u009e\u009f\5"+
		"\24\13\2\u009f\21\3\2\2\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\5\24\13\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a7\7\n\2\2\u00a4\u00a6\5\4\3\2\u00a5\u00a4\3\2\2"+
		"\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\13\2\2\u00ab\25\3\2\2\2\u00ac"+
		"\u00b1\5\30\r\2\u00ad\u00b1\5\32\16\2\u00ae\u00b1\5`\61\2\u00af\u00b1"+
		"\5\36\20\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\b\r\1\2\u00b3\u00b4"+
		"\7\6\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\7\7\2\2\u00b6\u00ba\3\2\2\2"+
		"\u00b7\u00ba\7E\2\2\u00b8\u00ba\7F\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00c0\3\2\2\2\u00bb\u00bc\f\6\2\2\u00bc"+
		"\u00bd\t\2\2\2\u00bd\u00bf\5\30\r\7\u00be\u00bb\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\31\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\b\16\1\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\5"+
		"\32\16\2\u00c6\u00c7\7\7\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00cb\7D\2\2\u00c9"+
		"\u00cb\7F\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\f\6\2\2\u00cd\u00ce\t\3\2\2\u00ce"+
		"\u00d0\5\32\16\7\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\33\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\5\30\r\2\u00d5\u00d6\t\4\2\2\u00d6\u00d7\5\30\r\2\u00d7\35\3\2"+
		"\2\2\u00d8\u00f7\7\30\2\2\u00d9\u00f8\5 \21\2\u00da\u00f8\5\"\22\2\u00db"+
		"\u00f8\5$\23\2\u00dc\u00f8\5&\24\2\u00dd\u00f8\5(\25\2\u00de\u00f8\5*"+
		"\26\2\u00df\u00f8\5,\27\2\u00e0\u00f8\5.\30\2\u00e1\u00f8\5\60\31\2\u00e2"+
		"\u00f8\5\62\32\2\u00e3\u00f8\5\64\33\2\u00e4\u00f8\5\66\34\2\u00e5\u00f8"+
		"\58\35\2\u00e6\u00f8\5:\36\2\u00e7\u00f8\5<\37\2\u00e8\u00f8\5> \2\u00e9"+
		"\u00f8\5@!\2\u00ea\u00f8\5B\"\2\u00eb\u00f8\5D#\2\u00ec\u00f8\5F$\2\u00ed"+
		"\u00f8\5H%\2\u00ee\u00f8\5J&\2\u00ef\u00f8\5L\'\2\u00f0\u00f8\5N(\2\u00f1"+
		"\u00f8\5P)\2\u00f2\u00f8\5R*\2\u00f3\u00f8\5T+\2\u00f4\u00f8\5V,\2\u00f5"+
		"\u00f8\5X-\2\u00f6\u00f8\5Z.\2\u00f7\u00d9\3\2\2\2\u00f7\u00da\3\2\2\2"+
		"\u00f7\u00db\3\2\2\2\u00f7\u00dc\3\2\2\2\u00f7\u00dd\3\2\2\2\u00f7\u00de"+
		"\3\2\2\2\u00f7\u00df\3\2\2\2\u00f7\u00e0\3\2\2\2\u00f7\u00e1\3\2\2\2\u00f7"+
		"\u00e2\3\2\2\2\u00f7\u00e3\3\2\2\2\u00f7\u00e4\3\2\2\2\u00f7\u00e5\3\2"+
		"\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00e7\3\2\2\2\u00f7\u00e8\3\2\2\2\u00f7"+
		"\u00e9\3\2\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00ec\3\2"+
		"\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7"+
		"\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2"+
		"\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\7\7\2\2\u00fa\37\3\2\2\2\u00fb\u00fc\7\31\2"+
		"\2\u00fc\u00fd\5^\60\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\7F\2\2\u00ff!"+
		"\3\2\2\2\u0100\u0101\7\33\2\2\u0101\u0102\5\\/\2\u0102\u0103\7\32\2\2"+
		"\u0103\u0104\7F\2\2\u0104#\3\2\2\2\u0105\u0106\7\33\2\2\u0106\u0107\5"+
		"\\/\2\u0107\u0108\7\34\2\2\u0108\u0109\7E\2\2\u0109\u010a\7\32\2\2\u010a"+
		"\u010b\7F\2\2\u010b%\3\2\2\2\u010c\u010d\7\35\2\2\u010d\u010e\7E\2\2\u010e"+
		"\u010f\7\36\2\2\u010f\u0110\7F\2\2\u0110\'\3\2\2\2\u0111\u0112\7\37\2"+
		"\2\u0112\u0113\7E\2\2\u0113\u0114\7 \2\2\u0114\u0115\7E\2\2\u0115\u0116"+
		"\7!\2\2\u0116\u0117\7F\2\2\u0117)\3\2\2\2\u0118\u0119\7\"\2\2\u0119\u011a"+
		"\7F\2\2\u011a\u011b\7#\2\2\u011b\u011c\5\26\f\2\u011c\u011d\7$\2\2\u011d"+
		"\u011e\7E\2\2\u011e\u011f\7 \2\2\u011f\u0120\7E\2\2\u0120\u0121\7\7\2"+
		"\2\u0121+\3\2\2\2\u0122\u0123\7%\2\2\u0123\u0124\7E\2\2\u0124\u0125\7"+
		"\36\2\2\u0125\u0126\7F\2\2\u0126-\3\2\2\2\u0127\u0128\7\35\2\2\u0128\u0129"+
		"\7E\2\2\u0129\u012a\7\36\2\2\u012a\u012b\7F\2\2\u012b/\3\2\2\2\u012c\u012d"+
		"\7&\2\2\u012d\u012e\5\\/\2\u012e\u012f\7\32\2\2\u012f\u0130\7F\2\2\u0130"+
		"\61\3\2\2\2\u0131\u0132\7&\2\2\u0132\u0133\5\\/\2\u0133\u0134\7\34\2\2"+
		"\u0134\u0135\7E\2\2\u0135\u0136\7\32\2\2\u0136\u0137\7F\2\2\u0137\63\3"+
		"\2\2\2\u0138\u0139\7\'\2\2\u0139\u013a\7E\2\2\u013a\u013b\7\36\2\2\u013b"+
		"\u013c\7F\2\2\u013c\65\3\2\2\2\u013d\u013e\7(\2\2\u013e\u013f\7E\2\2\u013f"+
		"\u0140\7 \2\2\u0140\u0141\7E\2\2\u0141\u0142\7\7\2\2\u0142\u0143\7\36"+
		"\2\2\u0143\u0144\7F\2\2\u0144\67\3\2\2\2\u0145\u0146\7)\2\2\u0146\u0147"+
		"\7F\2\2\u01479\3\2\2\2\u0148\u0149\7*\2\2\u0149\u014a\7F\2\2\u014a;\3"+
		"\2\2\2\u014b\u014c\7+\2\2\u014c\u014d\7F\2\2\u014d\u014e\7\34\2\2\u014e"+
		"\u014f\7E\2\2\u014f=\3\2\2\2\u0150\u0151\7,\2\2\u0151\u0152\7F\2\2\u0152"+
		"\u0153\7\34\2\2\u0153\u0154\7E\2\2\u0154\u0155\7-\2\2\u0155\u0156\5\32"+
		"\16\2\u0156?\3\2\2\2\u0157\u0158\7.\2\2\u0158\u0159\7F\2\2\u0159\u015a"+
		"\7\34\2\2\u015a\u015b\7E\2\2\u015bA\3\2\2\2\u015c\u015d\7/\2\2\u015d\u015e"+
		"\7F\2\2\u015e\u015f\7\60\2\2\u015f\u0160\5`\61\2\u0160C\3\2\2\2\u0161"+
		"\u0162\7\61\2\2\u0162\u0163\7F\2\2\u0163\u0164\7\62\2\2\u0164\u0165\7"+
		"E\2\2\u0165\u0166\7\63\2\2\u0166\u0167\7E\2\2\u0167E\3\2\2\2\u0168\u0169"+
		"\7\61\2\2\u0169\u016a\7F\2\2\u016a\u016b\7\62\2\2\u016b\u016c\7E\2\2\u016c"+
		"G\3\2\2\2\u016d\u016e\7\64\2\2\u016e\u016f\7F\2\2\u016f\u0170\7\62\2\2"+
		"\u0170\u0171\7E\2\2\u0171\u0172\7\63\2\2\u0172\u0173\7E\2\2\u0173I\3\2"+
		"\2\2\u0174\u0175\7\64\2\2\u0175\u0176\7F\2\2\u0176\u0177\7\62\2\2\u0177"+
		"\u0178\7E\2\2\u0178K\3\2\2\2\u0179\u017a\7\65\2\2\u017a\u017b\7F\2\2\u017b"+
		"\u017c\7\66\2\2\u017c\u017d\7F\2\2\u017dM\3\2\2\2\u017e\u017f\7\67\2\2"+
		"\u017f\u0180\7F\2\2\u0180\u0181\7\66\2\2\u0181\u0182\7F\2\2\u0182O\3\2"+
		"\2\2\u0183\u0184\78\2\2\u0184\u0185\7F\2\2\u0185Q\3\2\2\2\u0186\u0187"+
		"\7F\2\2\u0187\u0188\79\2\2\u0188\u0189\7F\2\2\u0189S\3\2\2\2\u018a\u018b"+
		"\7:\2\2\u018b\u018c\7F\2\2\u018c\u018d\7\32\2\2\u018d\u018e\5^\60\2\u018e"+
		"U\3\2\2\2\u018f\u0190\7\4\2\2\u0190\u0191\7F\2\2\u0191W\3\2\2\2\u0192"+
		"\u0193\7;\2\2\u0193\u0194\7E\2\2\u0194\u0195\7<\2\2\u0195\u0196\7F\2\2"+
		"\u0196Y\3\2\2\2\u0197\u0198\7=\2\2\u0198\u0199\7E\2\2\u0199\u019a\7<\2"+
		"\2\u019a\u019b\7F\2\2\u019b[\3\2\2\2\u019c\u019e\7F\2\2\u019d\u019f\7"+
		" \2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019c\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3]\3\2\2\2\u01a4\u01a5\7F\2\2\u01a5\u01a6\7>\2\2\u01a6_\3\2\2"+
		"\2\u01a7\u01ae\7H\2\2\u01a8\u01a9\7\6\2\2\u01a9\u01aa\5`\61\2\u01aa\u01ab"+
		"\7\7\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\7C\2\2\u01ad\u01a7\3\2\2\2\u01ad"+
		"\u01a8\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aea\3\2\2\2\u01af\u01b0\t\5\2\2"+
		"\u01b0c\3\2\2\2\21g{\u0081\u008e\u0092\u00a7\u00b0\u00b9\u00c0\u00ca\u00d1"+
		"\u00f7\u019e\u01a2\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}