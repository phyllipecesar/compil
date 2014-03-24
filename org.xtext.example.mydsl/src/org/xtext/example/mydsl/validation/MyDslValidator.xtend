/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import java.util.ArrayList
import java.util.Iterator
import java.*
import java.util.TreeSet
import java.util.List
import org.eclipse.xtext.validation.Check
import java.util.HashSet
import java.util.HashMap
import org.xtext.example.mydsl.myDsl.block_declaration
import org.xtext.example.mydsl.myDsl.Body
import org.xtext.example.mydsl.myDsl.FunctionDeclaration
import org.xtext.example.mydsl.myDsl.Parameter
import org.xtext.example.mydsl.myDsl.Return
import org.antlr.misc.Utils
import org.xtext.example.mydsl.myDsl.Declaration
import org.xtext.example.mydsl.myDsl.VarDecl
import org.xtext.example.mydsl.myDsl.NoPtrStatement
import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl.myDsl.Variable
import org.xtext.example.mydsl.myDsl.IntType
import org.xtext.example.mydsl.myDsl.BooleanhType
import org.xtext.example.mydsl.myDsl.StringhType
import org.xtext.example.mydsl.myDsl.FunctionChamada
import org.xtext.example.mydsl.myDsl.ReturnExpr
import org.xtext.example.mydsl.myDsl.FunctionType
import org.xtext.example.mydsl.myDsl.NoPtrExpression
import org.xtext.example.mydsl.myDsl.Atomic
import org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression

import org.xtext.example.mydsl.myDsl.NoPtrSelect
import org.xtext.example.mydsl.myDsl.NoPtrCases
import org.xtext.example.mydsl.myDsl.DefaultCase
import org.xtext.example.mydsl.myDsl.CaseNormal
import org.xtext.example.mydsl.myDsl.NoPtrMudanca

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
	HashSet<String> hash = new HashSet<String>();


/**
 * Verifica se os parametros sao declarados duas vezes com o mesmo nome
 * e se existe alguma variavel com o mesmo nome dos parametros.
 */
@Check
def checkParamsFunction(FunctionDeclaration funcao) {
	hash.clear();
	for (Parameter symbol: funcao.params) {
			val nome = symbol.name;
			if (hash.contains(nome)) {
				error("Parameter '" + symbol.type.sts.name + " " + nome + "' already exists", symbol, null, -1);
			}
			hash.add(nome);
	}
	for (VarDecl variavel: funcao.escopo.variaveis) {
		val nome = variavel.name;
		if (hash.contains(nome)) {
			error("declaration of variable '" + nome + "' shadows a paramater", variavel, null, -1);
			
		}
	}
}
String row;
int ok;
@Check
def checkFunctionAlreadyExists(Body b) {
	hash.clear();
	var row2 = "";
	for (Declaration symbol: b.declarations) {
		try {
		if (symbol.funcao.name != "null") {
			row = symbol.funcao.name + "(";
			ok = 0;
			row2 = row;
			for (Parameter symb : symbol.funcao.params) {
				if (ok == 1) row = row + ",";
				ok = 1;
				var v = symb.type.sts.name;
				if (v.equals("bool")) {
					v = "int";
				}
				row2 = row2 + symb.type.sts.name;
				row = row + v;
			}
			row = row + ")";
			row2 = row2 + ")";
			if (hash.contains(row)) {
				error("Function '" +  row2 + "' already exists", symbol.funcao, null, -1);
			}
			hash.add(row);
		}
	} catch (Exception e) {
		
	}
	}
}



boolean funcaoExiste = false;
EObject rt;
@Check
def checkReturnOnlyOnFunction(Return r) {
	funcaoExiste = false;
	rt = 	r.eContainer;
	while (rt != null) {
		if (rt instanceof FunctionDeclaration) {
			funcaoExiste = true;
		}	
		rt = rt.eContainer;
	}
	if (funcaoExiste == false) {
			error( "return can only be used inside of functions", r, null, -1);
	}
	
}

int t_v;
@Check
def checkSwitchDefaults(NoPtrSelect s) {
	t_v = 0;
	for (NoPtrCases c : s.cases) {
		if (c instanceof DefaultCase) {
			t_v = t_v + 1;
			if (t_v >= 2) {
				error("A switch must only at most one 'default'.", c, null, -1);	
			}
		}
	}		
}
@Check
def checkSwitchCases(NoPtrSelect s) {
	val tipo = getExpressionType(s.expr);
	for (NoPtrCases c : s.cases) {
		if (c instanceof CaseNormal) {
			val tipo2 = getExpressionType(c.expr)
			if (!isSameType(tipo2, tipo)) {
				error ("A case rule should have the same type as the switch, expected '" + tipo + "' found '" + tipo2 + "'", c, null, -1);
			}
		}
	}
		
}
EObject rt2;
EObject rt4;
Variable v;
FunctionDeclaration rt3;
String tipoCRT;
String tipoCRT2;
@Check
def checkReturnTypeFunction(Return r) {
	rt2 = 	r.eContainer;
	if (r.rettype instanceof NoPtrExpression) {
	val tipo = getExpressionType(r.rettype);
	while (rt2 != null) {
		if (rt2 instanceof FunctionDeclaration) {
			tipoCRT = tipo;
			tipoCRT2 = rt2.type.sts.name;
			if (tipoCRT2.equals("void")) {
				error("A 'void' function should not have a return", r, null, -1);
			}
			else if (tipoCRT.equals("No Type Found")) {
				error("Your variable was not declared, neither is an argument.", r, null, -1);
			}
			else if (!isSameType(tipoCRT2, tipoCRT)) {
				error("Return type mismatch, expected '" + tipoCRT2 + "' found '" + tipoCRT + "'.", r, null, -1);
			}
			
		}	
		rt2 = rt2.eContainer;
	}
	}
}
@Check
def checkVariableAlreadyExists(NoPtrStatement st) {
		hash.clear();
		for (VarDecl variavel : st.variaveis) {
			val nome = variavel.name;
			if (hash.contains(nome)) {
				error("Variable '" + nome + "' already exists", variavel, null, -1);
			}
			hash.add(nome);
		}	
	
}


def String getFuncaoTipo(FunctionType f) {
	return checkCallFunction(f.call);

}


def getMudanca(NoPtrMudanca mudanca) {
		ret2 = mudanca;
		while (!(ret2 instanceof FunctionDeclaration || ret2 instanceof Body)) {
			ret2 = ret2.eContainer;
		}
		
		if (ret2 instanceof FunctionDeclaration) {
			st3 = ret2;
			for (Parameter p: st3.params) {
				if (p.name.equals(mudanca.name)) {
					return p.type.sts.name;
				}
			}
			for (VarDecl v: st3.escopo.variaveis) {
				if (v.name.equals(mudanca.name)) {
					return v.type.sts.name;
				}
			}
		}
		while (!(ret2 instanceof Body)) {
			ret2 = ret2.eContainer;
		}
		
		if (ret2 instanceof Body) {
			st2 = ret2;
			for (Declaration d2: st2.declarations) {
				try {
					if (d2.variaveis.name.equals(mudanca.name)) {
						return d2.variaveis.type.sts.name;				
					}
				} catch(Exception e) {
					
				}
				}
			}
	return "No Type Found";
			
}

@Check
def checkMudanca(NoPtrMudanca mudanca) {
	var tipo = getMudanca(mudanca);
	if (tipo.equals("No Type Found")) {
		error("Variable '" + mudanca.name + "' was not declared", mudanca, null, -1);
	} else if (mudanca.expr != null) {
		var tipo1 = getExpressionType(mudanca.expr);
		if (!isSameType(tipo, tipo1)) {
			error("Variable '" + mudanca.name + "' is from type '" + tipo + "' expression returned '" + tipo1 +"'.", mudanca, null, -1); 
		}
	}
}
def String getExpressionTypeTerminal(NoPtrTerminalExpression expr) {
	if (expr instanceof Atomic) {
		return lookUpType(expr.atomic);
	} else {
		return getExpressionType(expr.inside);
	}
}

@Check
def getExpressionType(NoPtrExpression expr) {
	val g1 = getExpressionTypeTerminal(expr.left);
	// System.out.println("AHA");
	
	if (expr.op instanceof String) {
		val	g2 = getExpressionTypeTerminal(expr.right); 
		if (expr.op.equals('||') || expr.op.equals('&&')) {
			if (!isSameType(g1, "bool") || !isSameType(g2, "bool")) {
				error("A logical operation should be between booleans, found '(" + g1 + "," + g2 +")'", expr, null, -1);
			}
		} else if (!isSameType(g1, g2)
		) {
			error("A comparison should between same types, but found '" + g1 + "' and '" + g2 + "'", expr, null, -1);
		}
		return "bool";
	} else {
		return g1;
		
	}
}
Body st2;

def Boolean isSameType(String a, String b) {
	if (a.equals("int") || a.equals("bool")) {
		return b.equals("int") || b.equals("bool");
	}
	return a.equals(b);
}

FunctionDeclaration st3;
EObject ret2;
def lookUpType(ReturnExpr d)  {
	if (d instanceof IntType) {
		return "int";
	} else if (d instanceof BooleanhType) {
		return "bool";		
	} else if (d instanceof StringhType) {
		return "string";		
	} else if (d instanceof FunctionType) {
		return getFuncaoTipo(d);
	} 
	else if (d instanceof Variable) {
		ret2 = d;
		while (!(ret2 instanceof FunctionDeclaration || ret2 instanceof Body)) {
			ret2 = ret2.eContainer;
		}
		
		if (ret2 instanceof FunctionDeclaration) {
			st3 = ret2;
			for (Parameter p: st3.params) {
				if (p.name.equals(d.name)) {
					return p.type.sts.name;
				}
			}
			for (VarDecl v: st3.escopo.variaveis) {
				if (v.name.equals(d.name)) {
					return v.type.sts.name;
				}
			}
		}
		while (!(ret2 instanceof Body)) {
			ret2 = ret2.eContainer;
		}
		
		if (ret2 instanceof Body) {
			st2 = ret2;
			for (Declaration d2: st2.declarations) {
				try {
					if (d2.variaveis.name.equals(d.name)) {
						return d2.variaveis.type.sts.name;				
					}
				} catch(Exception e) {
					
				}
			}
		}
	}
	return "No Type Found";
}
	

	
boolean ccffound;
String gotmsg;
Body st;
EObject ret;
String auxp;
String fName;
String fName2;
boolean auxp2;
@Check
def checkCallFunction(FunctionChamada f) {
	ccffound = false;
	fName = "";
	ret = f;
	while (!(ret instanceof Body)) {
		ret = ret.eContainer;
	}
	if (ret instanceof Body) st = ret;
	gotmsg = "There is no function '" + f.name + "(";
	fName = f.name + "(";
	for (ReturnExpr d: f.params) {
		if (ccffound) {
			fName = fName + ", ";
			gotmsg = gotmsg +", ";
		}
		ccffound = true;
		auxp = lookUpType(d);
		if (auxp.equals("No Type Found")) {
			error("This variable is not defined", d, null, -1);
			auxp = "Unknown-Type"
		}
		fName = fName + auxp;
		gotmsg = gotmsg + auxp;
	}
	fName = fName + ")";
	gotmsg = gotmsg + ")";
	ccffound = false;
	for (Declaration d: st.declarations) {
		try {
			if (f.name.equals(d.funcao.name)) {
				if (f.params.size == d.funcao.params.size) {
					auxp2 = false;
					fName2 = d.funcao.name + "(";
					for (Parameter p : d.funcao.params) {
						if (auxp2) {
							fName2 = fName2 + ", ";
						}
						auxp2 = true;
						
						fName2 = fName2 + p.type.sts.name;
						
						
					}
					fName2 = fName2 + ")";
					if (fName.equals(fName2)) {
						return d.funcao.type.sts.name;
					
					}
				}
			}
		} catch (Exception e) {
			
		}
	}
	if (!ccffound) {
		error(gotmsg, f, null, -1);
	}
	return "Unknown-Type";
}

@Check
def checkVariableAlreadyExistsBody(Body st) {
		hash.clear();
		for (Declaration variavel : st.declarations) {
			try {
				val nome = variavel.variaveis.name;
			if (hash.contains(nome)) {
				error("Variable '" + nome + "' already exists", variavel.variaveis, null, -1);
			}
			hash.add(nome);
			} catch (Exception e) {
			}
		}	
	
}

}
