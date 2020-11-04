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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, NUM=4, LOG=5, SEQ=6, PROGRAMA=7, VARIABLES=8, 
		SUBPROGRAMAS=9, FUNCION=10, FFUNCION=11, PROCEDIMIENTO=12, FPROCEDIMIENTO=13, 
		INSTRUCCIONES=14, MOSTRAR=15, RUPTURA=16, DEV=17, CIERTO=18, FALSO=19, 
		NUMERO=20, IDENT=21, PA=22, PC=23, CA=24, CC=25, PyC=26, COMA=27, ASIG=28, 
		MAYOR=29, MENOR=30, IGUAL=31, DISTINTO=32, MENORIGUAL=33, MAYORIGUAL=34, 
		CONJUNCION=35, DISYUNCION=36, NEGACION=37, MAS=38, MENOS=39, POR=40, DIV=41, 
		SI=42, SINO=43, ENTONCES=44, FSI=45, MIENTRAS=46, FMIENTRAS=47, HACER=48, 
		COMENTARIO_BLOQUE=49, COMENTARIO_LINEA=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "NUM", "LOG", 
			"SEQ", "PROGRAMA", "VARIABLES", "SUBPROGRAMAS", "FUNCION", "FFUNCION", 
			"PROCEDIMIENTO", "FPROCEDIMIENTO", "INSTRUCCIONES", "MOSTRAR", "RUPTURA", 
			"DEV", "CIERTO", "FALSO", "NUMERO", "IDENT", "PA", "PC", "CA", "CC", 
			"PyC", "COMA", "ASIG", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "MENORIGUAL", 
			"MAYORIGUAL", "CONJUNCION", "DISYUNCION", "NEGACION", "MAS", "MENOS", 
			"POR", "DIV", "SI", "SINO", "ENTONCES", "FSI", "MIENTRAS", "FMIENTRAS", 
			"HACER", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'NUM'", "'LOG'", "'SEQ'", "'PROGRAMA'", "'VARIABLES'", 
			"'SUBPROGRAMAS'", "'FUNCION'", "'FFUNCION'", "'PROCEDIMIENTO'", "'FPROCEDIMIENTO'", 
			"'INSTRUCCIONES'", "'mostrar'", "'ruptura'", "'dev'", "'T'", "'F'", null, 
			null, "'('", "')'", "'['", "']'", "';'", "','", "'='", "'>'", "'<'", 
			"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'!'", "'+'", "'-'", 
			"'*'", "'/'", "'si'", "'sino'", "'entonces'", "'fsi'", "'mientras'", 
			"'fmientras'", "'hacer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "LOG", "SEQ", "PROGRAMA", 
			"VARIABLES", "SUBPROGRAMAS", "FUNCION", "FFUNCION", "PROCEDIMIENTO", 
			"FPROCEDIMIENTO", "INSTRUCCIONES", "MOSTRAR", "RUPTURA", "DEV", "CIERTO", 
			"FALSO", "NUMERO", "IDENT", "PA", "PC", "CA", "CC", "PyC", "COMA", "ASIG", 
			"MAYOR", "MENOR", "IGUAL", "DISTINTO", "MENORIGUAL", "MAYORIGUAL", "CONJUNCION", 
			"DISYUNCION", "NEGACION", "MAS", "MENOS", "POR", "DIV", "SI", "SINO", 
			"ENTONCES", "FSI", "MIENTRAS", "FMIENTRAS", "HACER", "COMENTARIO_BLOQUE", 
			"COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0185\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4u\n\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\5\27"+
		"\u0100\n\27\3\27\6\27\u0103\n\27\r\27\16\27\u0104\3\30\3\30\3\30\7\30"+
		"\u010a\n\30\f\30\16\30\u010d\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\7\64\u016f\n\64\f\64\16\64\u0172\13\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\7\65\u017d\n\65\f\65\16\65\u0180\13\65\3\65\3\65"+
		"\3\65\3\65\4\u0170\u017e\2\66\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t"+
		"\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61"+
		"\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]."+
		"_/a\60c\61e\62g\63i\64\3\2\4\3\2\62;\4\2C\\c|\2\u0189\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\3k\3\2\2\2\5o\3\2\2\2\7t\3\2\2\2\tz\3\2\2\2\13|\3\2\2\2\r~\3"+
		"\2\2\2\17\u0082\3\2\2\2\21\u0086\3\2\2\2\23\u008a\3\2\2\2\25\u0093\3\2"+
		"\2\2\27\u009d\3\2\2\2\31\u00aa\3\2\2\2\33\u00b2\3\2\2\2\35\u00bb\3\2\2"+
		"\2\37\u00c9\3\2\2\2!\u00d8\3\2\2\2#\u00e6\3\2\2\2%\u00ee\3\2\2\2\'\u00f6"+
		"\3\2\2\2)\u00fa\3\2\2\2+\u00fc\3\2\2\2-\u00ff\3\2\2\2/\u0106\3\2\2\2\61"+
		"\u010e\3\2\2\2\63\u0110\3\2\2\2\65\u0112\3\2\2\2\67\u0114\3\2\2\29\u0116"+
		"\3\2\2\2;\u0118\3\2\2\2=\u011a\3\2\2\2?\u011c\3\2\2\2A\u011e\3\2\2\2C"+
		"\u0120\3\2\2\2E\u0123\3\2\2\2G\u0126\3\2\2\2I\u0129\3\2\2\2K\u012c\3\2"+
		"\2\2M\u012f\3\2\2\2O\u0132\3\2\2\2Q\u0134\3\2\2\2S\u0136\3\2\2\2U\u0138"+
		"\3\2\2\2W\u013a\3\2\2\2Y\u013c\3\2\2\2[\u013f\3\2\2\2]\u0144\3\2\2\2_"+
		"\u014d\3\2\2\2a\u0151\3\2\2\2c\u015a\3\2\2\2e\u0164\3\2\2\2g\u016a\3\2"+
		"\2\2i\u0178\3\2\2\2kl\7\"\2\2lm\3\2\2\2mn\b\2\2\2n\4\3\2\2\2op\7\13\2"+
		"\2pq\3\2\2\2qr\b\3\2\2r\6\3\2\2\2su\7\17\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2"+
		"\2\2vw\7\f\2\2wx\3\2\2\2xy\b\4\2\2y\b\3\2\2\2z{\t\2\2\2{\n\3\2\2\2|}\t"+
		"\3\2\2}\f\3\2\2\2~\177\7P\2\2\177\u0080\7W\2\2\u0080\u0081\7O\2\2\u0081"+
		"\16\3\2\2\2\u0082\u0083\7N\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7I\2\2\u0085"+
		"\20\3\2\2\2\u0086\u0087\7U\2\2\u0087\u0088\7G\2\2\u0088\u0089\7S\2\2\u0089"+
		"\22\3\2\2\2\u008a\u008b\7R\2\2\u008b\u008c\7T\2\2\u008c\u008d\7Q\2\2\u008d"+
		"\u008e\7I\2\2\u008e\u008f\7T\2\2\u008f\u0090\7C\2\2\u0090\u0091\7O\2\2"+
		"\u0091\u0092\7C\2\2\u0092\24\3\2\2\2\u0093\u0094\7X\2\2\u0094\u0095\7"+
		"C\2\2\u0095\u0096\7T\2\2\u0096\u0097\7K\2\2\u0097\u0098\7C\2\2\u0098\u0099"+
		"\7D\2\2\u0099\u009a\7N\2\2\u009a\u009b\7G\2\2\u009b\u009c\7U\2\2\u009c"+
		"\26\3\2\2\2\u009d\u009e\7U\2\2\u009e\u009f\7W\2\2\u009f\u00a0\7D\2\2\u00a0"+
		"\u00a1\7R\2\2\u00a1\u00a2\7T\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7I\2\2"+
		"\u00a4\u00a5\7T\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7O\2\2\u00a7\u00a8"+
		"\7C\2\2\u00a8\u00a9\7U\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7H\2\2\u00ab\u00ac"+
		"\7W\2\2\u00ac\u00ad\7P\2\2\u00ad\u00ae\7E\2\2\u00ae\u00af\7K\2\2\u00af"+
		"\u00b0\7Q\2\2\u00b0\u00b1\7P\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7H\2\2\u00b3"+
		"\u00b4\7H\2\2\u00b4\u00b5\7W\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b7\7E\2\2"+
		"\u00b7\u00b8\7K\2\2\u00b8\u00b9\7Q\2\2\u00b9\u00ba\7P\2\2\u00ba\34\3\2"+
		"\2\2\u00bb\u00bc\7R\2\2\u00bc\u00bd\7T\2\2\u00bd\u00be\7Q\2\2\u00be\u00bf"+
		"\7E\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2\7K\2\2\u00c2"+
		"\u00c3\7O\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7P\2\2"+
		"\u00c6\u00c7\7V\2\2\u00c7\u00c8\7Q\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7"+
		"H\2\2\u00ca\u00cb\7R\2\2\u00cb\u00cc\7T\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce"+
		"\7E\2\2\u00ce\u00cf\7G\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d1\7K\2\2\u00d1"+
		"\u00d2\7O\2\2\u00d2\u00d3\7K\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5\7P\2\2"+
		"\u00d5\u00d6\7V\2\2\u00d6\u00d7\7Q\2\2\u00d7 \3\2\2\2\u00d8\u00d9\7K\2"+
		"\2\u00d9\u00da\7P\2\2\u00da\u00db\7U\2\2\u00db\u00dc\7V\2\2\u00dc\u00dd"+
		"\7T\2\2\u00dd\u00de\7W\2\2\u00de\u00df\7E\2\2\u00df\u00e0\7E\2\2\u00e0"+
		"\u00e1\7K\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7G\2\2"+
		"\u00e4\u00e5\7U\2\2\u00e5\"\3\2\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7q"+
		"\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7t\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7c\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7f\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7x\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7V\2\2\u00fb"+
		"*\3\2\2\2\u00fc\u00fd\7H\2\2\u00fd,\3\2\2\2\u00fe\u0100\7/\2\2\u00ff\u00fe"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u0103\5\t\5\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105.\3\2\2\2\u0106\u010b\5\13\6\2\u0107\u010a\5\13\6\2\u0108\u010a"+
		"\5\t\5\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\60\3\2\2\2\u010d\u010b\3\2\2"+
		"\2\u010e\u010f\7*\2\2\u010f\62\3\2\2\2\u0110\u0111\7+\2\2\u0111\64\3\2"+
		"\2\2\u0112\u0113\7]\2\2\u0113\66\3\2\2\2\u0114\u0115\7_\2\2\u01158\3\2"+
		"\2\2\u0116\u0117\7=\2\2\u0117:\3\2\2\2\u0118\u0119\7.\2\2\u0119<\3\2\2"+
		"\2\u011a\u011b\7?\2\2\u011b>\3\2\2\2\u011c\u011d\7@\2\2\u011d@\3\2\2\2"+
		"\u011e\u011f\7>\2\2\u011fB\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122\7?\2"+
		"\2\u0122D\3\2\2\2\u0123\u0124\7#\2\2\u0124\u0125\7?\2\2\u0125F\3\2\2\2"+
		"\u0126\u0127\7>\2\2\u0127\u0128\7?\2\2\u0128H\3\2\2\2\u0129\u012a\7@\2"+
		"\2\u012a\u012b\7?\2\2\u012bJ\3\2\2\2\u012c\u012d\7(\2\2\u012d\u012e\7"+
		"(\2\2\u012eL\3\2\2\2\u012f\u0130\7~\2\2\u0130\u0131\7~\2\2\u0131N\3\2"+
		"\2\2\u0132\u0133\7#\2\2\u0133P\3\2\2\2\u0134\u0135\7-\2\2\u0135R\3\2\2"+
		"\2\u0136\u0137\7/\2\2\u0137T\3\2\2\2\u0138\u0139\7,\2\2\u0139V\3\2\2\2"+
		"\u013a\u013b\7\61\2\2\u013bX\3\2\2\2\u013c\u013d\7u\2\2\u013d\u013e\7"+
		"k\2\2\u013eZ\3\2\2\2\u013f\u0140\7u\2\2\u0140\u0141\7k\2\2\u0141\u0142"+
		"\7p\2\2\u0142\u0143\7q\2\2\u0143\\\3\2\2\2\u0144\u0145\7g\2\2\u0145\u0146"+
		"\7p\2\2\u0146\u0147\7v\2\2\u0147\u0148\7q\2\2\u0148\u0149\7p\2\2\u0149"+
		"\u014a\7e\2\2\u014a\u014b\7g\2\2\u014b\u014c\7u\2\2\u014c^\3\2\2\2\u014d"+
		"\u014e\7h\2\2\u014e\u014f\7u\2\2\u014f\u0150\7k\2\2\u0150`\3\2\2\2\u0151"+
		"\u0152\7o\2\2\u0152\u0153\7k\2\2\u0153\u0154\7g\2\2\u0154\u0155\7p\2\2"+
		"\u0155\u0156\7v\2\2\u0156\u0157\7t\2\2\u0157\u0158\7c\2\2\u0158\u0159"+
		"\7u\2\2\u0159b\3\2\2\2\u015a\u015b\7h\2\2\u015b\u015c\7o\2\2\u015c\u015d"+
		"\7k\2\2\u015d\u015e\7g\2\2\u015e\u015f\7p\2\2\u015f\u0160\7v\2\2\u0160"+
		"\u0161\7t\2\2\u0161\u0162\7c\2\2\u0162\u0163\7u\2\2\u0163d\3\2\2\2\u0164"+
		"\u0165\7j\2\2\u0165\u0166\7c\2\2\u0166\u0167\7e\2\2\u0167\u0168\7g\2\2"+
		"\u0168\u0169\7t\2\2\u0169f\3\2\2\2\u016a\u016b\7\61\2\2\u016b\u016c\7"+
		",\2\2\u016c\u0170\3\2\2\2\u016d\u016f\13\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7,\2\2\u0174\u0175\7\61\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\b\64\2\2\u0177h\3\2\2\2\u0178\u0179\7\61\2"+
		"\2\u0179\u017a\7\61\2\2\u017a\u017e\3\2\2\2\u017b\u017d\13\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017f\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\5\7\4\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\b\65\2\2\u0184j\3\2\2\2\n\2t\u00ff\u0104\u0109"+
		"\u010b\u0170\u017e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}