package org.jboss.byteman.eclipse.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.Actions;
import org.jboss.byteman.eclipse.byteman.ActionList;
import org.jboss.byteman.eclipse.byteman.Action;
import org.jboss.byteman.eclipse.byteman.Expression;
 

public class BytemanJavaValidator extends AbstractBytemanJavaValidator {

/**
 * quick check rule to ensure that return or throw actions only occur at
 * the end of the action list
 * @param actions the parse tree element representing DO  clause
 */
	@Check
	public void checkThrowReturnActionAtEnd(Actions actions)
	{
		ActionList actionList = actions.getActionList();
		if (actionList != null) {
			EList<Action> children = actionList.getActions();
			int length = children.size();
			for (int i = 0; i <length - 1; i++) {
				Action action = children.get(i);
				if (action instanceof Expression) {
					Expression expression = (Expression) action;
					String op = expression.getOp();
					if (op != null) {
						if (op.equals("return") ||
								op.equals("RETURN")) {
							error("RETURN expression must be last in DO actions", BytemanPackage.eINSTANCE.getActions_ActionList(), i);
						} else if (op.equals("throw") ||
								op.equals("THROW")) {
							error("THROW expression must be last in DO actions", BytemanPackage.eINSTANCE.getActions_ActionList(), i);
						}
					}
				}	
			}
		}
	}
}
