/*
 * generated by Xtext 2.25.0
 */
package org.rm2pt.sample.basicfamily.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/rm2pt/sample/basicfamily/parser/antlr/internal/InternalDsl.tokens");
	}
}
