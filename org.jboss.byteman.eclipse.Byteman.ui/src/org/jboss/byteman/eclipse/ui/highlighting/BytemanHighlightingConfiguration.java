/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat and individual contributors as identified
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 * 
 * @authors Rebecca Simmonds, Andrew Dinn
 */
package org.jboss.byteman.eclipse.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Configures the highlighting as well as the acceptor and IDs
 * Implements IHighlightingConfiguration
 * @author Rebecca Simmonds 072624867
 * 
 */
public class BytemanHighlightingConfiguration implements
		IHighlightingConfiguration {

	//ID strings for calculator
	
	public static String EVENTKEYWORDHL ="EVENTKEYWORDHL";
	public static String EVENTSPECHL ="EVENTSPECHL";
	public static  String RULEKEYWORDHL ="RULEKEYWORDHL";
	public static  String RULENAMEHL ="RULENAMEHL";
	public static  String BINDHL ="BINDHL";
	public static  String CONDHL ="CONDHL";
	public static  String ACTIONHL ="ACTIONHL";
	public static  String COMMENTHL ="COMMENTHL";

	
	/**
	 * configures the acceptor
	 * @param acceptor
	 */
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) 
	{
		 acceptor.acceptDefaultHighlighting(EVENTKEYWORDHL,
			      "event keyword type", event());
		 acceptor.acceptDefaultHighlighting(EVENTSPECHL,
			      "event spec type", eventname());
		 acceptor.acceptDefaultHighlighting(RULEKEYWORDHL,
			      "rule keyword type", rule());
		 acceptor.acceptDefaultHighlighting(RULENAMEHL,
			      "rule name type", rulename());
		 acceptor.acceptDefaultHighlighting(BINDHL,
			      "binding type", binding());
		 acceptor.acceptDefaultHighlighting(CONDHL,
			      "condition type", condition());
		 acceptor.acceptDefaultHighlighting(ACTIONHL,
			      "action type", action());
		 acceptor.acceptDefaultHighlighting(COMMENTHL,
			      "comment type", comment());
	}
	/**
	 * Provides the style for the comments
	 * @return TextStyle
	 */
	public TextStyle comment()
	{
		TextStyle textStyle = new TextStyle();
	    textStyle.setColor(new RGB(63, 127, 95));
	  	return textStyle;
	}
	/**
	 * Provides style for the events
	 * @return TextStyle
	 */
	public TextStyle event() 
	{
			TextStyle textStyle = new TextStyle();
		    textStyle.setColor(new RGB(211, 95, 32));
		    textStyle.setStyle(SWT.BOLD);
		    return textStyle;
		
	  }
	/**
	 * Provides style for the events
	 * @return TextStyle
	 */
	public TextStyle eventname() 
	{
			TextStyle textStyle = new TextStyle();
		    textStyle.setColor(new RGB(211, 95, 32));
		    textStyle.setStyle(SWT.BOLD|SWT.ITALIC);
		    return textStyle;
		
	  }
	/**
	 * Provides the style for the rule keywords
	 * @return TextStyle
	 */
	public TextStyle rule()
	{
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(63, 127, 255));
	    textStyle.setStyle(SWT.BOLD);
	    return textStyle;
	}
	/**
	 * Provides the style for the rule names
	 * @return TextStyle
	 */
	public TextStyle rulename()
	{
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(63, 127, 255));
	    textStyle.setStyle(SWT.BOLD|SWT.ITALIC);
	    return textStyle;
	}
	/**
	 * Provides the style for the condition
	 * @return TextStyle
	 */
	public TextStyle binding()
	{
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(63, 127, 127));
	    textStyle.setStyle(SWT.BOLD);
	    return textStyle;
	}
	/**
	 * Provides the style for the condition
	 * @return TextStyle
	 */
	public TextStyle condition()
	{
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(63, 3, 95));
	    textStyle.setStyle(SWT.BOLD);
	    return textStyle;
	}
	/**
	 * Provides the style for the action
	 * @return TextStyle
	 */
	public TextStyle action()
	{
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(255, 3, 52));
	    textStyle.setStyle(SWT.BOLD);
	    return textStyle;
	}
}
