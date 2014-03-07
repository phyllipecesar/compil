/*
* generated by Xtext
*/
grammar InternalCpp2;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.services.Cpp2GrammarAccess;

}

@parser::members {
 
 	private Cpp2GrammarAccess grammarAccess;
 	
    public void setGrammarAccess(Cpp2GrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleTest
entryRuleTest 
:
{ before(grammarAccess.getTestRule()); }
	 ruleTest
{ after(grammarAccess.getTestRule()); } 
	 EOF 
;

// Rule Test
ruleTest
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTestAccess().getElementsAssignment()); }
(rule__Test__ElementsAssignment)*
{ after(grammarAccess.getTestAccess().getElementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleToken
entryRuleToken 
:
{ before(grammarAccess.getTokenRule()); }
	 ruleToken
{ after(grammarAccess.getTokenRule()); } 
	 EOF 
;

// Rule Token
ruleToken
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTokenAccess().getAlternatives()); }
(rule__Token__Alternatives)
{ after(grammarAccess.getTokenAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLiteral
entryRuleLiteral 
:
{ before(grammarAccess.getLiteralRule()); }
	 ruleLiteral
{ after(grammarAccess.getLiteralRule()); } 
	 EOF 
;

// Rule Literal
ruleLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLiteralAccess().getAlternatives()); }
(rule__Literal__Alternatives)
{ after(grammarAccess.getLiteralAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Token__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); }
	RULE_KEYWORD
{ after(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); }
	ruleLiteral
{ after(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getTokenAccess().getGroup_2()); }
(rule__Token__Group_2__0)
{ after(grammarAccess.getTokenAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
{ after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); }
	RULE_CHARACTER_LITERAL
{ after(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); }
	RULE_FLOATING_LITERAL
{ after(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); }
	RULE_STRING_LITERAL
{ after(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getAlternatives_4()); }
(rule__Literal__Alternatives_4)
{ after(grammarAccess.getLiteralAccess().getAlternatives_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Alternatives_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLiteralAccess().getTrueKeyword_4_0()); }

	'true' 

{ after(grammarAccess.getLiteralAccess().getTrueKeyword_4_0()); }
)

    |(
{ before(grammarAccess.getLiteralAccess().getFalseKeyword_4_1()); }

	'false' 

{ after(grammarAccess.getLiteralAccess().getFalseKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Token__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Token__Group_2__0__Impl
	rule__Token__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Token__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); }
	RULE_PREPROCESSING_OP_OR_PUNC
{ after(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Token__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Token__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Token__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
{ after(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Test__ElementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); }
	ruleToken{ after(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


fragment RULE_HEX_QUAD : RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT;

fragment RULE_UNIVERSAL_CHARACTER_NAME : ('\\u' RULE_HEX_QUAD|'\\U' RULE_HEX_QUAD RULE_HEX_QUAD);

RULE_HEADER_NAME : ('<' RULE_H_CHAR+ '>'|'"' RULE_Q_CHAR+ '"');

fragment RULE_H_CHAR : ~(('\n'|'>'));

fragment RULE_Q_CHAR : ~(('\n'|'"'));

RULE_DIGIT : '0'..'9';

RULE_NONDIGIT : ('a'..'z'|'A'..'Z'|'_');

RULE_KEYWORD : ('alignas'|'alignof'|'asm'|'auto'|'bool'|'break'|'case'|'catch'|'char'|'char16_t'|'char32_t'|'class'|'const'|'constexpr'|'const_cast'|'continue'|'decltype'|'default'|'delete'|'do'|'double'|'dynamic_cast'|'else'|'enum'|'explicit'|'export'|'extern'|'false'|'float'|'for'|'friend'|'goto'|'if'|'inline'|'int'|'long'|'mutable'|'namespace'|'new'|'noexcept'|'nullptr'|'operator'|'private'|'protected'|'public'|'register'|'reinterpret_cast'|'return'|'short'|'signed'|'sizeof'|'static'|'static_assert'|'static_cast'|'struct'|'switch'|'template'|'this'|'thread_local'|'throw'|'true'|'try'|'typedef'|'typeid'|'typename'|'union'|'unsigned'|'using'|'virtual'|'void'|'volatile'|'wchar_t'|'while');

RULE_PREPROCESSING_OP_OR_PUNC : ('{'|'}'|'['|']'|'#'|'##'|'('|')'|'<:'|':>'|'<%'|'%>'|'%:'|'%:%:'|';'|':'|'...'|'new'|'delete'|'?'|'::'|'.'|'.*'|'+'|'-'|'*'|'/'|'%'|'^'|'&'|'|'|'~'|'!'|'='|'<'|'>'|'+='|'-='|'*='|'/='|'%='|'^='|'&='|'|='|'<<'|'>>'|'<<='|'>>='|'=='|'!='|'<='|'>='|'&&'|'||'|'++'|'--'|','|'->*'|'->'|'and'|'and_eq'|'bitand'|'bitor'|'compl'|'not'|'not_eq'|'or'|'or_eq'|'xor'|'xor_eq');

RULE_INT : (RULE_DECIMAL_LITERAL|RULE_OCTAL_LITERAL|RULE_HEXADECIMAL_LITERAL) RULE_INTEGER_SUFFIX?;

fragment RULE_DECIMAL_LITERAL : '1'..'9' RULE_DIGIT*;

fragment RULE_OCTAL_LITERAL : '0' RULE_OCTAL_DIGIT*;

fragment RULE_HEXADECIMAL_LITERAL : ('0x'|'0X') RULE_HEXADECIMAL_DIGIT+;

fragment RULE_OCTAL_DIGIT : '0'..'7';

fragment RULE_HEXADECIMAL_DIGIT : ('0'..'9'|'A'..'F');

fragment RULE_INTEGER_SUFFIX : (('u'|'U') ('l'|'L'|'ll'|'LL')?|('l'|'L'|'ll'|'LL') ('u'|'U')?);

RULE_CHARACTER_LITERAL : ('u'|'U'|'L')? '\'' RULE_C_CHAR+ '\'';

fragment RULE_C_CHAR : (~(('\''|'\\'|'\n'))|RULE_ESCAPE_SEQUENCE|RULE_UNIVERSAL_CHARACTER_NAME);

fragment RULE_ESCAPE_SEQUENCE : (RULE_SIMPLE_ESCAPE_SEQUENCE|RULE_OCTAL_ESCAPE_SEQUENCE|RULE_HEXADECIMAL_ESCAPE_SEQUENCE);

fragment RULE_SIMPLE_ESCAPE_SEQUENCE : '\\' ('\''|'"'|'?'|'\\'|'a'|'b'|'f'|'n'|'r'|'t'|'v');

fragment RULE_OCTAL_ESCAPE_SEQUENCE : '\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT;

fragment RULE_HEXADECIMAL_ESCAPE_SEQUENCE : '\\x' RULE_HEXADECIMAL_DIGIT+;

RULE_FLOATING_LITERAL : (RULE_FRACTIONAL_CONSTANT RULE_EXPONENT_PART?|RULE_DIGIT+ RULE_EXPONENT_PART) ('f'|'l'|'F'|'L')?;

fragment RULE_FRACTIONAL_CONSTANT : (RULE_DIGIT* '.' RULE_DIGIT+|RULE_DIGIT+ '.');

fragment RULE_EXPONENT_PART : ('e'|'E') ('+'|'-')? RULE_DIGIT+;

RULE_STRING_LITERAL : RULE_ENC_PREFIX? '"' RULE_SCHAR+ '"';

fragment RULE_ENC_PREFIX : ('u8'|'u'|'U'|'L');

fragment RULE_SCHAR : (~(('"'|'\\'|'\n'))|RULE_ESCAPE_SEQUENCE|RULE_UNIVERSAL_CHARACTER_NAME);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


