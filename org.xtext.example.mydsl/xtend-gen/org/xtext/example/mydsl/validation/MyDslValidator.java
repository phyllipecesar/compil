/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.example.mydsl.myDsl.Atomic;
import org.xtext.example.mydsl.myDsl.Body;
import org.xtext.example.mydsl.myDsl.BooleanhType;
import org.xtext.example.mydsl.myDsl.CaseNormal;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.DefaultCase;
import org.xtext.example.mydsl.myDsl.FunctionChamada;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.FunctionType;
import org.xtext.example.mydsl.myDsl.IntType;
import org.xtext.example.mydsl.myDsl.NoPtrCases;
import org.xtext.example.mydsl.myDsl.NoPtrExpression;
import org.xtext.example.mydsl.myDsl.NoPtrSelect;
import org.xtext.example.mydsl.myDsl.NoPtrStatement;
import org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Return;
import org.xtext.example.mydsl.myDsl.ReturnExpr;
import org.xtext.example.mydsl.myDsl.StringhType;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.simple_type_specifier;
import org.xtext.example.mydsl.validation.AbstractMyDslValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  private HashSet<String> hash = new Function0<HashSet<String>>() {
    public HashSet<String> apply() {
      HashSet<String> _hashSet = new HashSet<String>();
      return _hashSet;
    }
  }.apply();
  
  /**
   * Verifica se os parametros sao declarados duas vezes com o mesmo nome
   * e se existe alguma variavel com o mesmo nome dos parametros.
   */
  @Check
  public void checkParamsFunction(final FunctionDeclaration funcao) {
    this.hash.clear();
    EList<Parameter> _params = funcao.getParams();
    for (final Parameter symbol : _params) {
      {
        final String nome = symbol.getName();
        boolean _contains = this.hash.contains(nome);
        if (_contains) {
          Type _type = symbol.getType();
          simple_type_specifier _sts = _type.getSts();
          String _name = _sts.getName();
          String _plus = ("Parameter \'" + _name);
          String _plus_1 = (_plus + " ");
          String _plus_2 = (_plus_1 + nome);
          String _plus_3 = (_plus_2 + "\' already exists");
          this.error(_plus_3, symbol, null, (-1));
        }
        this.hash.add(nome);
      }
    }
    NoPtrStatement _escopo = funcao.getEscopo();
    EList<VarDecl> _variaveis = _escopo.getVariaveis();
    for (final VarDecl variavel : _variaveis) {
      {
        final String nome = variavel.getName();
        boolean _contains = this.hash.contains(nome);
        if (_contains) {
          this.error((("declaration of variable \'" + nome) + "\' shadows a paramater"), variavel, null, (-1));
        }
      }
    }
  }
  
  private String row;
  
  private int ok;
  
  @Check
  public void checkFunctionAlreadyExists(final Body b) {
    this.hash.clear();
    String row2 = "";
    EList<Declaration> _declarations = b.getDeclarations();
    for (final Declaration symbol : _declarations) {
      try {
        FunctionDeclaration _funcao = symbol.getFuncao();
        String _name = _funcao.getName();
        boolean _notEquals = (!Objects.equal(_name, "null"));
        if (_notEquals) {
          FunctionDeclaration _funcao_1 = symbol.getFuncao();
          String _name_1 = _funcao_1.getName();
          String _plus = (_name_1 + "(");
          this.row = _plus;
          this.ok = 0;
          row2 = this.row;
          FunctionDeclaration _funcao_2 = symbol.getFuncao();
          EList<Parameter> _params = _funcao_2.getParams();
          for (final Parameter symb : _params) {
            {
              if ((this.ok == 1)) {
                this.row = (this.row + ",");
              }
              this.ok = 1;
              Type _type = symb.getType();
              simple_type_specifier _sts = _type.getSts();
              String v = _sts.getName();
              boolean _equals = v.equals("bool");
              if (_equals) {
                v = "int";
              }
              Type _type_1 = symb.getType();
              simple_type_specifier _sts_1 = _type_1.getSts();
              String _name_2 = _sts_1.getName();
              String _plus_1 = (row2 + _name_2);
              row2 = _plus_1;
              this.row = (this.row + v);
            }
          }
          this.row = (this.row + ")");
          row2 = (row2 + ")");
          boolean _contains = this.hash.contains(this.row);
          if (_contains) {
            FunctionDeclaration _funcao_3 = symbol.getFuncao();
            this.error((("Function \'" + row2) + "\' already exists"), _funcao_3, null, (-1));
          }
          this.hash.add(this.row);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  private boolean funcaoExiste = false;
  
  private EObject rt;
  
  @Check
  public void checkReturnOnlyOnFunction(final Return r) {
    this.funcaoExiste = false;
    EObject _eContainer = r.eContainer();
    this.rt = _eContainer;
    boolean _notEquals = (!Objects.equal(this.rt, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        if ((this.rt instanceof FunctionDeclaration)) {
          this.funcaoExiste = true;
        }
        EObject _eContainer_1 = this.rt.eContainer();
        this.rt = _eContainer_1;
      }
      boolean _notEquals_1 = (!Objects.equal(this.rt, null));
      _while = _notEquals_1;
    }
    if ((this.funcaoExiste == false)) {
      this.error("return can only be used inside of functions", r, null, (-1));
    }
  }
  
  private int t_v;
  
  @Check
  public void checkSwitchDefaults(final NoPtrSelect s) {
    this.t_v = 0;
    EList<NoPtrCases> _cases = s.getCases();
    for (final NoPtrCases c : _cases) {
      if ((c instanceof DefaultCase)) {
        this.t_v = (this.t_v + 1);
        if ((this.t_v >= 2)) {
          this.error("A switch must only at most one \'default\'.", c, null, (-1));
        }
      }
    }
  }
  
  @Check
  public void checkSwitchCases(final NoPtrSelect s) {
    NoPtrExpression _expr = s.getExpr();
    final String tipo = this.getExpressionType(_expr);
    EList<NoPtrCases> _cases = s.getCases();
    for (final NoPtrCases c : _cases) {
      if ((c instanceof CaseNormal)) {
        NoPtrExpression _expr_1 = ((CaseNormal)c).getExpr();
        final String tipo2 = this.getExpressionType(_expr_1);
        Boolean _isSameType = this.isSameType(tipo2, tipo);
        boolean _not = (!(_isSameType).booleanValue());
        if (_not) {
          this.error((((("A case rule should have the same type as the switch, expected \'" + tipo) + "\' found \'") + tipo2) + "\'"), c, null, (-1));
        }
      }
    }
  }
  
  private EObject rt2;
  
  private EObject rt4;
  
  private Variable v;
  
  private FunctionDeclaration rt3;
  
  private String tipoCRT;
  
  private String tipoCRT2;
  
  @Check
  public void checkReturnTypeFunction(final Return r) {
    EObject _eContainer = r.eContainer();
    this.rt2 = _eContainer;
    NoPtrExpression _rettype = r.getRettype();
    if ((_rettype instanceof NoPtrExpression)) {
      NoPtrExpression _rettype_1 = r.getRettype();
      final String tipo = this.getExpressionType(_rettype_1);
      boolean _notEquals = (!Objects.equal(this.rt2, null));
      boolean _while = _notEquals;
      while (_while) {
        {
          if ((this.rt2 instanceof FunctionDeclaration)) {
            this.tipoCRT = tipo;
            Type _type = ((FunctionDeclaration)this.rt2).getType();
            simple_type_specifier _sts = _type.getSts();
            String _name = _sts.getName();
            this.tipoCRT2 = _name;
            System.out.println(("Tipo 1" + this.tipoCRT));
            System.out.println(("Tipo 2" + this.tipoCRT2));
            boolean _equals = this.tipoCRT2.equals("void");
            if (_equals) {
              this.error("A \'void\' function should not have a return", r, null, (-1));
            } else {
              boolean _equals_1 = this.tipoCRT.equals("No Type Found");
              if (_equals_1) {
                this.error("Your variable was not declared, neither is an argument.", r, null, (-1));
              } else {
                Boolean _isSameType = this.isSameType(this.tipoCRT2, this.tipoCRT);
                boolean _not = (!(_isSameType).booleanValue());
                if (_not) {
                  this.error((((("Return type mismatch, expected \'" + this.tipoCRT2) + "\' found \'") + this.tipoCRT) + "\'."), r, null, (-1));
                }
              }
            }
          }
          EObject _eContainer_1 = this.rt2.eContainer();
          this.rt2 = _eContainer_1;
        }
        boolean _notEquals_1 = (!Objects.equal(this.rt2, null));
        _while = _notEquals_1;
      }
    }
  }
  
  @Check
  public void checkVariableAlreadyExists(final NoPtrStatement st) {
    this.hash.clear();
    EList<VarDecl> _variaveis = st.getVariaveis();
    for (final VarDecl variavel : _variaveis) {
      {
        final String nome = variavel.getName();
        boolean _contains = this.hash.contains(nome);
        if (_contains) {
          this.error((("Variable \'" + nome) + "\' already exists"), variavel, null, (-1));
        }
        this.hash.add(nome);
      }
    }
  }
  
  public String getFuncaoTipo(final FunctionType f) {
    FunctionChamada _call = f.getCall();
    return this.checkCallFunction(_call);
  }
  
  public String getExpressionTypeTerminal(final NoPtrTerminalExpression expr) {
    if ((expr instanceof Atomic)) {
      ReturnExpr _atomic = ((Atomic)expr).getAtomic();
      return this.lookUpType(_atomic);
    } else {
      NoPtrExpression _inside = expr.getInside();
      return this.getExpressionType(_inside);
    }
  }
  
  @Check
  public String getExpressionType(final NoPtrExpression expr) {
    NoPtrTerminalExpression _left = expr.getLeft();
    final String g1 = this.getExpressionTypeTerminal(_left);
    String _op = expr.getOp();
    if ((_op instanceof String)) {
      NoPtrTerminalExpression _right = expr.getRight();
      final String g2 = this.getExpressionTypeTerminal(_right);
      boolean _or = false;
      String _op_1 = expr.getOp();
      boolean _equals = _op_1.equals("||");
      if (_equals) {
        _or = true;
      } else {
        String _op_2 = expr.getOp();
        boolean _equals_1 = _op_2.equals("&&");
        _or = (_equals || _equals_1);
      }
      if (_or) {
        boolean _or_1 = false;
        Boolean _isSameType = this.isSameType(g1, "bool");
        boolean _not = (!(_isSameType).booleanValue());
        if (_not) {
          _or_1 = true;
        } else {
          Boolean _isSameType_1 = this.isSameType(g2, "bool");
          boolean _not_1 = (!(_isSameType_1).booleanValue());
          _or_1 = (_not || _not_1);
        }
        if (_or_1) {
          this.error((((("A logical operation should be between booleans, found \'(" + g1) + ",") + g2) + ")\'"), expr, null, (-1));
        }
      } else {
        Boolean _isSameType_2 = this.isSameType(g1, g2);
        boolean _not_2 = (!(_isSameType_2).booleanValue());
        if (_not_2) {
          this.error((((("A comparison should between same types, but found \'" + g1) + "\' and \'") + g2) + "\'"), expr, null, (-1));
        }
      }
      return "bool";
    } else {
      return g1;
    }
  }
  
  private Body st2;
  
  public Boolean isSameType(final String a, final String b) {
    boolean _or = false;
    boolean _equals = a.equals("int");
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = a.equals("bool");
      _or = (_equals || _equals_1);
    }
    if (_or) {
      boolean _or_1 = false;
      boolean _equals_2 = b.equals("int");
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = b.equals("bool");
        _or_1 = (_equals_2 || _equals_3);
      }
      return Boolean.valueOf(_or_1);
    }
    return Boolean.valueOf(a.equals(b));
  }
  
  private FunctionDeclaration st3;
  
  private EObject ret2;
  
  public String lookUpType(final ReturnExpr d) {
    if ((d instanceof IntType)) {
      return "int";
    } else {
      if ((d instanceof BooleanhType)) {
        return "bool";
      } else {
        if ((d instanceof StringhType)) {
          return "string";
        } else {
          if ((d instanceof FunctionType)) {
            return this.getFuncaoTipo(((FunctionType)d));
          } else {
            if ((d instanceof Variable)) {
              this.ret2 = d;
              boolean _while = (!((this.ret2 instanceof FunctionDeclaration) || (this.ret2 instanceof Body)));
              while (_while) {
                EObject _eContainer = this.ret2.eContainer();
                this.ret2 = _eContainer;
                _while = (!((this.ret2 instanceof FunctionDeclaration) || (this.ret2 instanceof Body)));
              }
              if ((this.ret2 instanceof FunctionDeclaration)) {
                this.st3 = ((FunctionDeclaration)this.ret2);
                EList<Parameter> _params = this.st3.getParams();
                for (final Parameter p : _params) {
                  String _name = p.getName();
                  String _name_1 = ((Variable)d).getName();
                  boolean _equals = _name.equals(_name_1);
                  if (_equals) {
                    Type _type = p.getType();
                    simple_type_specifier _sts = _type.getSts();
                    return _sts.getName();
                  }
                }
                NoPtrStatement _escopo = this.st3.getEscopo();
                EList<VarDecl> _variaveis = _escopo.getVariaveis();
                for (final VarDecl v : _variaveis) {
                  String _name_2 = v.getName();
                  String _name_3 = ((Variable)d).getName();
                  boolean _equals_1 = _name_2.equals(_name_3);
                  if (_equals_1) {
                    Type _type_1 = v.getType();
                    simple_type_specifier _sts_1 = _type_1.getSts();
                    return _sts_1.getName();
                  }
                }
              }
              boolean _while_1 = (!(this.ret2 instanceof Body));
              while (_while_1) {
                EObject _eContainer = this.ret2.eContainer();
                this.ret2 = _eContainer;
                _while_1 = (!(this.ret2 instanceof Body));
              }
              if ((this.ret2 instanceof Body)) {
                this.st2 = ((Body)this.ret2);
                EList<Declaration> _declarations = this.st2.getDeclarations();
                for (final Declaration d2 : _declarations) {
                  try {
                    VarDecl _variaveis_1 = d2.getVariaveis();
                    String _name_4 = _variaveis_1.getName();
                    String _name_5 = ((Variable)d).getName();
                    boolean _equals_2 = _name_4.equals(_name_5);
                    if (_equals_2) {
                      VarDecl _variaveis_2 = d2.getVariaveis();
                      Type _type_2 = _variaveis_2.getType();
                      simple_type_specifier _sts_2 = _type_2.getSts();
                      return _sts_2.getName();
                    }
                  } catch (final Throwable _t) {
                    if (_t instanceof Exception) {
                      final Exception e = (Exception)_t;
                    } else {
                      throw Exceptions.sneakyThrow(_t);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return "No Type Found";
  }
  
  private boolean ccffound;
  
  private String gotmsg;
  
  private Body st;
  
  private EObject ret;
  
  private String auxp;
  
  private String fName;
  
  private String fName2;
  
  private boolean auxp2;
  
  @Check
  public String checkCallFunction(final FunctionChamada f) {
    this.ccffound = false;
    this.fName = "";
    this.ret = f;
    boolean _while = (!(this.ret instanceof Body));
    while (_while) {
      EObject _eContainer = this.ret.eContainer();
      this.ret = _eContainer;
      _while = (!(this.ret instanceof Body));
    }
    if ((this.ret instanceof Body)) {
      this.st = ((Body)this.ret);
    }
    String _name = f.getName();
    String _plus = ("There is no function \'" + _name);
    String _plus_1 = (_plus + "(");
    this.gotmsg = _plus_1;
    String _name_1 = f.getName();
    String _plus_2 = (_name_1 + "(");
    this.fName = _plus_2;
    EList<ReturnExpr> _params = f.getParams();
    for (final ReturnExpr d : _params) {
      {
        if (this.ccffound) {
          this.fName = (this.fName + ", ");
          this.gotmsg = (this.gotmsg + ", ");
        }
        this.ccffound = true;
        String _lookUpType = this.lookUpType(d);
        this.auxp = _lookUpType;
        boolean _equals = this.auxp.equals("No Type Found");
        if (_equals) {
          this.error("This variable is not defined", d, null, (-1));
          this.auxp = "Unknown-Type";
        }
        this.fName = (this.fName + this.auxp);
        this.gotmsg = (this.gotmsg + this.auxp);
      }
    }
    this.fName = (this.fName + ")");
    this.gotmsg = (this.gotmsg + ")");
    this.ccffound = false;
    EList<Declaration> _declarations = this.st.getDeclarations();
    for (final Declaration d_1 : _declarations) {
      try {
        String _name_2 = f.getName();
        FunctionDeclaration _funcao = d_1.getFuncao();
        String _name_3 = _funcao.getName();
        boolean _equals = _name_2.equals(_name_3);
        if (_equals) {
          EList<ReturnExpr> _params_1 = f.getParams();
          int _size = _params_1.size();
          FunctionDeclaration _funcao_1 = d_1.getFuncao();
          EList<Parameter> _params_2 = _funcao_1.getParams();
          int _size_1 = _params_2.size();
          boolean _equals_1 = (_size == _size_1);
          if (_equals_1) {
            this.auxp2 = false;
            FunctionDeclaration _funcao_2 = d_1.getFuncao();
            String _name_4 = _funcao_2.getName();
            String _plus_3 = (_name_4 + "(");
            this.fName2 = _plus_3;
            FunctionDeclaration _funcao_3 = d_1.getFuncao();
            EList<Parameter> _params_3 = _funcao_3.getParams();
            for (final Parameter p : _params_3) {
              {
                if (this.auxp2) {
                  this.fName2 = (this.fName2 + ", ");
                }
                this.auxp2 = true;
                Type _type = p.getType();
                simple_type_specifier _sts = _type.getSts();
                String _name_5 = _sts.getName();
                String _plus_4 = (this.fName2 + _name_5);
                this.fName2 = _plus_4;
              }
            }
            this.fName2 = (this.fName2 + ")");
            boolean _equals_2 = this.fName.equals(this.fName2);
            if (_equals_2) {
              FunctionDeclaration _funcao_4 = d_1.getFuncao();
              Type _type = _funcao_4.getType();
              simple_type_specifier _sts = _type.getSts();
              return _sts.getName();
            }
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    if ((!this.ccffound)) {
      this.error(this.gotmsg, f, null, (-1));
    }
    return "Unknown-Type";
  }
  
  @Check
  public void checkVariableAlreadyExistsBody(final Body st) {
    this.hash.clear();
    EList<Declaration> _declarations = st.getDeclarations();
    for (final Declaration variavel : _declarations) {
      try {
        VarDecl _variaveis = variavel.getVariaveis();
        final String nome = _variaveis.getName();
        boolean _contains = this.hash.contains(nome);
        if (_contains) {
          VarDecl _variaveis_1 = variavel.getVariaveis();
          this.error((("Variable \'" + nome) + "\' already exists"), _variaveis_1, null, (-1));
        }
        this.hash.add(nome);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
}
