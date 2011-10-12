package org.jboss.byteman.eclipse.validation;

import org.eclipse.xtext.validation.Check;
import org.jboss.byteman.eclipse.byteman.BytemanPackage;
import org.jboss.byteman.eclipse.byteman.BytemanRule;
import org.jboss.byteman.eclipse.byteman.EventClass;
 

public class BytemanJavaValidator extends AbstractBytemanJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	@Check
	public void checkBytemanClass(EventClass eventClass)
	{
		String name = eventClass.getName();
	}
}
