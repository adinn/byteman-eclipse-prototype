/*
* generated by Xtext
*/
package org.jboss.byteman.eclipse;

import org.eclipse.xtext.junit.GlobalRegistries;
import org.eclipse.xtext.junit.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;

import com.google.inject.Injector;

public class BytemanInjectorProvider implements IInjectorProvider, IRegistryConfigurator {
	private GlobalStateMemento globalStateMemento;
	private Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}
	
	public Injector getInjector() {
		if (injector == null) {
			this.injector = new BytemanStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public void restoreRegistry() {
		globalStateMemento.restoreGlobalState();
	}

	public void setupRegistry() {
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
	}
	
}
