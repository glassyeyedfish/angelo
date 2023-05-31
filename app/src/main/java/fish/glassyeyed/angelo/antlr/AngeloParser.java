// Generated from Angelo.g4 by ANTLR 4.10

package fish.glassyeyed.angelo.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AngeloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NOT=4, IMP=5, ID=6, COMMENT=7, WS=8;
	public static final int
		RULE_prog_r = 0, RULE_stmt_r = 1, RULE_wff_r = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog_r", "stmt_r", "wff_r"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'~'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NOT", "IMP", "ID", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Angelo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngeloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Prog_rContext extends ParserRuleContext {
		public Prog_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_r; }
	 
		public Prog_rContext() { }
		public void copyFrom(Prog_rContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends Prog_rContext {
		public TerminalNode EOF() { return getToken(AngeloParser.EOF, 0); }
		public List<Stmt_rContext> stmt_r() {
			return getRuleContexts(Stmt_rContext.class);
		}
		public Stmt_rContext stmt_r(int i) {
			return getRuleContext(Stmt_rContext.class,i);
		}
		public ProgramContext(Prog_rContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngeloVisitor ) return ((AngeloVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prog_rContext prog_r() throws RecognitionException {
		Prog_rContext _localctx = new Prog_rContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog_r);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				stmt_r();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NOT) | (1L << ID))) != 0) );
			setState(11);
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

	public static class Stmt_rContext extends ParserRuleContext {
		public Stmt_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_r; }
	 
		public Stmt_rContext() { }
		public void copyFrom(Stmt_rContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementContext extends Stmt_rContext {
		public Wff_rContext wff_r() {
			return getRuleContext(Wff_rContext.class,0);
		}
		public StatementContext(Stmt_rContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngeloVisitor ) return ((AngeloVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_rContext stmt_r() throws RecognitionException {
		Stmt_rContext _localctx = new Stmt_rContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_r);
		try {
			_localctx = new StatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			wff_r();
			setState(14);
			match(T__0);
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

	public static class Wff_rContext extends ParserRuleContext {
		public Wff_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wff_r; }
	 
		public Wff_rContext() { }
		public void copyFrom(Wff_rContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpWffContext extends Wff_rContext {
		public List<Wff_rContext> wff_r() {
			return getRuleContexts(Wff_rContext.class);
		}
		public Wff_rContext wff_r(int i) {
			return getRuleContext(Wff_rContext.class,i);
		}
		public TerminalNode IMP() { return getToken(AngeloParser.IMP, 0); }
		public ImpWffContext(Wff_rContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).enterImpWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).exitImpWff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngeloVisitor ) return ((AngeloVisitor<? extends T>)visitor).visitImpWff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomicWffContext extends Wff_rContext {
		public TerminalNode ID() { return getToken(AngeloParser.ID, 0); }
		public AtomicWffContext(Wff_rContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).enterAtomicWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).exitAtomicWff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngeloVisitor ) return ((AngeloVisitor<? extends T>)visitor).visitAtomicWff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegWffContext extends Wff_rContext {
		public TerminalNode NOT() { return getToken(AngeloParser.NOT, 0); }
		public Wff_rContext wff_r() {
			return getRuleContext(Wff_rContext.class,0);
		}
		public NegWffContext(Wff_rContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).enterNegWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngeloListener ) ((AngeloListener)listener).exitNegWff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngeloVisitor ) return ((AngeloVisitor<? extends T>)visitor).visitNegWff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wff_rContext wff_r() throws RecognitionException {
		Wff_rContext _localctx = new Wff_rContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_wff_r);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtomicWffContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(ID);
				}
				break;
			case NOT:
				_localctx = new NegWffContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(NOT);
				setState(18);
				wff_r();
				}
				break;
			case T__1:
				_localctx = new ImpWffContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(T__1);
				setState(20);
				wff_r();
				setState(21);
				match(IMP);
				setState(22);
				wff_r();
				setState(23);
				match(T__2);
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

	public static final String _serializedATN =
		"\u0004\u0001\b\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001\u0002\u0000\u0000"+
		"\u0003\u0000\u0002\u0004\u0000\u0000\u001b\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000"+
		"\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b"+
		"\t\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\f\u0005\u0000\u0000"+
		"\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0003\u0004\u0002\u0000"+
		"\u000e\u000f\u0005\u0001\u0000\u0000\u000f\u0003\u0001\u0000\u0000\u0000"+
		"\u0010\u001a\u0005\u0006\u0000\u0000\u0011\u0012\u0005\u0004\u0000\u0000"+
		"\u0012\u001a\u0003\u0004\u0002\u0000\u0013\u0014\u0005\u0002\u0000\u0000"+
		"\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u0005\u0000\u0000"+
		"\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0005\u0003\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0010\u0001\u0000\u0000\u0000"+
		"\u0019\u0011\u0001\u0000\u0000\u0000\u0019\u0013\u0001\u0000\u0000\u0000"+
		"\u001a\u0005\u0001\u0000\u0000\u0000\u0002\t\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}