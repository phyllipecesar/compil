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
		// *
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

	public class SIGNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SIGN");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPlusSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//SIGN:
		//	"+" | "-";
		public ParserRule getRule() { return rule; }

		//"+" | "-"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"+"
		public Keyword getPlusSignKeyword_0() { return cPlusSignKeyword_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
	}

	public class TokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Token");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPPNUMBERTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPPOPorPUNCTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//// LEX.TOKEN
		//Token: //		LITERAL |
		//	PPNUMBER | KEYWORD | PPOPorPUNC;
		public ParserRule getRule() { return rule; }

		////		LITERAL |
		//PPNUMBER | KEYWORD | PPOPorPUNC
		public Alternatives getAlternatives() { return cAlternatives; }

		////		LITERAL |
		//PPNUMBER
		public RuleCall getPPNUMBERTerminalRuleCall_0() { return cPPNUMBERTerminalRuleCall_0; }

		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_1() { return cKEYWORDTerminalRuleCall_1; }

		//PPOPorPUNC
		public RuleCall getPPOPorPUNCTerminalRuleCall_2() { return cPPOPorPUNCTerminalRuleCall_2; }
	}
	
	
	private ModelElements pModel;
	private GreetingElements pGreeting;
	private SIGNElements pSIGN;
	private TerminalRule tIntegerliteral;
	private TokenElements pToken;
	private TerminalRule tPPNUMBER;
	private TerminalRule tLITERAL;
	private TerminalRule tKEYWORD;
	private TerminalRule tPPOPorPUNC;
	private TerminalRule tIDENTIFIER;
	
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
	// *
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

	//SIGN:
	//	"+" | "-";
	public SIGNElements getSIGNAccess() {
		return (pSIGN != null) ? pSIGN : (pSIGN = new SIGNElements());
	}
	
	public ParserRule getSIGNRule() {
		return getSIGNAccess().getRule();
	}

	//// lex.charset
	//// lex.icon
	//terminal integerliteral:
	//	"1".."9" "0".."9"* (("u" | "U") ("l" | "L" | "ll" | "LL")? | ("l" | "L" | "ll" | "LL") ("u" | "U")?)? | "0" "0".."7"*
	//	(("u" | "U") ("l" | "L" | "ll" | "LL")? | ("l" | "L" | "ll" | "LL") ("u" | "U")?)? | ("0x" | "0X") ("0".."9" |
	//	"a".."f" | "A".."F")+ (("u" | "U") ("l" | "L" | "ll" | "LL")? | ("l" | "L" | "ll" | "LL") ("u" | "U")?)?;
	public TerminalRule getIntegerliteralRule() {
		return (tIntegerliteral != null) ? tIntegerliteral : (tIntegerliteral = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "integerliteral"));
	} 

	//// LEX.TOKEN
	//Token: //		LITERAL |
	//	PPNUMBER | KEYWORD | PPOPorPUNC;
	public TokenElements getTokenAccess() {
		return (pToken != null) ? pToken : (pToken = new TokenElements());
	}
	
	public ParserRule getTokenRule() {
		return getTokenAccess().getRule();
	}

	//// LEX.PPNUMBER === LEFT RECURSION REMOVED
	//terminal PPNUMBER:
	//	("0".."9" | "." "0".."9") ("0".."9" | ("a".."z" | "A".."Z" | "_") | "e" ("+" | "-") | "E" ("+" | "-") | ".")*;
	public TerminalRule getPPNUMBERRule() {
		return (tPPNUMBER != null) ? tPPNUMBER : (tPPNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PPNUMBER"));
	} 

	//// LEX _ NAME === LEFT RECURSION REMOVED
	//terminal LITERAL:
	//	integerliteral;
	public TerminalRule getLITERALRule() {
		return (tLITERAL != null) ? tLITERAL : (tLITERAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LITERAL"));
	} 

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

	//terminal IDENTIFIER:
	//	("a".."z" | "A".."Z" | "_") ("0".."9" | "A".."Z" | "a".."z" | "_")*;
	public TerminalRule getIDENTIFIERRule() {
		return (tIDENTIFIER != null) ? tIDENTIFIER : (tIDENTIFIER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IDENTIFIER"));
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
