/*
* generated by Xtext
*/
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cGreetingsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGreetingsTokenParserRuleCall_0 = (RuleCall)cGreetingsAssignment.eContents().get(0);
		
		/// *
		// * SO FAR
		// * 
		// * LEX.PPNUMBER     [OK]
		// * LEX.NAME         [OK]
		// * LEX.KEY          [OK]
		// * LEX.OPERATORS    [OK]
		// * Lex.Token        [OK]
		// * / Model:
		//	greetings+=Token;
		public ParserRule getRule() { return rule; }

		//greetings+=Token
		public Assignment getGreetingsAssignment() { return cGreetingsAssignment; }

		//Token
		public RuleCall getGreetingsTokenParserRuleCall_0() { return cGreetingsTokenParserRuleCall_0; }
	}

	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHelloKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Greeting:
		//	"Hello" name=ID "!";
		public ParserRule getRule() { return rule; }

		//"Hello" name=ID "!"
		public Group getGroup() { return cGroup; }

		//"Hello"
		public Keyword getHelloKeyword_0() { return cHelloKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"!"
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
	}

	public class HexquadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hexquad");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cHEXADECIMALDIGITTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cHEXADECIMALDIGITTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cHEXADECIMALDIGITTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cHEXADECIMALDIGITTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//// lex.charset
		//hexquad:
		//	HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT;
		public ParserRule getRule() { return rule; }

		//HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT
		public Group getGroup() { return cGroup; }

		//HEXADECIMALDIGIT
		public RuleCall getHEXADECIMALDIGITTerminalRuleCall_0() { return cHEXADECIMALDIGITTerminalRuleCall_0; }

		//HEXADECIMALDIGIT
		public RuleCall getHEXADECIMALDIGITTerminalRuleCall_1() { return cHEXADECIMALDIGITTerminalRuleCall_1; }

		//HEXADECIMALDIGIT
		public RuleCall getHEXADECIMALDIGITTerminalRuleCall_2() { return cHEXADECIMALDIGITTerminalRuleCall_2; }

		//HEXADECIMALDIGIT
		public RuleCall getHEXADECIMALDIGITTerminalRuleCall_3() { return cHEXADECIMALDIGITTerminalRuleCall_3; }
	}

	public class OctalliteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "octalliteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDigitZeroKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cOCTALDIGITTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//// lex.icon
		//octalliteral:
		//	"0" OCTALDIGIT*;
		public ParserRule getRule() { return rule; }

		//"0" OCTALDIGIT*
		public Group getGroup() { return cGroup; }

		//"0"
		public Keyword getDigitZeroKeyword_0() { return cDigitZeroKeyword_0; }

		//OCTALDIGIT*
		public RuleCall getOCTALDIGITTerminalRuleCall_1() { return cOCTALDIGITTerminalRuleCall_1; }
	}

	public class HexadecimalliteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hexadecimalliteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cXKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cXKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final RuleCall cHEXADECIMALDIGITTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//hexadecimalliteral:
		//	("0x" | "0X") HEXADECIMALDIGIT+;
		public ParserRule getRule() { return rule; }

		//("0x" | "0X") HEXADECIMALDIGIT+
		public Group getGroup() { return cGroup; }

		//"0x" | "0X"
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"0x"
		public Keyword getXKeyword_0_0() { return cXKeyword_0_0; }

		//"0X"
		public Keyword getXKeyword_0_1() { return cXKeyword_0_1; }

		//HEXADECIMALDIGIT+
		public RuleCall getHEXADECIMALDIGITTerminalRuleCall_1() { return cHEXADECIMALDIGITTerminalRuleCall_1; }
	}

	public class IntegersuffixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "integersuffix");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final RuleCall cUNSIGNEDSUFFIXTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final RuleCall cLONGSUFFIXTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cUNSIGNEDSUFFIXTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cLONGLONGSUFFIXTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cLONGSUFFIXTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cUNSIGNEDSUFFIXTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final RuleCall cLONGLONGSUFFIXTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final RuleCall cUNSIGNEDSUFFIXTerminalRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		
		//integersuffix:
		//	UNSIGNEDSUFFIX LONGSUFFIX? | UNSIGNEDSUFFIX LONGLONGSUFFIX? | LONGSUFFIX UNSIGNEDSUFFIX? | LONGLONGSUFFIX
		//	UNSIGNEDSUFFIX?;
		public ParserRule getRule() { return rule; }

		//UNSIGNEDSUFFIX LONGSUFFIX? | UNSIGNEDSUFFIX LONGLONGSUFFIX? | LONGSUFFIX UNSIGNEDSUFFIX? | LONGLONGSUFFIX
		//UNSIGNEDSUFFIX?
		public Alternatives getAlternatives() { return cAlternatives; }

		//UNSIGNEDSUFFIX LONGSUFFIX?
		public Group getGroup_0() { return cGroup_0; }

		//UNSIGNEDSUFFIX
		public RuleCall getUNSIGNEDSUFFIXTerminalRuleCall_0_0() { return cUNSIGNEDSUFFIXTerminalRuleCall_0_0; }

		//LONGSUFFIX?
		public RuleCall getLONGSUFFIXTerminalRuleCall_0_1() { return cLONGSUFFIXTerminalRuleCall_0_1; }

		//UNSIGNEDSUFFIX LONGLONGSUFFIX?
		public Group getGroup_1() { return cGroup_1; }

		//UNSIGNEDSUFFIX
		public RuleCall getUNSIGNEDSUFFIXTerminalRuleCall_1_0() { return cUNSIGNEDSUFFIXTerminalRuleCall_1_0; }

		//LONGLONGSUFFIX?
		public RuleCall getLONGLONGSUFFIXTerminalRuleCall_1_1() { return cLONGLONGSUFFIXTerminalRuleCall_1_1; }

		//LONGSUFFIX UNSIGNEDSUFFIX?
		public Group getGroup_2() { return cGroup_2; }

		//LONGSUFFIX
		public RuleCall getLONGSUFFIXTerminalRuleCall_2_0() { return cLONGSUFFIXTerminalRuleCall_2_0; }

		//UNSIGNEDSUFFIX?
		public RuleCall getUNSIGNEDSUFFIXTerminalRuleCall_2_1() { return cUNSIGNEDSUFFIXTerminalRuleCall_2_1; }

		//LONGLONGSUFFIX UNSIGNEDSUFFIX?
		public Group getGroup_3() { return cGroup_3; }

		//LONGLONGSUFFIX
		public RuleCall getLONGLONGSUFFIXTerminalRuleCall_3_0() { return cLONGLONGSUFFIXTerminalRuleCall_3_0; }

		//UNSIGNEDSUFFIX?
		public RuleCall getUNSIGNEDSUFFIXTerminalRuleCall_3_1() { return cUNSIGNEDSUFFIXTerminalRuleCall_3_1; }
	}

	public class TokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Token");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIdentifierTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPPOPorPUNCTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//// LEX.TOKEN
		//Token:
		//	Identifier | KEYWORD | //	Literal |
		//	PPOPorPUNC;
		public ParserRule getRule() { return rule; }

		//Identifier | KEYWORD | //	Literal |
		//PPOPorPUNC
		public Alternatives getAlternatives() { return cAlternatives; }

		//Identifier
		public RuleCall getIdentifierTerminalRuleCall_0() { return cIdentifierTerminalRuleCall_0; }

		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_1() { return cKEYWORDTerminalRuleCall_1; }

		////	Literal |
		//PPOPorPUNC
		public RuleCall getPPOPorPUNCTerminalRuleCall_2() { return cPPOPorPUNCTerminalRuleCall_2; }
	}
	
	
	private ModelElements pModel;
	private GreetingElements pGreeting;
	private TerminalRule tSIGN;
	private HexquadElements pHexquad;
	private OctalliteralElements pOctalliteral;
	private HexadecimalliteralElements pHexadecimalliteral;
	private TerminalRule tNONZERODIGIT;
	private TerminalRule tOCTALDIGIT;
	private TerminalRule tHEXADECIMALDIGIT;
	private IntegersuffixElements pIntegersuffix;
	private TerminalRule tUNSIGNEDSUFFIX;
	private TerminalRule tLONGSUFFIX;
	private TerminalRule tLONGLONGSUFFIX;
	private TokenElements pToken;
	private TerminalRule tPpnumber;
	private TerminalRule tKEYWORD;
	private TerminalRule tPPOPorPUNC;
	private TerminalRule tIdentifier;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// *
	// * SO FAR
	// * 
	// * LEX.PPNUMBER     [OK]
	// * LEX.NAME         [OK]
	// * LEX.KEY          [OK]
	// * LEX.OPERATORS    [OK]
	// * Lex.Token        [OK]
	// * / Model:
	//	greetings+=Token;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Greeting:
	//	"Hello" name=ID "!";
	public GreetingElements getGreetingAccess() {
		return (pGreeting != null) ? pGreeting : (pGreeting = new GreetingElements());
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}

	//terminal SIGN:
	//	"+" | "-";
	public TerminalRule getSIGNRule() {
		return (tSIGN != null) ? tSIGN : (tSIGN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SIGN"));
	} 

	//// lex.charset
	//hexquad:
	//	HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT;
	public HexquadElements getHexquadAccess() {
		return (pHexquad != null) ? pHexquad : (pHexquad = new HexquadElements());
	}
	
	public ParserRule getHexquadRule() {
		return getHexquadAccess().getRule();
	}

	//// lex.icon
	//octalliteral:
	//	"0" OCTALDIGIT*;
	public OctalliteralElements getOctalliteralAccess() {
		return (pOctalliteral != null) ? pOctalliteral : (pOctalliteral = new OctalliteralElements());
	}
	
	public ParserRule getOctalliteralRule() {
		return getOctalliteralAccess().getRule();
	}

	//hexadecimalliteral:
	//	("0x" | "0X") HEXADECIMALDIGIT+;
	public HexadecimalliteralElements getHexadecimalliteralAccess() {
		return (pHexadecimalliteral != null) ? pHexadecimalliteral : (pHexadecimalliteral = new HexadecimalliteralElements());
	}
	
	public ParserRule getHexadecimalliteralRule() {
		return getHexadecimalliteralAccess().getRule();
	}

	//terminal NONZERODIGIT:
	//	"1".."9";
	public TerminalRule getNONZERODIGITRule() {
		return (tNONZERODIGIT != null) ? tNONZERODIGIT : (tNONZERODIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NONZERODIGIT"));
	} 

	//terminal OCTALDIGIT:
	//	"0".."7";
	public TerminalRule getOCTALDIGITRule() {
		return (tOCTALDIGIT != null) ? tOCTALDIGIT : (tOCTALDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "OCTALDIGIT"));
	} 

	//terminal HEXADECIMALDIGIT:
	//	"0".."9" | "a".."f" | "A".."F";
	public TerminalRule getHEXADECIMALDIGITRule() {
		return (tHEXADECIMALDIGIT != null) ? tHEXADECIMALDIGIT : (tHEXADECIMALDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "HEXADECIMALDIGIT"));
	} 

	//integersuffix:
	//	UNSIGNEDSUFFIX LONGSUFFIX? | UNSIGNEDSUFFIX LONGLONGSUFFIX? | LONGSUFFIX UNSIGNEDSUFFIX? | LONGLONGSUFFIX
	//	UNSIGNEDSUFFIX?;
	public IntegersuffixElements getIntegersuffixAccess() {
		return (pIntegersuffix != null) ? pIntegersuffix : (pIntegersuffix = new IntegersuffixElements());
	}
	
	public ParserRule getIntegersuffixRule() {
		return getIntegersuffixAccess().getRule();
	}

	//terminal UNSIGNEDSUFFIX:
	//	"u" | "U";
	public TerminalRule getUNSIGNEDSUFFIXRule() {
		return (tUNSIGNEDSUFFIX != null) ? tUNSIGNEDSUFFIX : (tUNSIGNEDSUFFIX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "UNSIGNEDSUFFIX"));
	} 

	//terminal LONGSUFFIX:
	//	"l" | "L";
	public TerminalRule getLONGSUFFIXRule() {
		return (tLONGSUFFIX != null) ? tLONGSUFFIX : (tLONGSUFFIX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LONGSUFFIX"));
	} 

	//terminal LONGLONGSUFFIX:
	//	"ll" | "LL";
	public TerminalRule getLONGLONGSUFFIXRule() {
		return (tLONGLONGSUFFIX != null) ? tLONGLONGSUFFIX : (tLONGLONGSUFFIX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LONGLONGSUFFIX"));
	} 

	//// LEX.TOKEN
	//Token:
	//	Identifier | KEYWORD | //	Literal |
	//	PPOPorPUNC;
	public TokenElements getTokenAccess() {
		return (pToken != null) ? pToken : (pToken = new TokenElements());
	}
	
	public ParserRule getTokenRule() {
		return getTokenAccess().getRule();
	}

	//// LEX.PPNUMBER === LEFT RECURSION REMOVED
	//terminal Ppnumber:
	//	("0".."9" | "." "0".."9") ("0".."9" | ("a".."z" | "A".."Z" | "_") | "e" SIGN | "E" SIGN | ".")*;
	public TerminalRule getPpnumberRule() {
		return (tPpnumber != null) ? tPpnumber : (tPpnumber = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "Ppnumber"));
	} 

	//// LEX _ NAME === LEFT RECURSION REMOVED
	//// LEX.KEY
	//terminal KEYWORD:
	//	"alignas" | "alignof" | "asm" | "auto" | "bool" | "break" | "case" | "catch" | "char" | "char16_t" | "char32_t" |
	//	"class" | "const" | "constexpr" | "const_cast" | "continue" | "decltype" | "default" | "delete" | "do" | "double" |
	//	"dynamic_cast" | "else" | "enum" | "explicit" | "export" | "extern" | "false" | "float" | "for" | "friend" | "goto" |
	//	"if" | "inline" | "int" | "long" | "mutable" | "namespace" | "new" | "noexcept" | "nullptr" | "operator" | "private" |
	//	"protected" | "public" | "register" | "reinterpret_cast" | "return" | "short" | "signed" | "sizeof" | "static" |
	//	"static_assert" | "static_cast" | "struct" | "switch" | "template" | "this" | "thread_local" | "throw" | "true" |
	//	"try" | "typedef" | "typeid" | "typename" | "union" | "unsigned" | "using" | "virtual" | "void" | "volatile" |
	//	"wchar_t" | "while";
	public TerminalRule getKEYWORDRule() {
		return (tKEYWORD != null) ? tKEYWORD : (tKEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "KEYWORD"));
	} 

	//// LEX.OPERATORS
	//// TODO(rigelbm): operator-token and punctuator
	//terminal PPOPorPUNC:
	//	"{" | "}" | "[" | "]" | "#" | "##" | "(" | ")" | "<:" | ":>" | "<%" | "%>" | "%:" | "%:%:" | ";" | ":" | "..." | "new"
	//	| "delete" | "?" | "::" | "." | ".*" | "+" | "-" | "*" | "/" | "%" | "^" | "&" | "|" | "~" | "!" | "=" | "<" | ">" |
	//	"+=" | "-=" | "*=" | "/=" | "%=" | "^=" | "&=" | "|=" | "<<" | ">>" | "<<=" | ">>=" | "==" | "!=" | "<=" | ">=" | "&&"
	//	| "||" | "++" | "--" | "," | "->*" | "->" | "and" | "and_eq" | "bitand" | "bitor" | "compl" | "not" | "not_eq" | "or"
	//	| "or_eq" | "xor" | "xor_eq";
	public TerminalRule getPPOPorPUNCRule() {
		return (tPPOPorPUNC != null) ? tPPOPorPUNC : (tPPOPorPUNC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PPOPorPUNC"));
	} 

	//terminal Identifier:
	//	("a".."z" | "A".."Z" | "_") ("0".."9" | "A".."Z" | "a".."z" | "_")*;
	public TerminalRule getIdentifierRule() {
		return (tIdentifier != null) ? tIdentifier : (tIdentifier = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "Identifier"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
