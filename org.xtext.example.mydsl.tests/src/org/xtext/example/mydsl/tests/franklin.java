package org.xtext.example.mydsl.tests;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.MyDslInjectorProvider;
import org.xtext.example.mydsl.myDsl.Model;
@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
public class franklin {
	@Inject private ParseHelper<Model> parseHelper;
	@Inject private IScopeProvider scopeProvider;
	
	@Test
	public void test() throws Exception {
		StringBuilder modelString = new StringBuilder();
		modelString.append("#include <cstdio>\n");
		modelString.append("int main ( ) {\n");
		modelString.append("int a;\n");
		modelString.append("}\n");
		
		Model model = parseHelper.parse(modelString);
		assertEquals("main", model.getBody().getFuncoes().get(0).getName());
		
	}

}
