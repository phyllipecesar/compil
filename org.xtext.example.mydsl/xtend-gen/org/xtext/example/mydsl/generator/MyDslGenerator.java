/**
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Atomic;
import org.xtext.example.mydsl.myDsl.BooleanhType;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.IntType;
import org.xtext.example.mydsl.myDsl.NoPtrExpression;
import org.xtext.example.mydsl.myDsl.NoPtrMudanca;
import org.xtext.example.mydsl.myDsl.NoPtrStatement;
import org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Return;
import org.xtext.example.mydsl.myDsl.ReturnExpr;
import org.xtext.example.mydsl.myDsl.StringhType;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.impl.NoPtrMudancaImpl;
import org.xtext.example.mydsl.myDsl.impl.ReturnImpl;
import org.xtext.example.mydsl.myDsl.impl.VarDeclImpl;
import org.xtext.example.mydsl.myDsl.simple_type_specifier;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator {
  private int regCounter = 0;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String code = "";
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<FunctionDeclaration> _filter = Iterables.<FunctionDeclaration>filter(_iterable, FunctionDeclaration.class);
    for (final FunctionDeclaration declaration : _filter) {
      {
        String _compile = this.compile(declaration);
        String _plus = (code + _compile);
        code = _plus;
        this.regCounter = (this.regCounter + 1);
      }
    }
    fsa.generateFile("gen.asm", code);
  }
  
  public String compile(final VarDecl variavel) {
    String ret = "";
    ReturnExpr _expr = variavel.getExpr();
    boolean _equals = Objects.equal(_expr, null);
    if (_equals) {
      ret = (("LD R" + Integer.valueOf(this.regCounter)) + ", #");
      Type _type = variavel.getType();
      simple_type_specifier _sts = _type.getSts();
      String _name = _sts.getName();
      String _plus = ("Type GEN: " + _name);
      System.out.println(_plus);
      Type _type_1 = variavel.getType();
      simple_type_specifier _sts_1 = _type_1.getSts();
      String _name_1 = _sts_1.getName();
      boolean _equals_1 = Objects.equal(_name_1, "int");
      if (_equals_1) {
        ret = (ret + "0");
      } else {
        Type _type_2 = variavel.getType();
        simple_type_specifier _sts_2 = _type_2.getSts();
        String _name_2 = _sts_2.getName();
        boolean _equals_2 = Objects.equal(_name_2, "string");
        if (_equals_2) {
          ret = (ret + "\"\"");
        } else {
          Type _type_3 = variavel.getType();
          simple_type_specifier _sts_3 = _type_3.getSts();
          String _name_3 = _sts_3.getName();
          boolean _equals_3 = Objects.equal(_name_3, "bool");
          if (_equals_3) {
            ret = (ret + "false");
          } else {
            ret = (ret + "null");
          }
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(ret, "");
    _builder.newLineIfNotEmpty();
    ReturnExpr _expr_1 = variavel.getExpr();
    String _compile = this.compile(_expr_1);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    _builder.append("ST ");
    String _name_4 = variavel.getName();
    _builder.append(_name_4, "");
    _builder.append(", R");
    _builder.append(this.regCounter, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String compile(final Parameter variavel) {
    String ret = "";
    ReturnExpr _expr = variavel.getExpr();
    boolean _equals = Objects.equal(_expr, null);
    if (_equals) {
      ret = (("LD R" + Integer.valueOf(this.regCounter)) + ", #");
      Type _type = variavel.getType();
      simple_type_specifier _sts = _type.getSts();
      String _name = _sts.getName();
      String _plus = ("Type GEN: " + _name);
      System.out.println(_plus);
      Type _type_1 = variavel.getType();
      simple_type_specifier _sts_1 = _type_1.getSts();
      String _name_1 = _sts_1.getName();
      boolean _equals_1 = Objects.equal(_name_1, "int");
      if (_equals_1) {
        ret = (ret + "0");
      } else {
        Type _type_2 = variavel.getType();
        simple_type_specifier _sts_2 = _type_2.getSts();
        String _name_2 = _sts_2.getName();
        boolean _equals_2 = Objects.equal(_name_2, "string");
        if (_equals_2) {
          ret = (ret + "\"\"");
        } else {
          Type _type_3 = variavel.getType();
          simple_type_specifier _sts_3 = _type_3.getSts();
          String _name_3 = _sts_3.getName();
          boolean _equals_3 = Objects.equal(_name_3, "bool");
          if (_equals_3) {
            ret = (ret + "false");
          } else {
            ret = (ret + "null");
          }
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(ret, "");
    _builder.newLineIfNotEmpty();
    ReturnExpr _expr_1 = variavel.getExpr();
    String _compile = this.compile(_expr_1);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    _builder.append("ST ");
    String _name_4 = variavel.getName();
    _builder.append(_name_4, "");
    _builder.append(", R");
    _builder.append(this.regCounter, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String compile(final IntType tipo) {
    String valor = "0";
    boolean _equals = Objects.equal(tipo, null);
    if (_equals) {
      valor = "0";
    } else {
      int _value = tipo.getValue();
      String _string = Integer.valueOf(_value).toString();
      valor = _string;
    }
    return ((("LD R" + Integer.valueOf(this.regCounter)) + ", #") + valor);
  }
  
  public String compile(final BooleanhType tipo) {
    String valor = "false";
    boolean _equals = Objects.equal(tipo, null);
    if (_equals) {
      valor = "false";
    } else {
      String _value = tipo.getValue();
      String _string = _value.toString();
      valor = _string;
    }
    return ((("LD R" + Integer.valueOf(this.regCounter)) + ", #") + valor);
  }
  
  public String compile(final StringhType tipo) {
    String valor = "\"\"";
    boolean _equals = Objects.equal(tipo, null);
    if (_equals) {
      valor = "\"\"";
    } else {
      String _value = tipo.getValue();
      String _plus = ("\"" + _value);
      String _plus_1 = (_plus + "\"");
      valor = _plus_1;
    }
    return ((("LD R" + Integer.valueOf(this.regCounter)) + ", #") + valor);
  }
  
  public String compile(final Variable expr) {
    ReturnExpr _expr = expr.getExpr();
    boolean _equals = Objects.equal(_expr, null);
    if (_equals) {
      String _name = expr.getName();
      return ((("LD R" + Integer.valueOf(this.regCounter)) + ", ") + _name);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      ReturnExpr _expr_1 = expr.getExpr();
      String _compile = this.compile(_expr_1);
      _builder.append(_compile, "");
      _builder.newLineIfNotEmpty();
      _builder.append("ST ");
      String _name_1 = expr.getName();
      _builder.append(_name_1, "");
      _builder.append(", R");
      _builder.append(this.regCounter, "");
      _builder.newLineIfNotEmpty();
      _builder.append("LD R");
      _builder.append(this.regCounter, "");
      _builder.append(", ");
      String _name_2 = expr.getName();
      _builder.append(_name_2, "");
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    }
  }
  
  public String compile(final ReturnExpr expr) {
    if ((expr instanceof BooleanhType)) {
      BooleanhType _cast = BooleanhType.class.cast(expr);
      return this.compile(_cast);
    } else {
      if ((expr instanceof IntType)) {
        IntType _cast_1 = IntType.class.cast(expr);
        return this.compile(_cast_1);
      } else {
        if ((expr instanceof StringhType)) {
          StringhType _cast_2 = StringhType.class.cast(expr);
          return this.compile(_cast_2);
        } else {
          if ((expr instanceof Variable)) {
            Variable _cast_3 = Variable.class.cast(expr);
            return this.compile(_cast_3);
          }
        }
      }
    }
    boolean _equals = Objects.equal(expr, null);
    if (_equals) {
    }
    return "";
  }
  
  public String compile(final NoPtrMudanca mud) {
    NoPtrExpression _expr = mud.getExpr();
    boolean _notEquals = (!Objects.equal(_expr, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      NoPtrExpression _expr_1 = mud.getExpr();
      String _compile = this.compile(_expr_1);
      _builder.append(_compile, "");
      _builder.newLineIfNotEmpty();
      _builder.append("ST ");
      String _name = mud.getName();
      _builder.append(_name, "");
      _builder.append(", R");
      _builder.append(this.regCounter, "");
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } else {
      return "";
    }
  }
  
  public String compile(final NoPtrStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EObject> _eContents = statement.eContents();
      for(final EObject decl : _eContents) {
        {
          if ((decl instanceof VarDecl)) {
            VarDeclImpl _cast = VarDeclImpl.class.cast(decl);
            String _compile = this.compile(_cast);
            _builder.append(_compile, "");
            _builder.newLineIfNotEmpty();
          } else {
            if ((decl instanceof NoPtrMudanca)) {
              NoPtrMudancaImpl _cast_1 = NoPtrMudancaImpl.class.cast(decl);
              String _compile_1 = this.compile(_cast_1);
              _builder.append(_compile_1, "");
              _builder.newLineIfNotEmpty();
            } else {
              if ((decl instanceof Return)) {
                ReturnImpl _cast_2 = ReturnImpl.class.cast(decl);
                String _compile_2 = this.compile(_cast_2);
                _builder.append(_compile_2, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String compile(final NoPtrTerminalExpression expr) {
    if ((expr instanceof Atomic)) {
      ReturnExpr _atomic = ((Atomic)expr).getAtomic();
      ReturnExpr _cast = ReturnExpr.class.cast(_atomic);
      return this.compile(_cast);
    }
    NoPtrExpression _inside = expr.getInside();
    return this.compile(_inside);
  }
  
  public String compile(final NoPtrExpression expr) {
    boolean _equals = Objects.equal(expr, null);
    if (_equals) {
      return "";
    } else {
      NoPtrTerminalExpression _left = expr.getLeft();
      String left = this.compile(_left);
      int reg = this.regCounter;
      String ret = "";
      String _op = expr.getOp();
      boolean _notEquals = (!Objects.equal(_op, null));
      if (_notEquals) {
        this.regCounter = (this.regCounter + 1);
        NoPtrTerminalExpression _right = expr.getRight();
        String right = this.compile(_right);
        String _op_1 = expr.getOp();
        boolean _equals_1 = Objects.equal(_op_1, "&&");
        if (_equals_1) {
          ret = ((((("AND R" + Integer.valueOf(this.regCounter)) + ", R") + Integer.valueOf(reg)) + ", R") + Integer.valueOf(this.regCounter));
        } else {
          String _op_2 = expr.getOp();
          boolean _equals_2 = Objects.equal(_op_2, "||");
          if (_equals_2) {
            ret = ((((("OR R" + Integer.valueOf(this.regCounter)) + ", R") + Integer.valueOf(reg)) + ", R") + Integer.valueOf(this.regCounter));
          } else {
            String _op_3 = expr.getOp();
            boolean _equals_3 = Objects.equal(_op_3, "==");
            if (_equals_3) {
              ret = ((((("CMP R" + Integer.valueOf(this.regCounter)) + ", R") + Integer.valueOf(reg)) + ", R") + Integer.valueOf(this.regCounter));
            } else {
              String _op_4 = expr.getOp();
              boolean _equals_4 = Objects.equal(_op_4, "!=");
              if (_equals_4) {
                ret = ((((("CMP R" + Integer.valueOf(this.regCounter)) + ", R") + Integer.valueOf(reg)) + ", R") + Integer.valueOf(this.regCounter));
                ret = ((((ret + "\nNOT R") + Integer.valueOf(this.regCounter)) + ", R") + Integer.valueOf(this.regCounter));
              }
            }
          }
        }
        ret = ((right + "\n") + ret);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(left, "");
      _builder.newLineIfNotEmpty();
      _builder.append(ret, "");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    }
  }
  
  public String compile(final Return ret) {
    String antigo = "";
    NoPtrExpression _rettype = ret.getRettype();
    boolean _notEquals = (!Objects.equal(_rettype, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      NoPtrExpression _rettype_1 = ret.getRettype();
      String _compile = this.compile(_rettype_1);
      _builder.append(_compile, "");
      _builder.newLineIfNotEmpty();
      _builder.append("LD RET, R");
      _builder.append(this.regCounter, "");
      _builder.newLineIfNotEmpty();
      antigo = _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(antigo, "");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("BR *0(SP)");
    _builder_1.newLine();
    return _builder_1.toString();
  }
  
  public String getNameFunction(final FunctionDeclaration funcao) {
    String _name = funcao.getName();
    String nome = (_name + "(");
    int ok = 0;
    EList<Parameter> _params = funcao.getParams();
    for (final Parameter symb : _params) {
      {
        if ((ok == 1)) {
          nome = (nome + ",");
        }
        ok = 1;
        Type _type = symb.getType();
        simple_type_specifier _sts = _type.getSts();
        String _name_1 = _sts.getName();
        String _plus = (nome + _name_1);
        nome = _plus;
      }
    }
    nome = (nome + ")");
    return nome;
  }
  
  public String compile(final FunctionDeclaration functionDecl) {
    StringConcatenation _builder = new StringConcatenation();
    String _nameFunction = this.getNameFunction(functionDecl);
    _builder.append(_nameFunction, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    {
      EList<Parameter> _params = functionDecl.getParams();
      for(final Parameter decl : _params) {
        String _compile = this.compile(decl);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
      }
    }
    NoPtrStatement _escopo = functionDecl.getEscopo();
    String _compile_1 = this.compile(_escopo);
    _builder.append(_compile_1, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
