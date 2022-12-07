// Generated from /Users/bence/Documents/Dokumente - MacBook Pro von Bence/Studium/Semester_5/SPKO/programs/SPKO/src/sheet2/json/JSONLexer.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OOPEN=1, OCLOSE=2, AOPEN=3, ACLOSE=4, BOOLEAN=5, NULL=6, NUMBER=7, STRING=8, 
		DELIMITER=9, TRUE=10, FALSE=11, DIGIT=12, SPLIT=13, NEG=14, DOT=15, WS=16, 
		S=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OOPEN", "OCLOSE", "AOPEN", "ACLOSE", "BOOLEAN", "NULL", "NUMBER", "STRING", 
			"DELIMITER", "TRUE", "FALSE", "DIGIT", "SPLIT", "NEG", "DOT", "WS", "S"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", null, "'null'", null, null, "','", 
			"'true'", "'false'", null, "':'", "'-'", "'.'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OOPEN", "OCLOSE", "AOPEN", "ACLOSE", "BOOLEAN", "NULL", "NUMBER", 
			"STRING", "DELIMITER", "TRUE", "FALSE", "DIGIT", "SPLIT", "NEG", "DOT", 
			"WS", "S"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSONLexer.g4"; }

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
		"\u0004\u0000\u0011j\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004.\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u00066\b\u0006\u0001"+
		"\u0006\u0004\u00069\b\u0006\u000b\u0006\f\u0006:\u0001\u0006\u0001\u0006"+
		"\u0004\u0006?\b\u0006\u000b\u0006\f\u0006@\u0003\u0006C\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u0007G\b\u0007\n\u0007\f\u0007J\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001H\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0002"+
		"\u0001\u000009\u0002\u0000\t\n\r\ro\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000"+
		"\u0000\u0007)\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b"+
		"/\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000fD\u0001\u0000"+
		"\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000"+
		"\u0015T\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\"+
		"\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d`\u0001\u0000"+
		"\u0000\u0000\u001fb\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000"+
		"#$\u0005{\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005}\u0000\u0000"+
		"&\u0004\u0001\u0000\u0000\u0000\'(\u0005[\u0000\u0000(\u0006\u0001\u0000"+
		"\u0000\u0000)*\u0005]\u0000\u0000*\b\u0001\u0000\u0000\u0000+.\u0003\u0013"+
		"\t\u0000,.\u0003\u0015\n\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005n\u0000\u000001\u0005u"+
		"\u0000\u000012\u0005l\u0000\u000023\u0005l\u0000\u00003\f\u0001\u0000"+
		"\u0000\u000046\u0003\u001b\r\u000054\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000068\u0001\u0000\u0000\u000079\u0003\u0017\u000b\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;B\u0001\u0000\u0000\u0000<>\u0003\u001d\u000e"+
		"\u0000=?\u0003\u0017\u000b\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"C\u000e\u0001\u0000\u0000\u0000DH\u0005\"\u0000\u0000EG\t\u0000\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KL\u0005\"\u0000\u0000L\u0010\u0001\u0000\u0000\u0000"+
		"MN\u0005,\u0000\u0000N\u0012\u0001\u0000\u0000\u0000OP\u0005t\u0000\u0000"+
		"PQ\u0005r\u0000\u0000QR\u0005u\u0000\u0000RS\u0005e\u0000\u0000S\u0014"+
		"\u0001\u0000\u0000\u0000TU\u0005f\u0000\u0000UV\u0005a\u0000\u0000VW\u0005"+
		"l\u0000\u0000WX\u0005s\u0000\u0000XY\u0005e\u0000\u0000Y\u0016\u0001\u0000"+
		"\u0000\u0000Z[\u0007\u0000\u0000\u0000[\u0018\u0001\u0000\u0000\u0000"+
		"\\]\u0005:\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005-\u0000\u0000"+
		"_\u001c\u0001\u0000\u0000\u0000`a\u0005.\u0000\u0000a\u001e\u0001\u0000"+
		"\u0000\u0000bc\u0007\u0001\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0006"+
		"\u000f\u0000\u0000e \u0001\u0000\u0000\u0000fg\u0005 \u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0006\u0010\u0000\u0000i\"\u0001\u0000\u0000\u0000"+
		"\u0007\u0000-5:@BH\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}