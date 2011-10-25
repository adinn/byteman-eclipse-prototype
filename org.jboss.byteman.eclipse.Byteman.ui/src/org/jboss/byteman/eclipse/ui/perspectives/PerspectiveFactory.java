package org.jboss.byteman.eclipse.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Provide the Byteman perspective
 * Implements IPerspectiveFactory
 * @author Rebecca Simmonds 072624867
 *
 */
public class PerspectiveFactory implements IPerspectiveFactory {

	private static final String VIEW_ID = "org.jboss.byteman.eclipse.views.BytemanView";
	private static final String NAVIGATOR_ID= "org.jboss.byteman.eclipse.navigator";


	private static final String BOTTOM = "bottom";

	/**
	 * nothign special needed just now
	 */
	@Override
	public void createInitialLayout(IPageLayout layout) {
	}
}
