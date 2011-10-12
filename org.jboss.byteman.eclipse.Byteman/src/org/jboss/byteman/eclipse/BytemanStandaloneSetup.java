
package org.jboss.byteman.eclipse;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BytemanStandaloneSetup extends BytemanStandaloneSetupGenerated{

	public static void doSetup() {
		new BytemanStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

