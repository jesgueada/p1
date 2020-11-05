// Generated from C:/Users/warbo/IdeaProjects/p1/src\Analex.g4 by ANTLR 4.8
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
		INSTRUCCIONES=14, ASIGNACIONES=15, MOSTRAR=16, RUPTURA=17, DEV=18, CIERTO=19, 
		FALSO=20, NUMERO=21, IDENT=22, PA=23, PC=24, CA=25, CC=26, PyC=27, COMA=28, 
		ASIG=29, DP=30, MAYOR=31, MENOR=32, IGUAL=33, DISTINTO=34, MENORIGUAL=35, 
		MAYORIGUAL=36, CONJUNCION=37, DISYUNCION=38, NEGACION=39, MAS=40, MENOS=41, 
		POR=42, DIV=43, SI=44, SINO=45, ENTONCES=46, FSI=47, MIENTRAS=48, FMIENTRAS=49, 
		HACER=50, COMENTARIO_BLOQUE=51, COMENTARIO_LINEA=52;
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
			"PROCEDIMIENTO", "FPROCEDIMIENTO", "INSTRUCCIONES", "ASIGNACIONES", "MOSTRAR", 
			"RUPTURA", "DEV", "CIERTO", "FALSO", "NUMERO", "IDENT", "PA", "PC", "CA", 
			"CC", "PyC", "COMA", "ASIG", "DP", "MAYOR", "MENOR", "IGUAL", "DISTINTO", 
			"MENORIGUAL", "MAYORIGUAL", "CONJUNCION", "DISYUNCION", "NEGACION", "MAS", 
			"MENOS", "POR", "DIV", "SI", "SINO", "ENTONCES", "FSI", "MIENTRAS", "FMIENTRAS", 
			"HACER", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'NUM'", "'LOG'", "'SEQ'", "'PROGRAMA'", "'VARIABLES'", 
			"'SUBPROGRAMAS'", "'FUNCION'", "'FFUNCION'", "'PROCEDIMIENTO'", "'FPROCEDIMIENTO'", 
			"'INSTRUCCIONES'", "'ASIGNACIONES'", "'mostrar'", "'ruptura'", "'dev'", 
			"'T'", "'F'", null, null, "'('", "')'", "'['", "']'", "';'", "','", "'='", 
			"':'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", 
			"'!'", "'+'", "'-'", "'*'", "'/'", "'si'", "'sino'", "'entonces'", "'fsi'", 
			"'mientras'", "'fmientras'", "'hacer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "NUM", "LOG", "SEQ", "PROGRAMA", 
			"VARIABLES", "SUBPROGRAMAS", "FUNCION", "FFUNCION", "PROCEDIMIENTO", 
			"FPROCEDIMIENTO", "INSTRUCCIONES", "ASIGNACIONES", "MOSTRAR", "RUPTURA", 
			"DEV", "CIERTO", "FALSO", "NUMERO", "IDENT", "PA", "PC", "CA", "CC", 
			"PyC", "COMA", "ASIG", "DP", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "MENORIGUAL", 
			"MAYORIGUAL", "CONJUNCION", "DISYUNCION", "NEGACION", "MAS", "MENOS", 
			"POR", "DIV", "SI", "SINO", "ENTONCES", "FSI", "MIENTRAS", "FMIENTRAS", 
			"HACER", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0198\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\5\4y\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\5\30\u0111\n\30\3\30\6\30\u0114\n\30\r\30\16\30\u0115\3"+
		"\31\3\31\3\31\7\31\u011b\n\31\f\31\16\31\u011e\13\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0182\n\66"+
		"\f\66\16\66\u0185\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7"+
		"\67\u0190\n\67\f\67\16\67\u0193\13\67\3\67\3\67\3\67\3\67\4\u0183\u0191"+
		"\28\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66"+
		"\3\2\4\3\2\62;\4\2C\\c|\2\u019c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\3o\3\2\2\2\5s\3\2\2\2\7x\3\2\2\2\t~\3\2\2\2\13\u0080\3\2\2\2"+
		"\r\u0082\3\2\2\2\17\u0086\3\2\2\2\21\u008a\3\2\2\2\23\u008e\3\2\2\2\25"+
		"\u0097\3\2\2\2\27\u00a1\3\2\2\2\31\u00ae\3\2\2\2\33\u00b6\3\2\2\2\35\u00bf"+
		"\3\2\2\2\37\u00cd\3\2\2\2!\u00dc\3\2\2\2#\u00ea\3\2\2\2%\u00f7\3\2\2\2"+
		"\'\u00ff\3\2\2\2)\u0107\3\2\2\2+\u010b\3\2\2\2-\u010d\3\2\2\2/\u0110\3"+
		"\2\2\2\61\u0117\3\2\2\2\63\u011f\3\2\2\2\65\u0121\3\2\2\2\67\u0123\3\2"+
		"\2\29\u0125\3\2\2\2;\u0127\3\2\2\2=\u0129\3\2\2\2?\u012b\3\2\2\2A\u012d"+
		"\3\2\2\2C\u012f\3\2\2\2E\u0131\3\2\2\2G\u0133\3\2\2\2I\u0136\3\2\2\2K"+
		"\u0139\3\2\2\2M\u013c\3\2\2\2O\u013f\3\2\2\2Q\u0142\3\2\2\2S\u0145\3\2"+
		"\2\2U\u0147\3\2\2\2W\u0149\3\2\2\2Y\u014b\3\2\2\2[\u014d\3\2\2\2]\u014f"+
		"\3\2\2\2_\u0152\3\2\2\2a\u0157\3\2\2\2c\u0160\3\2\2\2e\u0164\3\2\2\2g"+
		"\u016d\3\2\2\2i\u0177\3\2\2\2k\u017d\3\2\2\2m\u018b\3\2\2\2op\7\"\2\2"+
		"pq\3\2\2\2qr\b\2\2\2r\4\3\2\2\2st\7\13\2\2tu\3\2\2\2uv\b\3\2\2v\6\3\2"+
		"\2\2wy\7\17\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\f\2\2{|\3\2\2\2|}\b"+
		"\4\2\2}\b\3\2\2\2~\177\t\2\2\2\177\n\3\2\2\2\u0080\u0081\t\3\2\2\u0081"+
		"\f\3\2\2\2\u0082\u0083\7P\2\2\u0083\u0084\7W\2\2\u0084\u0085\7O\2\2\u0085"+
		"\16\3\2\2\2\u0086\u0087\7N\2\2\u0087\u0088\7Q\2\2\u0088\u0089\7I\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\7U\2\2\u008b\u008c\7G\2\2\u008c\u008d\7S\2\2\u008d"+
		"\22\3\2\2\2\u008e\u008f\7R\2\2\u008f\u0090\7T\2\2\u0090\u0091\7Q\2\2\u0091"+
		"\u0092\7I\2\2\u0092\u0093\7T\2\2\u0093\u0094\7C\2\2\u0094\u0095\7O\2\2"+
		"\u0095\u0096\7C\2\2\u0096\24\3\2\2\2\u0097\u0098\7X\2\2\u0098\u0099\7"+
		"C\2\2\u0099\u009a\7T\2\2\u009a\u009b\7K\2\2\u009b\u009c\7C\2\2\u009c\u009d"+
		"\7D\2\2\u009d\u009e\7N\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7U\2\2\u00a0"+
		"\26\3\2\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a3\7W\2\2\u00a3\u00a4\7D\2\2\u00a4"+
		"\u00a5\7R\2\2\u00a5\u00a6\7T\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7I\2\2"+
		"\u00a8\u00a9\7T\2\2\u00a9\u00aa\7C\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ac"+
		"\7C\2\2\u00ac\u00ad\7U\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7H\2\2\u00af\u00b0"+
		"\7W\2\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7K\2\2\u00b3"+
		"\u00b4\7Q\2\2\u00b4\u00b5\7P\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7H\2\2\u00b7"+
		"\u00b8\7H\2\2\u00b8\u00b9\7W\2\2\u00b9\u00ba\7P\2\2\u00ba\u00bb\7E\2\2"+
		"\u00bb\u00bc\7K\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7P\2\2\u00be\34\3\2"+
		"\2\2\u00bf\u00c0\7R\2\2\u00c0\u00c1\7T\2\2\u00c1\u00c2\7Q\2\2\u00c2\u00c3"+
		"\7E\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7F\2\2\u00c5\u00c6\7K\2\2\u00c6"+
		"\u00c7\7O\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7P\2\2"+
		"\u00ca\u00cb\7V\2\2\u00cb\u00cc\7Q\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7"+
		"H\2\2\u00ce\u00cf\7R\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2"+
		"\7E\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7F\2\2\u00d4\u00d5\7K\2\2\u00d5"+
		"\u00d6\7O\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d8\7G\2\2\u00d8\u00d9\7P\2\2"+
		"\u00d9\u00da\7V\2\2\u00da\u00db\7Q\2\2\u00db \3\2\2\2\u00dc\u00dd\7K\2"+
		"\2\u00dd\u00de\7P\2\2\u00de\u00df\7U\2\2\u00df\u00e0\7V\2\2\u00e0\u00e1"+
		"\7T\2\2\u00e1\u00e2\7W\2\2\u00e2\u00e3\7E\2\2\u00e3\u00e4\7E\2\2\u00e4"+
		"\u00e5\7K\2\2\u00e5\u00e6\7Q\2\2\u00e6\u00e7\7P\2\2\u00e7\u00e8\7G\2\2"+
		"\u00e8\u00e9\7U\2\2\u00e9\"\3\2\2\2\u00ea\u00eb\7C\2\2\u00eb\u00ec\7U"+
		"\2\2\u00ec\u00ed\7K\2\2\u00ed\u00ee\7I\2\2\u00ee\u00ef\7P\2\2\u00ef\u00f0"+
		"\7C\2\2\u00f0\u00f1\7E\2\2\u00f1\u00f2\7K\2\2\u00f2\u00f3\7Q\2\2\u00f3"+
		"\u00f4\7P\2\2\u00f4\u00f5\7G\2\2\u00f5\u00f6\7U\2\2\u00f6$\3\2\2\2\u00f7"+
		"\u00f8\7o\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7v\2\2"+
		"\u00fb\u00fc\7t\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7t\2\2\u00fe&\3\2\2"+
		"\2\u00ff\u0100\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102\7r\2\2\u0102\u0103"+
		"\7v\2\2\u0103\u0104\7w\2\2\u0104\u0105\7t\2\2\u0105\u0106\7c\2\2\u0106"+
		"(\3\2\2\2\u0107\u0108\7f\2\2\u0108\u0109\7g\2\2\u0109\u010a\7x\2\2\u010a"+
		"*\3\2\2\2\u010b\u010c\7V\2\2\u010c,\3\2\2\2\u010d\u010e\7H\2\2\u010e."+
		"\3\2\2\2\u010f\u0111\7/\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0114\5\t\5\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\60\3\2\2\2\u0117\u011c"+
		"\5\13\6\2\u0118\u011b\5\13\6\2\u0119\u011b\5\t\5\2\u011a\u0118\3\2\2\2"+
		"\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\62\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7*\2\2\u0120"+
		"\64\3\2\2\2\u0121\u0122\7+\2\2\u0122\66\3\2\2\2\u0123\u0124\7]\2\2\u0124"+
		"8\3\2\2\2\u0125\u0126\7_\2\2\u0126:\3\2\2\2\u0127\u0128\7=\2\2\u0128<"+
		"\3\2\2\2\u0129\u012a\7.\2\2\u012a>\3\2\2\2\u012b\u012c\7?\2\2\u012c@\3"+
		"\2\2\2\u012d\u012e\7<\2\2\u012eB\3\2\2\2\u012f\u0130\7@\2\2\u0130D\3\2"+
		"\2\2\u0131\u0132\7>\2\2\u0132F\3\2\2\2\u0133\u0134\7?\2\2\u0134\u0135"+
		"\7?\2\2\u0135H\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138\7?\2\2\u0138J\3"+
		"\2\2\2\u0139\u013a\7>\2\2\u013a\u013b\7?\2\2\u013bL\3\2\2\2\u013c\u013d"+
		"\7@\2\2\u013d\u013e\7?\2\2\u013eN\3\2\2\2\u013f\u0140\7(\2\2\u0140\u0141"+
		"\7(\2\2\u0141P\3\2\2\2\u0142\u0143\7~\2\2\u0143\u0144\7~\2\2\u0144R\3"+
		"\2\2\2\u0145\u0146\7#\2\2\u0146T\3\2\2\2\u0147\u0148\7-\2\2\u0148V\3\2"+
		"\2\2\u0149\u014a\7/\2\2\u014aX\3\2\2\2\u014b\u014c\7,\2\2\u014cZ\3\2\2"+
		"\2\u014d\u014e\7\61\2\2\u014e\\\3\2\2\2\u014f\u0150\7u\2\2\u0150\u0151"+
		"\7k\2\2\u0151^\3\2\2\2\u0152\u0153\7u\2\2\u0153\u0154\7k\2\2\u0154\u0155"+
		"\7p\2\2\u0155\u0156\7q\2\2\u0156`\3\2\2\2\u0157\u0158\7g\2\2\u0158\u0159"+
		"\7p\2\2\u0159\u015a\7v\2\2\u015a\u015b\7q\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7e\2\2\u015d\u015e\7g\2\2\u015e\u015f\7u\2\2\u015fb\3\2\2\2\u0160"+
		"\u0161\7h\2\2\u0161\u0162\7u\2\2\u0162\u0163\7k\2\2\u0163d\3\2\2\2\u0164"+
		"\u0165\7o\2\2\u0165\u0166\7k\2\2\u0166\u0167\7g\2\2\u0167\u0168\7p\2\2"+
		"\u0168\u0169\7v\2\2\u0169\u016a\7t\2\2\u016a\u016b\7c\2\2\u016b\u016c"+
		"\7u\2\2\u016cf\3\2\2\2\u016d\u016e\7h\2\2\u016e\u016f\7o\2\2\u016f\u0170"+
		"\7k\2\2\u0170\u0171\7g\2\2\u0171\u0172\7p\2\2\u0172\u0173\7v\2\2\u0173"+
		"\u0174\7t\2\2\u0174\u0175\7c\2\2\u0175\u0176\7u\2\2\u0176h\3\2\2\2\u0177"+
		"\u0178\7j\2\2\u0178\u0179\7c\2\2\u0179\u017a\7e\2\2\u017a\u017b\7g\2\2"+
		"\u017b\u017c\7t\2\2\u017cj\3\2\2\2\u017d\u017e\7\61\2\2\u017e\u017f\7"+
		",\2\2\u017f\u0183\3\2\2\2\u0180\u0182\13\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7,\2\2\u0187\u0188\7\61\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\b\66\2\2\u018al\3\2\2\2\u018b\u018c\7\61\2"+
		"\2\u018c\u018d\7\61\2\2\u018d\u0191\3\2\2\2\u018e\u0190\13\2\2\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u0192\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5\7\4\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\b\67\2\2\u0197n\3\2\2\2\n\2x\u0110\u0115\u011a"+
		"\u011c\u0183\u0191\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}