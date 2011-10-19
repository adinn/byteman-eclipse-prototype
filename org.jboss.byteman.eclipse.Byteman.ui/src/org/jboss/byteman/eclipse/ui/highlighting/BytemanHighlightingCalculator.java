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

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.EventClass;

/**
 * This class provides the syntax highlighting by traversing the parse tree
 * pattern matching key words.
 * Implements ISemanticHighlightingCalculator
 * @author Rebecca Simmonds 072624867
 *
 */
public class BytemanHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) 
	{
		INode rootNode =  resource.getParseResult().getRootNode();
		Iterator<ILeafNode>iterator = rootNode.getLeafNodes().iterator();
		ILeafNode current = (iterator.hasNext() ? iterator.next() : null);
		while (current != null)
		{
			// prefetch next node so we can do lookahead and skipahead
			ILeafNode next = (iterator.hasNext() ? iterator.next() : null);
			String text = current.getText();
			/*
			 * comment
			 */
			if (text.startsWith("#")) {
				int start = current.getOffset();
				int length = current.getLength();
				acceptor.addPosition(start, length, BytemanHighlightingConfiguration.COMMENTHL);
			}	
			/*
			 * ignore any other hidden text
			 */
			else if (current.isHidden()) {
				// nothing to do
			}
			/*
			 * rule
			 */
			else if(text.toLowerCase().startsWith("rule "))
			{
				int start = current.getOffset();
				int length = current.getLength();
				acceptor.addPosition(start, 4, BytemanHighlightingConfiguration.RULEKEYWORDHL);
				acceptor.addPosition(start + 4, length - 4, BytemanHighlightingConfiguration.RULENAMEHL);
			}
			else if(text.toLowerCase().equals("endrule"))
			{
				int start = current.getOffset();
				int length = current.getLength();
				acceptor.addPosition(start, length, BytemanHighlightingConfiguration.RULEKEYWORDHL);
			}
			/*
			 * helper
			 */
			else if (text.equals("HELPER")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.EVENTKEYWORDHL);
				}
			}
			/*
			 * events
			 */
			else if (text.equals("CLASS")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.EVENTKEYWORDHL);
				}
			} else if (text.equals("INTERFACE")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.EVENTKEYWORDHL);
				}
			} else if (text.equals("METHOD")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.EVENTKEYWORDHL);
				}
			} else if (text.equals("AT")) {
				// skip to next real token
				while (isWhiteSpace(next)) {
					next = (iterator.hasNext() ? iterator.next() : null);
				}
				// make sure it is a legitimate following token
				if (next != null) {
					text = next.getText();
					if (text.equals("ENTRY") ||
							text.equals("EXIT") ||
							text.equals("RETURN") ||
							text.equals("READ") ||
							text.equals("WRITE") ||
							text.equals("CALL") ||
							text.equals("INVOKE") ||
							text.equals("THROW") ||
							text.equals("SYNCHRONIZE")) {
						int start = current.getOffset();
						int forwardSkip = next.getOffset() - current.getOffset();
						int length = forwardSkip + + next.getLength();
						acceptor.addPosition(start, length, BytemanHighlightingConfiguration.EVENTKEYWORDHL);
						current = next;
						next = (iterator.hasNext() ? iterator.next() : null);
					}
				}
			} else if (text.equals("AFTER")) {
				// skip to next real token
				while (isWhiteSpace(next)) {
					next = (iterator.hasNext() ? iterator.next() : null);
				}
				// make sure it is a legitimate following token
				if (next !=null) {
					text = next.getText();
					if (text.equals("READ") ||
							text.equals("WRITE") ||
							text.equals("CALL") ||
							text.equals("INVOKE") ||
							text.equals("SYNCHRONIZE")) {
						int start = current.getOffset();
						int forwardSkip = next.getOffset() - current.getOffset();
						int length = forwardSkip + + next.getLength();
						acceptor.addPosition(start, length, BytemanHighlightingConfiguration.EVENTKEYWORDHL);
						current = next;
						next = (iterator.hasNext() ? iterator.next() : null);
					}
				}
			} else if (text.equals("LINE")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.EVENTKEYWORDHL);
				}
			}
			/**
			 * bindings
			 */
			else if (text.equals("BIND")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.BINDHL);
				}
			}
			/**
			 * conditions
			 */
			else if (text.equals("IF")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.CONDHL);
				}
			}
			/**
			 * actions
			 */
			else if (text.equals("DO")) {
				// must be followed by whitespace
				if (isWhiteSpace(next)) {
					int start = current.getOffset();
					int length = current.getLength();
					acceptor.addPosition(start, length, BytemanHighlightingConfiguration.ACTIONHL);
				}
			}
			
			// move on to next token
			
			current = next;
		}
	}
	
	private boolean isWhiteSpace(ILeafNode iLeafNode)
	{
		return (iLeafNode != null && iLeafNode.getText().trim().length() == 0);
	}
}
