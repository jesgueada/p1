// Generated from C:/Users/lolim/IdeaProjects/p1/src\Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VARIABLES=2, BLANCO=3, TABULADOR=4, FIN_LINEA=5, CIERTO=6, 
		FALSO=7, NUM=8, LOG=9, SEQ=10, ENTERO=11, BOOLEANO=12, Y=13, O=14, NO=15, 
		NUMERO=16, IDENT=17, PA=18, PC=19, CA=20, CC=21, PyC=22, COMA=23, ASIG=24, 
		MAYOR=25, MENOR=26, MAYORIGUAL=27, MENORIGUAL=28, IGUAL=29, DISTINTO=30, 
		MAS=31, MENOS=32, POR=33, DIV=34, COMENTARIO_BLOQUE=35, COMENTARIO_LINEA=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAMA", "VARIABLES", "BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", 
			"LETRA", "CIERTO", "FALSO", "NUM", "LOG", "SEQ", "ENTERO", "BOOLEANO", 
			"Y", "O", "NO", "NUMERO", "IDENT", "PA", "PC", "CA", "CC", "PyC", "COMA", 
			"ASIG", "MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "IGUAL", "DISTINTO", 
			"MAS", "MENOS", "POR", "DIV", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAMA'", "'VARIABLES'", "' '", "'\t'", null, "'T'", "'F'", 
			"'NUM'", "'LOG'", "'SEQ'", "'entero'", "'booleano'", "'O'", "'Y'", "'NO'", 
			null, null, "'('", "')'", "'['", "']'", "';'", "','", "'='", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAMA", "VARIABLES", "BLANCO", "TABULADOR", "FIN_LINEA", "CIERTO", 
			"FALSO", "NUM", "LOG", "SEQ", "ENTERO", "BOOLEANO", "Y", "O", "NO", "NUMERO", 
			"IDENT", "PA", "PC", "CA", "CC", "PyC", "COMA", "ASIG", "MAYOR", "MENOR", 
			"MAYORIGUAL", "MENORIGUAL", "IGUAL", "DISTINTO", "MAS", "MENOS", "POR", 
			"DIV", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\5\23\u009e\n\23\3\23\6\23\u00a1\n"+
		"\23\r\23\16\23\u00a2\3\24\3\24\3\24\7\24\u00a8\n\24\f\24\16\24\u00ab\13"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\7&\u00d7\n&\f&\16&\u00da\13&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u00e5\n\'\f\'\16\'\u00e8\13\'\3\'\3"+
		"\'\3\'\3\'\4\u00d8\u00e6\2(\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\b\23\t\25"+
		"\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30"+
		"\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&\3\2\4\3\2\62;\4\2C\\"+
		"c|\2\u00f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5X\3\2\2\2\7b\3\2\2\2\tf\3\2\2\2\13k\3"+
		"\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27}"+
		"\3\2\2\2\31\u0081\3\2\2\2\33\u0085\3\2\2\2\35\u008c\3\2\2\2\37\u0095\3"+
		"\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009d\3\2\2\2\'\u00a4\3\2\2\2)\u00ac"+
		"\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61\u00b4\3\2\2\2"+
		"\63\u00b6\3\2\2\2\65\u00b8\3\2\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00be"+
		"\3\2\2\2=\u00c1\3\2\2\2?\u00c4\3\2\2\2A\u00c7\3\2\2\2C\u00ca\3\2\2\2E"+
		"\u00cc\3\2\2\2G\u00ce\3\2\2\2I\u00d0\3\2\2\2K\u00d2\3\2\2\2M\u00e0\3\2"+
		"\2\2OP\7R\2\2PQ\7T\2\2QR\7Q\2\2RS\7I\2\2ST\7T\2\2TU\7C\2\2UV\7O\2\2VW"+
		"\7C\2\2W\4\3\2\2\2XY\7X\2\2YZ\7C\2\2Z[\7T\2\2[\\\7K\2\2\\]\7C\2\2]^\7"+
		"D\2\2^_\7N\2\2_`\7G\2\2`a\7U\2\2a\6\3\2\2\2bc\7\"\2\2cd\3\2\2\2de\b\4"+
		"\2\2e\b\3\2\2\2fg\7\13\2\2gh\3\2\2\2hi\b\5\2\2i\n\3\2\2\2jl\7\17\2\2k"+
		"j\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\f\2\2no\3\2\2\2op\b\6\2\2p\f\3\2\2\2"+
		"qr\t\2\2\2r\16\3\2\2\2st\t\3\2\2t\20\3\2\2\2uv\7V\2\2v\22\3\2\2\2wx\7"+
		"H\2\2x\24\3\2\2\2yz\7P\2\2z{\7W\2\2{|\7O\2\2|\26\3\2\2\2}~\7N\2\2~\177"+
		"\7Q\2\2\177\u0080\7I\2\2\u0080\30\3\2\2\2\u0081\u0082\7U\2\2\u0082\u0083"+
		"\7G\2\2\u0083\u0084\7S\2\2\u0084\32\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7q\2\2\u008b\34\3\2\2\2\u008c\u008d\7d\2\2\u008d\u008e\7q\2\2\u008e"+
		"\u008f\7q\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7c\2\2"+
		"\u0092\u0093\7p\2\2\u0093\u0094\7q\2\2\u0094\36\3\2\2\2\u0095\u0096\7"+
		"Q\2\2\u0096 \3\2\2\2\u0097\u0098\7[\2\2\u0098\"\3\2\2\2\u0099\u009a\7"+
		"P\2\2\u009a\u009b\7Q\2\2\u009b$\3\2\2\2\u009c\u009e\7/\2\2\u009d\u009c"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\5\r\7\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3&\3\2\2\2\u00a4\u00a9\5\17\b\2\u00a5\u00a8\5\17\b\2\u00a6\u00a8"+
		"\5\r\7\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa(\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00ad\7*\2\2\u00ad*\3\2\2\2\u00ae\u00af\7+\2\2\u00af,\3\2\2\2\u00b0"+
		"\u00b1\7]\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7_\2\2\u00b3\60\3\2\2\2\u00b4"+
		"\u00b5\7=\2\2\u00b5\62\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\64\3\2\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb8\3\2\2\2\u00bc"+
		"\u00bd\7>\2\2\u00bd:\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"<\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7?\2\2\u00c3>\3\2\2\2\u00c4\u00c5"+
		"\7?\2\2\u00c5\u00c6\7?\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7#\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7-\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7"+
		"/\2\2\u00cdF\3\2\2\2\u00ce\u00cf\7,\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7\61"+
		"\2\2\u00d1J\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d8"+
		"\3\2\2\2\u00d5\u00d7\13\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\b&\2\2\u00dfL\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7\61\2\2"+
		"\u00e2\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\5\13\6\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b"+
		"\'\2\2\u00ecN\3\2\2\2\n\2k\u009d\u00a2\u00a7\u00a9\u00d8\u00e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}