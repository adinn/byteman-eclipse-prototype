/*
* generated by Xtext
*/
package org.jboss.byteman.eclipse.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BytemanAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.tokens");
	}
}