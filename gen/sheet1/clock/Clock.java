// Generated from /Users/bence/Documents/Dokumente - MacBook Pro von Bence/Studium/Semester_5/SPKO/programs/src/sheet1/clock/Clock.g4 by ANTLR 4.10.1
package sheet1.clock;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Clock extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Clock_am_pm=1, AMS=2, AME=3, PMS=4, PME=5, TOO=6, HOUR=7, MINUTES=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Clock_am_pm", "AMS", "AME", "PMS", "PME", "TOO", "HOUR", "MINUTES", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'a.m.'", "'noon'", "'p.m.'", "'midnight'", "'12'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Clock_am_pm", "AMS", "AME", "PMS", "PME", "TOO", "HOUR", "MINUTES", 
			"WS"
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


	public Clock(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Clock.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\tQ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000 \b\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000$\b\u0000\u0003\u0000&\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006F\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bL\b\b\u000b\b\f\b"+
		"M\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0005\u0001"+
		"\u000019\u0001\u000002\u0001\u000005\u0001\u000009\u0003\u0000\t\n\r\r"+
		"  W\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'"+
		"\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00071\u0001\u0000"+
		"\u0000\u0000\t6\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000"+
		"\rE\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000\u0011K\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0003\r\u0006\u0000\u0014\u0015\u0005:"+
		"\u0000\u0000\u0015\u0016\u0003\u000f\u0007\u0000\u0016\u0019\u0005 \u0000"+
		"\u0000\u0017\u001a\u0003\u0003\u0001\u0000\u0018\u001a\u0003\u0007\u0003"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000"+
		"\u0000\u001a&\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u000b\u0005\u0000"+
		"\u001c\u001f\u0005 \u0000\u0000\u001d \u0003\u0005\u0002\u0000\u001e "+
		"\u0003\t\u0004\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 &\u0001\u0000\u0000\u0000!$\u0003\u0005\u0002\u0000"+
		"\"$\u0003\t\u0004\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$&\u0001\u0000\u0000\u0000%\u0013\u0001\u0000\u0000\u0000%\u001b"+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005a\u0000\u0000()\u0005.\u0000\u0000)*\u0005m\u0000"+
		"\u0000*+\u0005.\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005n\u0000"+
		"\u0000-.\u0005o\u0000\u0000./\u0005o\u0000\u0000/0\u0005n\u0000\u0000"+
		"0\u0006\u0001\u0000\u0000\u000012\u0005p\u0000\u000023\u0005.\u0000\u0000"+
		"34\u0005m\u0000\u000045\u0005.\u0000\u00005\b\u0001\u0000\u0000\u0000"+
		"67\u0005m\u0000\u000078\u0005i\u0000\u000089\u0005d\u0000\u00009:\u0005"+
		"n\u0000\u0000:;\u0005i\u0000\u0000;<\u0005g\u0000\u0000<=\u0005h\u0000"+
		"\u0000=>\u0005t\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u00051\u0000"+
		"\u0000@A\u00052\u0000\u0000A\f\u0001\u0000\u0000\u0000BF\u0007\u0000\u0000"+
		"\u0000CD\u00051\u0000\u0000DF\u0007\u0001\u0000\u0000EB\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0007"+
		"\u0002\u0000\u0000HI\u0007\u0003\u0000\u0000I\u0010\u0001\u0000\u0000"+
		"\u0000JL\u0007\u0004\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0006\b\u0000\u0000P\u0012\u0001\u0000\u0000\u0000"+
		"\u0007\u0000\u0019\u001f#%EM\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}